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

class CreateWalletResponse(
    /**
     * CID, Unique Tangem card ID number.
     */
    val cardId: String,
    /**
     * Current status of the card [1 - Empty, 2 - Loaded, 3- Purged]
     */
    val status: CardStatus,
    /**
     * Public key of a newly created blockchain wallet.
     */
    val walletPublicKey: ByteArray
) : CommandResponse

/**
 * This command will create a new wallet on the card having ‘Empty’ state.
 * A key pair WalletPublicKey / WalletPrivateKey is generated and securely stored in the card.
 * App will need to obtain Wallet_PublicKey from the response of [CreateWalletCommand] or [ReadCommand]
 * and then transform it into an address of corresponding blockchain wallet
 * according to a specific blockchain algorithm.
 * WalletPrivateKey is never revealed by the card and will be used by [SignCommand] and [CheckWalletCommand].
 * RemainingSignature is set to MaxSignatures.
 *
 * @property cardId CID, Unique Tangem card ID number.
 */
class CreateWalletCommand : Command<CreateWalletResponse>() {

    override val requiresPin2 = true

    override fun performPreCheck(card: Card): TangemSdkError? {
        if (card.isActivated) {
            return TangemSdkError.NotActivated()
        }

        return when (card.status) {
            CardStatus.Empty -> null
            CardStatus.NotPersonalized -> TangemSdkError.NotPersonalized()
            CardStatus.Loaded -> TangemSdkError.AlreadyCreated()
            CardStatus.Purged -> TangemSdkError.CardIsPurged()
            null -> TangemSdkError.CardError()
        }
    }

    override fun mapError(card: Card?, error: TangemError): TangemError {
        if (error is TangemSdkError.InvalidParams) {
            return TangemSdkError.Pin2OrCvcRequired()
        }
        return error
    }

    override fun serialize(environment: SessionEnvironment): CommandApdu {
        val tlvBuilder = TlvBuilder()
        tlvBuilder.append(TlvTag.Pin, environment.pin1?.value)
        tlvBuilder.append(TlvTag.CardId, environment.card?.cardId)
        tlvBuilder.append(TlvTag.Pin2, environment.pin2?.value)
        tlvBuilder.append(TlvTag.Cvc, environment.cvc)
        return CommandApdu(Instruction.CreateWallet, tlvBuilder.serialize())
    }

    override fun deserialize(
        environment: SessionEnvironment,
        apdu: ResponseApdu
    ): CreateWalletResponse {
        val tlvData = apdu.getTlvData()
            ?: throw TangemSdkError.DeserializeApduFailed()

        val decoder = TlvDecoder(tlvData)
        return CreateWalletResponse(
            cardId = decoder.decode(TlvTag.CardId),
            status = decoder.decode(TlvTag.Status),
            walletPublicKey = decoder.decode(TlvTag.WalletPublicKey)
        )
    }
}