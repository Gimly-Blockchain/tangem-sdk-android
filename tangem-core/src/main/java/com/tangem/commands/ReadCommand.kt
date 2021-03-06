package com.tangem.commands

import com.google.gson.annotations.SerializedName
import com.tangem.SessionEnvironment
import com.tangem.TangemError
import com.tangem.TangemSdkError
import com.tangem.commands.common.CardDeserializer
import com.tangem.common.apdu.CommandApdu
import com.tangem.common.apdu.Instruction
import com.tangem.common.apdu.ResponseApdu
import com.tangem.common.tlv.TlvBuilder
import com.tangem.common.tlv.TlvTag
import java.util.*

/**
 * Determines which type of data is required for signing.
 */
data class SigningMethodMask(val rawValue: Int) {

    fun contains(signingMethod: SigningMethod): Boolean {
        return if (rawValue and 0x80 == 0) {
            signingMethod.code == rawValue
        } else {
            rawValue and (0x01 shl signingMethod.code) != 0
        }
    }
}

enum class SigningMethod(val code: Int) {
    SignHash(0),
    SignRaw(1),
    SignHashSignedByIssuer(2),
    SignRawSignedByIssuer(3),
    SignHashSignedByIssuerAndUpdateIssuerData(4),
    SignRawSignedByIssuerAndUpdateIssuerData(5),
    SignPos(6)
}

class SigningMethodMaskBuilder() {

    private val signingMethods = mutableSetOf<SigningMethod>()

    fun add(signingMethod: SigningMethod) {
        signingMethods.add(signingMethod)
    }

    fun build(): SigningMethodMask {
        val rawValue: Int = when {
            signingMethods.count() == 0 -> {
                0
            }
            signingMethods.count() == 1 -> {
                signingMethods.iterator().next().code
            }
            else -> {
                signingMethods.fold(
                        0x80, { acc, singingMethod -> acc + (0x01 shl singingMethod.code) }
                )
            }
        }
        return SigningMethodMask(rawValue)
    }
}

/**
 * Elliptic curve used for wallet key operations.
 */
enum class EllipticCurve(val curve: String) {
    @SerializedName(value = "secp256k1")
    Secp256k1("secp256k1"),
    @SerializedName(value = "ed25519")
    Ed25519("ed25519");

    companion object {
        private val values = values()
        fun byName(curve: String): EllipticCurve? = values.find { it.curve == curve }
    }
}

/**
 * Status of the card and its wallet.
 */
enum class CardStatus(val code: Int) {
    NotPersonalized(0),
    Empty(1),
    Loaded(2),
    Purged(3);

    companion object {
        private val values = values()
        fun byCode(code: Int): CardStatus? = values.find { it.code == code }
    }
}

/**
 * Mask of products enabled on card
 * @property rawValue Products mask values,
 * while flags definitions and values are in [ProductMask.Companion] as constants.
 */
data class ProductMask(val rawValue: Int) {

    fun contains(product: Product): Boolean = (rawValue and product.code) != 0

}

enum class Product(val code: Int) {
    Note(0x01),
    Tag(0x02),
    IdCard(0x04),
    IdIssuer(0x08)
}

class ProductMaskBuilder() {

    private var productMaskValue = 0

    fun add(product: Product) {
        productMaskValue = productMaskValue or product.code
    }

    fun build() = ProductMask(productMaskValue)

}

/**
 * Stores and maps Tangem card settings.
 *
 * @property rawValue Card settings in a form of flags,
 * while flags definitions and possible values are in [Settings].
 */
data class SettingsMask(val rawValue: Int) {
    fun contains(settings: Settings): Boolean = (rawValue and settings.code) != 0
}

enum class Settings(val code: Int) {
    IsReusable(0x0001),
    UseActivation(0x0002),
    ProhibitPurgeWallet(0x0004),
    UseBlock(0x0008),

    AllowSetPIN1(0x0010),
    AllowSetPIN2(0x0020),
    UseCvc(0x0040),
    ProhibitDefaultPIN1(0x0080),

    UseOneCommandAtTime(0x0100),
    UseNDEF(0x0200),
    UseDynamicNDEF(0x0400),
    SmartSecurityDelay(0x0800),

    AllowUnencrypted(0x1000),
    AllowFastEncryption(0x2000),

    ProtectIssuerDataAgainstReplay(0x4000),
    RestrictOverwriteIssuerExtraData(0x00100000),

    AllowSelectBlockchain(0x8000),

    DisablePrecomputedNDEF(0x00010000),

    SkipSecurityDelayIfValidatedByLinkedTerminal(0x00080000),
    SkipCheckPIN2CVCIfValidatedByIssuer(0x00040000),
    SkipSecurityDelayIfValidatedByIssuer(0x00020000),

    RequireTermTxSignature(0x01000000),
    RequireTermCertSignature(0x02000000),
    CheckPIN3OnCard(0x04000000)
}


class SettingsMaskBuilder() {

    private var settingsMaskValue = 0

    fun add(settings: Settings) {
        settingsMaskValue = settingsMaskValue or settings.code
    }

    fun build() = SettingsMask(settingsMaskValue)

}

/**
 * Detailed information about card contents.
 */
class CardData(

        /**
         * Tangem internal manufacturing batch ID.
         */
        val batchId: String?,

        /**
         * Timestamp of manufacturing.
         */
        val manufactureDateTime: Date?,

        /**
         * Name of the issuer.
         */
        val issuerName: String?,

        /**
         * Name of the blockchain.
         */
        val blockchainName: String?,

        /**
         * Signature of CardId with manufacturer’s private key.
         */
        val manufacturerSignature: ByteArray?,

        /**
         * Mask of products enabled on card.
         */
        val productMask: ProductMask?,

        /**
         * Name of the token.
         */
        val tokenSymbol: String?,

        /**
         * Smart contract address.
         */
        val tokenContractAddress: String?,

        /**
         * Number of decimals in token value.
         */
        val tokenDecimal: Int?
)

/**
 * Response for [ReadCommand]. Contains detailed card information.
 */
data class Card(

        /**
         * Unique Tangem card ID number.
         */
        val cardId: String,

        /**
         * Name of Tangem card manufacturer.
         */
        val manufacturerName: String,

        /**
         * Current status of the card.
         */
        val status: CardStatus?,

        /**
         * Version of Tangem COS.
         */
        val firmwareVersion: String?,

        /**
         * Public key that is used to authenticate the card against manufacturer’s database.
         * It is generated one time during card manufacturing.
         */
        val cardPublicKey: ByteArray?,

        /**
         * Card settings defined by personalization (bit mask: 0 – Enabled, 1 – Disabled).
         */
        val settingsMask: SettingsMask?,

        /**
         * Public key that is used by the card issuer to sign IssuerData field.
         */
        val issuerPublicKey: ByteArray?,

        /**
         * Explicit text name of the elliptic curve used for all wallet key operations.
         * Supported curves: ‘secp256k1’ and ‘ed25519’.
         */
        val curve: EllipticCurve?,

        /**
         * Total number of signatures allowed for the wallet when the card was personalized.
         */
        val maxSignatures: Int?,

        /**
         * Defines what data should be submitted to SIGN command.
         */
        val signingMethods: SigningMethodMask?,

        /**
         * Delay in seconds before COS executes commands protected by PIN2.
         */
        val pauseBeforePin2: Int?,

        /**
         * Public key of the blockchain wallet.
         */
        val walletPublicKey: ByteArray?,

        /**
         * Remaining number of [SignCommand] operations before the wallet will stop signing transactions.
         */
        val walletRemainingSignatures: Int?,

        /**
         * Total number of signed single hashes returned by the card in
         * [SignCommand] responses since card personalization.
         * Sums up array elements within all [SignCommand].
         */
        val walletSignedHashes: Int?,

        /**
         * Any non-zero value indicates that the card experiences some hardware problems.
         * User should withdraw the value to other blockchain wallet as soon as possible.
         * Non-zero Health tag will also appear in responses of all other commands.
         */
        val health: Int?,

        /**
         * Whether the card requires issuer’s confirmation of activation.
         * is "true" if the card requires activation,
         * is 'false" if the card is activated or does not require activation
         */
        val isActivated: Boolean,

        /**
         * A random challenge generated by personalisation that should be signed and returned
         * to COS by the issuer to confirm the card has been activated.
         * This field will not be returned if the card is activated.
         */
        val activationSeed: ByteArray?,

        /**
         * Returned only if [SigningMethod.SignPos] enabling POS transactions is supported by card.
         */
        val paymentFlowVersion: ByteArray?,

        /**
         * This value can be initialized by terminal and will be increased by COS on execution of every [SignCommand].
         * For example, this field can store blockchain “nonce” for quick one-touch transaction on POS terminals.
         * Returned only if [SigningMethod.SignPos]  enabling POS transactions is supported by card.
         */
        val userCounter: Int?,

        /**
         * This value can be initialized by App (with PIN2 confirmation) and will be increased by COS
         * with the execution of each [SignCommand]. For example, this field can store blockchain “nonce”
         * for a quick one-touch transaction on POS terminals. Returned only if [SigningMethod.SignPos].
         */
        val userProtectedCounter: Int?,

        /**
         * When this value is true, it means that the application is linked to the card,
         * and COS will not enforce security delay if [SignCommand] will be called
         * with [TlvTag.TerminalTransactionSignature] parameter containing a correct signature of raw data
         * to be signed made with [TlvTag.TerminalPublicKey].
         */
        val terminalIsLinked: Boolean,

        /**
         * Detailed information about card contents. Format is defined by the card issuer.
         * Cards complaint with Tangem Wallet application should have TLV format.
         */
        val cardData: CardData?,

        var isPin1Default: Boolean? = null,

        var isPin2Default: Boolean? = null

) : CommandResponse

/**
 * This command receives from the Tangem Card all the data about the card and the wallet,
 * including unique card number (CID or cardId) that has to be submitted while calling all other commands.
 */
class ReadCommand : Command<Card>() {

    override val performPreflightRead = false

    override fun mapError(card: Card?, error: TangemError): TangemError {
        if (error is TangemSdkError.InvalidParams) {
            return TangemSdkError.Pin1Required()
        }
        return error
    }

    override fun serialize(environment: SessionEnvironment): CommandApdu {
        val tlvBuilder = TlvBuilder()
        /**
         *  [SessionEnvironment] stores the pin1 value. If no pin1 value was set, it will contain
         *  default value of ‘000000’.
         *  In order to obtain card’s data, [ReadCommand] should use the correct pin 1 value.
         *  The card will not respond if wrong pin 1 has been submitted.
         */
        tlvBuilder.append(TlvTag.Pin, environment.pin1?.value)
        tlvBuilder.append(TlvTag.TerminalPublicKey, environment.terminalKeys?.publicKey)
        return CommandApdu(Instruction.Read, tlvBuilder.serialize())
    }

    override fun deserialize(environment: SessionEnvironment, apdu: ResponseApdu): Card {
        return CardDeserializer.deserialize(apdu)
    }
}