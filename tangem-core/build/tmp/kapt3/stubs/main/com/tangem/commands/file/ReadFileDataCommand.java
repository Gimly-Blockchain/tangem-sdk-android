package com.tangem.commands.file;

import java.lang.System;

/**
 * Card Command is in development, subject to future changes
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J9\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00120\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020 H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010!\u001a\u00020\"H\u0016J9\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020(2\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00120\u0015H\u0002J9\u0010)\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020(2\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006,"}, d2 = {"Lcom/tangem/commands/file/ReadFileDataCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/file/ReadFileDataResponse;", "fileIndex", "", "readPrivateFiles", "", "(IZ)V", "dataSize", "fileData", "Ljava/io/ByteArrayOutputStream;", "fileSettings", "Lcom/tangem/commands/file/FileSettings;", "offset", "requiresPin2", "getRequiresPin2", "()Z", "completeTask", "", "data", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "mapError", "Lcom/tangem/TangemError;", "card", "Lcom/tangem/commands/Card;", "error", "performPreCheck", "Lcom/tangem/TangemSdkError;", "readFileData", "session", "Lcom/tangem/CardSession;", "run", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "tangem-core"})
public final class ReadFileDataCommand extends com.tangem.commands.Command<com.tangem.commands.file.ReadFileDataResponse> {
    private final boolean requiresPin2 = false;
    private final java.io.ByteArrayOutputStream fileData = null;
    private int offset = 0;
    private int dataSize = 0;
    private com.tangem.commands.file.FileSettings fileSettings;
    private final int fileIndex = 0;
    private final boolean readPrivateFiles = false;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
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
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.ReadFileDataResponse>, kotlin.Unit> callback) {
    }
    
    private final void readFileData(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.ReadFileDataResponse>, kotlin.Unit> callback) {
    }
    
    private final void completeTask(com.tangem.commands.file.ReadFileDataResponse data, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.ReadFileDataResponse>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.file.ReadFileDataResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public ReadFileDataCommand(int fileIndex, boolean readPrivateFiles) {
        super();
    }
    
    public ReadFileDataCommand() {
        super();
    }
}