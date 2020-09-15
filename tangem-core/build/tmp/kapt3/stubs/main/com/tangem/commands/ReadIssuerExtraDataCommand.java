package com.tangem.commands;

import java.lang.System;

/**
 * This command retrieves Issuer Extra Data field and its issuer’s signature.
 * Issuer Extra Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
 * format and payload of Issuer Data. . For example, this field may contain photo or
 * biometric information for ID card product. Because of the large size of Issuer_Extra_Data,
 * a series of these commands have to be executed to read the entire Issuer_Extra_Data.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007JA\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\'\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016JA\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u00052\'\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002J9\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\'\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J!\u0010&\u001a\u00020\'2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*H\u0096\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/tangem/commands/ReadIssuerExtraDataCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/ReadIssuerExtraDataResponse;", "Lcom/tangem/commands/common/IssuerDataVerifier;", "issuerPublicKey", "", "verifier", "([BLcom/tangem/commands/common/IssuerDataVerifier;)V", "issuerData", "Ljava/io/ByteArrayOutputStream;", "issuerDataSize", "", "offset", "completeTask", "", "data", "publicKey", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "performPreCheck", "Lcom/tangem/TangemSdkError;", "card", "Lcom/tangem/commands/Card;", "readIssuerData", "session", "Lcom/tangem/CardSession;", "run", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "verify", "", "signature", "issuerDataToVerify", "Lcom/tangem/commands/common/IssuerDataToVerify;", "Companion", "tangem-core"})
public final class ReadIssuerExtraDataCommand extends com.tangem.commands.Command<com.tangem.commands.ReadIssuerExtraDataResponse> implements com.tangem.commands.common.IssuerDataVerifier {
    private final java.io.ByteArrayOutputStream issuerData = null;
    private int offset = 0;
    private int issuerDataSize = 0;
    private final byte[] issuerPublicKey = null;
    
    /**
     * This mode value specifies that this command retrieves Issuer EXTRA data from the card
     * (with value 0 the command will get instead simple Issuer Data from the card).
     */
    public static final int EXTRA_DATA_MODE = 1;
    public static final com.tangem.commands.ReadIssuerExtraDataCommand.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerExtraDataResponse>, kotlin.Unit> callback) {
    }
    
    private final void readIssuerData(com.tangem.CardSession session, byte[] publicKey, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerExtraDataResponse>, kotlin.Unit> callback) {
    }
    
    private final void completeTask(com.tangem.commands.ReadIssuerExtraDataResponse data, byte[] publicKey, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerExtraDataResponse>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.ReadIssuerExtraDataResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public ReadIssuerExtraDataCommand(@org.jetbrains.annotations.Nullable()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataVerifier verifier) {
        super();
    }
    
    public ReadIssuerExtraDataCommand() {
        super();
    }
    
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataToVerify issuerDataToVerify) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/commands/ReadIssuerExtraDataCommand$Companion;", "", "()V", "EXTRA_DATA_MODE", "", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}