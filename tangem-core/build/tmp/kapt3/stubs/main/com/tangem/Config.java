package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \u0018\u0000 +2\u00020\u0001:\u0001+Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 \u00a8\u0006,"}, d2 = {"Lcom/tangem/Config;", "", "linkedTerminal", "", "issuerPublicKey", "", "encryptionMode", "Lcom/tangem/EncryptionMode;", "cardFilter", "Lcom/tangem/CardFilter;", "handleErrors", "defaultPin1", "", "defaultPin2", "savePin1InStaticField", "savePin2InStaticField", "(Z[BLcom/tangem/EncryptionMode;Lcom/tangem/CardFilter;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "getCardFilter", "()Lcom/tangem/CardFilter;", "getDefaultPin1", "()Ljava/lang/String;", "setDefaultPin1", "(Ljava/lang/String;)V", "getDefaultPin2", "setDefaultPin2", "getEncryptionMode", "()Lcom/tangem/EncryptionMode;", "setEncryptionMode", "(Lcom/tangem/EncryptionMode;)V", "getHandleErrors", "()Z", "setHandleErrors", "(Z)V", "getIssuerPublicKey", "()[B", "setIssuerPublicKey", "([B)V", "getLinkedTerminal", "setLinkedTerminal", "getSavePin1InStaticField", "setSavePin1InStaticField", "getSavePin2InStaticField", "setSavePin2InStaticField", "Companion", "tangem-core"})
public final class Config {
    
    /**
     * Enables or disables Linked Terminal feature.
     *
     *       App can optionally generate ECDSA key pair Terminal_PrivateKey / Terminal_PublicKey.
     *       And then submit Terminal_PublicKey to the card in any SIGN command.
     *       Once SIGN is successfully executed by COS (Card Operation System),
     *       including PIN2 verification and/or completion of security delay, the submitted
     *       Terminal_PublicKey key is stored by COS. After that, the App instance is deemed trusted
     *       by COS and COS will allow skipping security delay for subsequent SIGN operations
     *       thus improving convenience without sacrificing security.
     *
     *       In order to skip security delay, App should use Terminal_PrivateKey to compute the signature
     *       of the data being submitted to SIGN command for signing and transmit this signature in
     *       Terminal_Transaction_Signature parameter in the same SIGN command. COS will verify
     *       the correctness of Terminal_Transaction_Signature using previously stored Terminal_PublicKey
     *       and, if correct, will skip security delay for the current SIGN operation.
     */
    private boolean linkedTerminal;
    
    /**
     * If not null, it will be used to validate Issuer data and issuer extra data.
     * If null, issuerPublicKey from current card will be used.
     */
    @org.jetbrains.annotations.Nullable()
    private byte[] issuerPublicKey;
    
    /**
     * Level of encryption used in communication with a Tangem Card.
     */
    @org.jetbrains.annotations.NotNull()
    private com.tangem.EncryptionMode encryptionMode;
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.CardFilter cardFilter = null;
    private boolean handleErrors;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String defaultPin1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String defaultPin2;
    private boolean savePin1InStaticField;
    private boolean savePin2InStaticField;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_PIN_1 = "000000";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_PIN_2 = "000";
    public static final com.tangem.Config.Companion Companion = null;
    
    /**
     * Enables or disables Linked Terminal feature.
     *
     *       App can optionally generate ECDSA key pair Terminal_PrivateKey / Terminal_PublicKey.
     *       And then submit Terminal_PublicKey to the card in any SIGN command.
     *       Once SIGN is successfully executed by COS (Card Operation System),
     *       including PIN2 verification and/or completion of security delay, the submitted
     *       Terminal_PublicKey key is stored by COS. After that, the App instance is deemed trusted
     *       by COS and COS will allow skipping security delay for subsequent SIGN operations
     *       thus improving convenience without sacrificing security.
     *
     *       In order to skip security delay, App should use Terminal_PrivateKey to compute the signature
     *       of the data being submitted to SIGN command for signing and transmit this signature in
     *       Terminal_Transaction_Signature parameter in the same SIGN command. COS will verify
     *       the correctness of Terminal_Transaction_Signature using previously stored Terminal_PublicKey
     *       and, if correct, will skip security delay for the current SIGN operation.
     */
    public final boolean getLinkedTerminal() {
        return false;
    }
    
    /**
     * Enables or disables Linked Terminal feature.
     *
     *       App can optionally generate ECDSA key pair Terminal_PrivateKey / Terminal_PublicKey.
     *       And then submit Terminal_PublicKey to the card in any SIGN command.
     *       Once SIGN is successfully executed by COS (Card Operation System),
     *       including PIN2 verification and/or completion of security delay, the submitted
     *       Terminal_PublicKey key is stored by COS. After that, the App instance is deemed trusted
     *       by COS and COS will allow skipping security delay for subsequent SIGN operations
     *       thus improving convenience without sacrificing security.
     *
     *       In order to skip security delay, App should use Terminal_PrivateKey to compute the signature
     *       of the data being submitted to SIGN command for signing and transmit this signature in
     *       Terminal_Transaction_Signature parameter in the same SIGN command. COS will verify
     *       the correctness of Terminal_Transaction_Signature using previously stored Terminal_PublicKey
     *       and, if correct, will skip security delay for the current SIGN operation.
     */
    public final void setLinkedTerminal(boolean p0) {
    }
    
    /**
     * If not null, it will be used to validate Issuer data and issuer extra data.
     * If null, issuerPublicKey from current card will be used.
     */
    @org.jetbrains.annotations.Nullable()
    public final byte[] getIssuerPublicKey() {
        return null;
    }
    
    /**
     * If not null, it will be used to validate Issuer data and issuer extra data.
     * If null, issuerPublicKey from current card will be used.
     */
    public final void setIssuerPublicKey(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    /**
     * Level of encryption used in communication with a Tangem Card.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.EncryptionMode getEncryptionMode() {
        return null;
    }
    
    /**
     * Level of encryption used in communication with a Tangem Card.
     */
    public final void setEncryptionMode(@org.jetbrains.annotations.NotNull()
    com.tangem.EncryptionMode p0) {
    }
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.CardFilter getCardFilter() {
        return null;
    }
    
    public final boolean getHandleErrors() {
        return false;
    }
    
    public final void setHandleErrors(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultPin1() {
        return null;
    }
    
    public final void setDefaultPin1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultPin2() {
        return null;
    }
    
    public final void setDefaultPin2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSavePin1InStaticField() {
        return false;
    }
    
    public final void setSavePin1InStaticField(boolean p0) {
    }
    
    public final boolean getSavePin2InStaticField() {
        return false;
    }
    
    public final void setSavePin2InStaticField(boolean p0) {
    }
    
    public Config(boolean linkedTerminal, @org.jetbrains.annotations.Nullable()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    com.tangem.EncryptionMode encryptionMode, @org.jetbrains.annotations.NotNull()
    com.tangem.CardFilter cardFilter, boolean handleErrors, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultPin1, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultPin2, boolean savePin1InStaticField, boolean savePin2InStaticField) {
        super();
    }
    
    public Config() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tangem/Config$Companion;", "", "()V", "DEFAULT_PIN_1", "", "DEFAULT_PIN_2", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}