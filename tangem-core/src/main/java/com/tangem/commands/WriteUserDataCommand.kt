package com.tangem.commands

import com.tangem.SessionEnvironment
import com.tangem.TangemError
import com.tangem.TangemSdkError
import com.tangem.common.apdu.CommandApdu
import com.tangem.common.apdu.Instruction
import com.tangem.common.apdu.ResponseApdu
import com.tangem.common.tlv.TlvBuilder
import com.tangem.common.tlv.TlvDecoder
import com.tangem.common.tlv.TlvTag

class WriteUserDataResponse(
        /**
         * CID, Unique Tangem card ID number.
         */
        val cardId: String
) : CommandResponse

/**
 * This command writes to the card any of User_Data, User_ProtectedData, User_Counter and User_ProtectedCounter fields.
 * User_Data and User_ProtectedData are never changed or parsed by the executable code the Tangem COS.
 * The App defines purpose of use, format and it's payload. For example, this field may contain cashed information
 * from blockchain to accelerate preparing new transaction.
 * User_Counter and User_ProtectedCounter are counters, that initial values can be set by App and increased on every signing
 * of new transaction (on SIGN command that calculate new signatures). The App defines purpose of use.
 * For example, this fields may contain blockchain nonce value.
 *
 * Writing of User_Counter and User_Data protected only by PIN1.
 * User_ProtectedCounter and User_ProtectedData additionaly need PIN2 to confirmation.
 */
class WriteUserDataCommand(private val userData: ByteArray? = null, private val userProtectedData: ByteArray? = null,
                           private val userCounter: Int? = null,
                           private val userProtectedCounter: Int? = null) : Command<WriteUserDataResponse>() {

    override val requiresPin2 = true

    override fun performPreCheck(card: Card): TangemSdkError? {
        if (card.status == CardStatus.NotPersonalized) {
            return TangemSdkError.NotPersonalized()
        }
        if (card.isActivated) {
            return TangemSdkError.NotActivated()
        }
        if (userData?.size ?: 0 > MAX_SIZE || userProtectedData?.size ?: 0 > MAX_SIZE) {
            return TangemSdkError.DataSizeTooLarge()
        }
        return null
    }

    override fun mapError(card: Card?, error: TangemError): TangemError {
        if (error is TangemSdkError.InvalidParams) {
            return TangemSdkError.Pin2OrCvcRequired()
        }
        return error
    }

    override fun serialize(environment: SessionEnvironment): CommandApdu {
        val builder = TlvBuilder()
        builder.append(TlvTag.CardId, environment.card?.cardId)
        builder.append(TlvTag.Pin, environment.pin1?.value)
        builder.append(TlvTag.UserData, userData)
        builder.append(TlvTag.UserCounter, userCounter)
        builder.append(TlvTag.UserProtectedData, userProtectedData)
        builder.append(TlvTag.UserProtectedCounter, userProtectedCounter)
        if (userProtectedCounter != null || userProtectedData != null) {
            builder.append(TlvTag.Pin2, environment.pin2?.value)
        }

        return CommandApdu(Instruction.WriteUserData, builder.serialize())
    }

    override fun deserialize(environment: SessionEnvironment, apdu: ResponseApdu): WriteUserDataResponse {
        val tlvData = apdu.getTlvData() ?: throw TangemSdkError.DeserializeApduFailed()

        return WriteUserDataResponse(TlvDecoder(tlvData).decode(TlvTag.CardId))
    }

    companion object{
        const val MAX_SIZE = 512
    }
}