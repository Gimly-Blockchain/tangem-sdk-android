package com.tangem;

import java.lang.System;

/**
 * Contains data relating to a Tangem card. It is used in constructing all the commands,
 * and commands can return modified [SessionEnvironment].
 *
 * @param cardId  Card ID, if it is known before tapping the card.
 * @property config sets a number of parameters for communication with Tangem cards.
 * @param terminalKeysService is used to retrieve terminal keys used in Linked Terminal feature.
 * @param cardValuesStorage is used to save and retrieve some values relating to a particular card.
 *
 * @property pin1 An access Code, required to get access to a card. A default value is set in [Config]
 * @property pin2 A code, required to perform particular operations with a card. A default value is set in [Config]
 * @property terminalKeys generated terminal keys used in Linked Terminal feature
 * @property cardFilter a property that defines types of card that this SDK will be able to interact with
 * @property handleErrors if true, the SDK parses internal card errors into concrete [TangemSdkError]
 * @property encryptionMode preferred [EncryptionMode] for interaction with cards
 * @property encryptionKey is used for encrypted communication with a card
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u00a8\u0006="}, d2 = {"Lcom/tangem/SessionEnvironment;", "", "pin1", "Lcom/tangem/common/PinCode;", "pin2", "cvc", "", "terminalKeys", "Lcom/tangem/KeyPair;", "cardFilter", "Lcom/tangem/CardFilter;", "handleErrors", "", "encryptionMode", "Lcom/tangem/EncryptionMode;", "encryptionKey", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "card", "Lcom/tangem/commands/Card;", "(Lcom/tangem/common/PinCode;Lcom/tangem/common/PinCode;[BLcom/tangem/KeyPair;Lcom/tangem/CardFilter;ZLcom/tangem/EncryptionMode;[BLcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/commands/Card;)V", "getCard", "()Lcom/tangem/commands/Card;", "setCard", "(Lcom/tangem/commands/Card;)V", "getCardFilter", "()Lcom/tangem/CardFilter;", "setCardFilter", "(Lcom/tangem/CardFilter;)V", "getCardValidation", "()Lcom/tangem/VerificationState;", "setCardValidation", "(Lcom/tangem/VerificationState;)V", "getCardVerification", "setCardVerification", "getCodeVerification", "setCodeVerification", "getCvc", "()[B", "setCvc", "([B)V", "getEncryptionKey", "setEncryptionKey", "getEncryptionMode", "()Lcom/tangem/EncryptionMode;", "setEncryptionMode", "(Lcom/tangem/EncryptionMode;)V", "getHandleErrors", "()Z", "getPin1", "()Lcom/tangem/common/PinCode;", "setPin1", "(Lcom/tangem/common/PinCode;)V", "getPin2", "setPin2", "getTerminalKeys", "()Lcom/tangem/KeyPair;", "setTerminalKeys", "(Lcom/tangem/KeyPair;)V", "tangem-core"})
public final class SessionEnvironment {
    @org.jetbrains.annotations.Nullable()
    private com.tangem.common.PinCode pin1;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.common.PinCode pin2;
    @org.jetbrains.annotations.Nullable()
    private byte[] cvc;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.KeyPair terminalKeys;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.CardFilter cardFilter;
    private final boolean handleErrors = false;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.EncryptionMode encryptionMode;
    @org.jetbrains.annotations.Nullable()
    private byte[] encryptionKey;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.VerificationState cardVerification;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.VerificationState cardValidation;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.VerificationState codeVerification;
    @org.jetbrains.annotations.Nullable()
    private com.tangem.commands.Card card;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.common.PinCode getPin1() {
        return null;
    }
    
    public final void setPin1(@org.jetbrains.annotations.Nullable()
    com.tangem.common.PinCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.common.PinCode getPin2() {
        return null;
    }
    
    public final void setPin2(@org.jetbrains.annotations.Nullable()
    com.tangem.common.PinCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getCvc() {
        return null;
    }
    
    public final void setCvc(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.KeyPair getTerminalKeys() {
        return null;
    }
    
    public final void setTerminalKeys(@org.jetbrains.annotations.Nullable()
    com.tangem.KeyPair p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.CardFilter getCardFilter() {
        return null;
    }
    
    public final void setCardFilter(@org.jetbrains.annotations.NotNull()
    com.tangem.CardFilter p0) {
    }
    
    public final boolean getHandleErrors() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.EncryptionMode getEncryptionMode() {
        return null;
    }
    
    public final void setEncryptionMode(@org.jetbrains.annotations.NotNull()
    com.tangem.EncryptionMode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getEncryptionKey() {
        return null;
    }
    
    public final void setEncryptionKey(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.VerificationState getCardVerification() {
        return null;
    }
    
    public final void setCardVerification(@org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.VerificationState getCardValidation() {
        return null;
    }
    
    public final void setCardValidation(@org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.VerificationState getCodeVerification() {
        return null;
    }
    
    public final void setCodeVerification(@org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.Card getCard() {
        return null;
    }
    
    public final void setCard(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card p0) {
    }
    
    public SessionEnvironment(@org.jetbrains.annotations.Nullable()
    com.tangem.common.PinCode pin1, @org.jetbrains.annotations.Nullable()
    com.tangem.common.PinCode pin2, @org.jetbrains.annotations.Nullable()
    byte[] cvc, @org.jetbrains.annotations.Nullable()
    com.tangem.KeyPair terminalKeys, @org.jetbrains.annotations.NotNull()
    com.tangem.CardFilter cardFilter, boolean handleErrors, @org.jetbrains.annotations.NotNull()
    com.tangem.EncryptionMode encryptionMode, @org.jetbrains.annotations.Nullable()
    byte[] encryptionKey, @org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.NotNull()
    com.tangem.VerificationState codeVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card) {
        super();
    }
    
    public SessionEnvironment() {
        super();
    }
}