package com.tangem.common.tlv;

import java.lang.System;

/**
 * Contains all TLV tags, with their code and descriptive name.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bT\b\u0086\u0001\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001[B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZ\u00a8\u0006\\"}, d2 = {"Lcom/tangem/common/tlv/TlvTag;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "valueType", "Lcom/tangem/common/tlv/TlvValueType;", "Unknown", "CardId", "Status", "CardPublicKey", "CardSignature", "CurveId", "HashAlgID", "SigningMethod", "MaxSignatures", "PauseBeforePin2", "SettingsMask", "CardData", "NdefData", "CreateWalletAtPersonalize", "Health", "Pin", "Pin2", "NewPin", "NewPin2", "NewPinHash", "NewPin2Hash", "Challenge", "Salt", "ValidationCounter", "Cvc", "SessionKeyA", "SessionKeyB", "Pause", "NewPin3", "CrExKey", "Uid", "ManufactureId", "ManufacturerSignature", "IssuerDataPublicKey", "IssuerTransactionPublicKey", "IssuerData", "IssuerDataSignature", "IssuerTransactionSignature", "IssuerDataCounter", "AcquirerPublicKey", "Size", "Mode", "Offset", "IsActivated", "ActivationSeed", "ResetPin", "CodePageAddress", "CodePageCount", "CodeHash", "TransactionOutHash", "TransactionOutHashSize", "TransactionOutRaw", "WalletPublicKey", "Signature", "RemainingSignatures", "SignedHashes", "Firmware", "Batch", "ManufactureDateTime", "IssuerId", "BlockchainId", "ManufacturerPublicKey", "CardIdManufacturerSignature", "ProductMask", "PaymentFlowVersion", "TokenSymbol", "TokenContractAddress", "TokenDecimal", "Denomination", "ValidatedBalance", "LastSignDate", "DenominationText", "TerminalIsLinked", "TerminalPublicKey", "TerminalTransactionSignature", "UserData", "UserProtectedData", "UserCounter", "UserProtectedCounter", "WriteFileMode", "FileIndex", "FileSettings", "Companion", "tangem-core"})
public enum TlvTag {
    /*public static final*/ Unknown /* = new Unknown(0) */,
    /*public static final*/ CardId /* = new CardId(0) */,
    /*public static final*/ Status /* = new Status(0) */,
    /*public static final*/ CardPublicKey /* = new CardPublicKey(0) */,
    /*public static final*/ CardSignature /* = new CardSignature(0) */,
    /*public static final*/ CurveId /* = new CurveId(0) */,
    /*public static final*/ HashAlgID /* = new HashAlgID(0) */,
    /*public static final*/ SigningMethod /* = new SigningMethod(0) */,
    /*public static final*/ MaxSignatures /* = new MaxSignatures(0) */,
    /*public static final*/ PauseBeforePin2 /* = new PauseBeforePin2(0) */,
    /*public static final*/ SettingsMask /* = new SettingsMask(0) */,
    /*public static final*/ CardData /* = new CardData(0) */,
    /*public static final*/ NdefData /* = new NdefData(0) */,
    /*public static final*/ CreateWalletAtPersonalize /* = new CreateWalletAtPersonalize(0) */,
    /*public static final*/ Health /* = new Health(0) */,
    /*public static final*/ Pin /* = new Pin(0) */,
    /*public static final*/ Pin2 /* = new Pin2(0) */,
    /*public static final*/ NewPin /* = new NewPin(0) */,
    /*public static final*/ NewPin2 /* = new NewPin2(0) */,
    /*public static final*/ NewPinHash /* = new NewPinHash(0) */,
    /*public static final*/ NewPin2Hash /* = new NewPin2Hash(0) */,
    /*public static final*/ Challenge /* = new Challenge(0) */,
    /*public static final*/ Salt /* = new Salt(0) */,
    /*public static final*/ ValidationCounter /* = new ValidationCounter(0) */,
    /*public static final*/ Cvc /* = new Cvc(0) */,
    /*public static final*/ SessionKeyA /* = new SessionKeyA(0) */,
    /*public static final*/ SessionKeyB /* = new SessionKeyB(0) */,
    /*public static final*/ Pause /* = new Pause(0) */,
    /*public static final*/ NewPin3 /* = new NewPin3(0) */,
    /*public static final*/ CrExKey /* = new CrExKey(0) */,
    /*public static final*/ Uid /* = new Uid(0) */,
    /*public static final*/ ManufactureId /* = new ManufactureId(0) */,
    /*public static final*/ ManufacturerSignature /* = new ManufacturerSignature(0) */,
    /*public static final*/ IssuerDataPublicKey /* = new IssuerDataPublicKey(0) */,
    /*public static final*/ IssuerTransactionPublicKey /* = new IssuerTransactionPublicKey(0) */,
    /*public static final*/ IssuerData /* = new IssuerData(0) */,
    /*public static final*/ IssuerDataSignature /* = new IssuerDataSignature(0) */,
    /*public static final*/ IssuerTransactionSignature /* = new IssuerTransactionSignature(0) */,
    /*public static final*/ IssuerDataCounter /* = new IssuerDataCounter(0) */,
    /*public static final*/ AcquirerPublicKey /* = new AcquirerPublicKey(0) */,
    /*public static final*/ Size /* = new Size(0) */,
    /*public static final*/ Mode /* = new Mode(0) */,
    /*public static final*/ Offset /* = new Offset(0) */,
    /*public static final*/ IsActivated /* = new IsActivated(0) */,
    /*public static final*/ ActivationSeed /* = new ActivationSeed(0) */,
    /*public static final*/ ResetPin /* = new ResetPin(0) */,
    /*public static final*/ CodePageAddress /* = new CodePageAddress(0) */,
    /*public static final*/ CodePageCount /* = new CodePageCount(0) */,
    /*public static final*/ CodeHash /* = new CodeHash(0) */,
    /*public static final*/ TransactionOutHash /* = new TransactionOutHash(0) */,
    /*public static final*/ TransactionOutHashSize /* = new TransactionOutHashSize(0) */,
    /*public static final*/ TransactionOutRaw /* = new TransactionOutRaw(0) */,
    /*public static final*/ WalletPublicKey /* = new WalletPublicKey(0) */,
    /*public static final*/ Signature /* = new Signature(0) */,
    /*public static final*/ RemainingSignatures /* = new RemainingSignatures(0) */,
    /*public static final*/ SignedHashes /* = new SignedHashes(0) */,
    /*public static final*/ Firmware /* = new Firmware(0) */,
    /*public static final*/ Batch /* = new Batch(0) */,
    /*public static final*/ ManufactureDateTime /* = new ManufactureDateTime(0) */,
    /*public static final*/ IssuerId /* = new IssuerId(0) */,
    /*public static final*/ BlockchainId /* = new BlockchainId(0) */,
    /*public static final*/ ManufacturerPublicKey /* = new ManufacturerPublicKey(0) */,
    /*public static final*/ CardIdManufacturerSignature /* = new CardIdManufacturerSignature(0) */,
    /*public static final*/ ProductMask /* = new ProductMask(0) */,
    /*public static final*/ PaymentFlowVersion /* = new PaymentFlowVersion(0) */,
    /*public static final*/ TokenSymbol /* = new TokenSymbol(0) */,
    /*public static final*/ TokenContractAddress /* = new TokenContractAddress(0) */,
    /*public static final*/ TokenDecimal /* = new TokenDecimal(0) */,
    /*public static final*/ Denomination /* = new Denomination(0) */,
    /*public static final*/ ValidatedBalance /* = new ValidatedBalance(0) */,
    /*public static final*/ LastSignDate /* = new LastSignDate(0) */,
    /*public static final*/ DenominationText /* = new DenominationText(0) */,
    /*public static final*/ TerminalIsLinked /* = new TerminalIsLinked(0) */,
    /*public static final*/ TerminalPublicKey /* = new TerminalPublicKey(0) */,
    /*public static final*/ TerminalTransactionSignature /* = new TerminalTransactionSignature(0) */,
    /*public static final*/ UserData /* = new UserData(0) */,
    /*public static final*/ UserProtectedData /* = new UserProtectedData(0) */,
    /*public static final*/ UserCounter /* = new UserCounter(0) */,
    /*public static final*/ UserProtectedCounter /* = new UserProtectedCounter(0) */,
    /*public static final*/ WriteFileMode /* = new WriteFileMode(0) */,
    /*public static final*/ FileIndex /* = new FileIndex(0) */,
    /*public static final*/ FileSettings /* = new FileSettings(0) */;
    private final int code = 0;
    private static final com.tangem.common.tlv.TlvTag[] values = null;
    public static final com.tangem.common.tlv.TlvTag.Companion Companion = null;
    
    /**
     * @return [TlvValueType] associated with a [TlvTag]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.common.tlv.TlvValueType valueType() {
        return null;
    }
    
    public final int getCode() {
        return 0;
    }
    
    TlvTag(int code) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/common/tlv/TlvTag$Companion;", "", "()V", "values", "", "Lcom/tangem/common/tlv/TlvTag;", "[Lcom/tangem/common/tlv/TlvTag;", "byCode", "code", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.common.tlv.TlvTag byCode(int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}