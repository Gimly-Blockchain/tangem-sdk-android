package com.tangem.tasks.file;

import java.lang.System;

/**
 * This task allows to write multiple files to a card.
 * There are two secure ways to write files.
 * 1) Data can be signed by Issuer (the one specified on card during personalization) -
 * [FileData.DataProtectedBySignature].
 * 2) Data can be protected by Passcode (PIN2). [FileData.DataProtectedByPasscode] In this case,
 * Passcode (PIN2) is required for the command.
 *
 * @property data files to be written.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J9\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\'\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J9\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\'\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/tangem/tasks/file/WriteFilesTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/file/WriteFileDataResponse;", "data", "", "Lcom/tangem/commands/file/FileData;", "(Ljava/util/List;)V", "currentIndex", "", "requiresPin2", "", "getRequiresPin2", "()Z", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "writeFiles", "tangem-core"})
public final class WriteFilesTask implements com.tangem.CardSessionRunnable<com.tangem.commands.file.WriteFileDataResponse> {
    private final boolean requiresPin2 = false;
    private int currentIndex = 0;
    private final java.util.List<com.tangem.commands.file.FileData> data = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    private final void writeFiles(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    public WriteFilesTask(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tangem.commands.file.FileData> data) {
        super();
    }
}