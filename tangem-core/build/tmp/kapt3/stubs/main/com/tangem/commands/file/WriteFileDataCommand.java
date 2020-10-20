package com.tangem.commands.file;

import java.lang.System;

/**
 * This command allows to write data up to [MAX_SIZE] to a card.
 * There are two secure ways to write files.
 * 1) Data can be signed by Issuer (the one specified on card during personalization) -
 * [FileData.DataProtectedBySignature].
 * 2) Data can be protected by Passcode (PIN2). [FileData.DataProtectedByPasscode] In this case,
 * Passcode (PIN2) is required for the command.
 *
 * @property fileData data to be written.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001f\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020 H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J9\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020%0)H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J!\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0096\u0001J \u00105\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u0002062\u0006\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u000209H\u0002J9\u0010:\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020%0)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006<"}, d2 = {"Lcom/tangem/commands/file/WriteFileDataCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/file/WriteFileDataResponse;", "Lcom/tangem/commands/common/IssuerDataVerifier;", "fileData", "Lcom/tangem/commands/file/FileData;", "verifier", "(Lcom/tangem/commands/file/FileData;Lcom/tangem/commands/common/IssuerDataVerifier;)V", "fileIndex", "", "mode", "Lcom/tangem/commands/file/FileDataMode;", "offset", "requiresPin2", "", "getRequiresPin2", "()Z", "calculatePartSize", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "getDataToWrite", "", "isCounterRequired", "card", "Lcom/tangem/commands/Card;", "isCounterValid", "issuerDataCounter", "(Ljava/lang/Integer;Lcom/tangem/commands/Card;)Z", "mapError", "Lcom/tangem/TangemError;", "error", "performPreCheck", "Lcom/tangem/TangemSdkError;", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "verify", "issuerPublicKey", "signature", "issuerDataToVerify", "Lcom/tangem/commands/common/IssuerDataToVerify;", "verifySignatures", "Lcom/tangem/commands/file/FileData$DataProtectedBySignature;", "publicKey", "cardId", "", "writeFileData", "Companion", "tangem-core"})
public final class WriteFileDataCommand extends com.tangem.commands.Command<com.tangem.commands.file.WriteFileDataResponse> implements com.tangem.commands.common.IssuerDataVerifier {
    private final boolean requiresPin2 = false;
    private com.tangem.commands.file.FileDataMode mode = com.tangem.commands.file.FileDataMode.InitiateWritingFile;
    private int offset = 0;
    private int fileIndex = 0;
    private final com.tangem.commands.file.FileData fileData = null;
    public static final int SINGLE_WRITE_SIZE = 1524;
    public static final int MAX_SIZE = 49152;
    public static final com.tangem.commands.file.WriteFileDataCommand.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.TangemError mapError(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card, @org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error) {
        return null;
    }
    
    private final boolean isCounterValid(java.lang.Integer issuerDataCounter, com.tangem.commands.Card card) {
        return false;
    }
    
    private final boolean isCounterRequired(com.tangem.commands.Card card) {
        return false;
    }
    
    private final boolean verifySignatures(com.tangem.commands.file.FileData.DataProtectedBySignature fileData, byte[] publicKey, java.lang.String cardId) {
        return false;
    }
    
    private final void writeFileData(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    private final byte[] getDataToWrite() {
        return null;
    }
    
    private final int calculatePartSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.file.WriteFileDataResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public WriteFileDataCommand(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.file.FileData fileData, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataVerifier verifier) {
        super();
    }
    
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataToVerify issuerDataToVerify) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tangem/commands/file/WriteFileDataCommand$Companion;", "", "()V", "MAX_SIZE", "", "SINGLE_WRITE_SIZE", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}