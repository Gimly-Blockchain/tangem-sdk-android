package com.tangem.tasks.file;

import java.lang.System;

/**
 * This task allows to delete multiple or all files written to the card with [WriteFileDataCommand].
 * Passcode (PIN2) is required to delete the files.
 *
 * @property filesIndices indices of files to be deleted. If [filesIndices] are not provided,
 * then all files will be deleted.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J=\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2+\u0010\u0010\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0011H\u0002JK\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000e\u001a\u00020\u000f2+\u0010\u0010\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0011H\u0002J=\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2+\u0010\u0010\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0011H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/tangem/tasks/file/DeleteFilesTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/SimpleResponse;", "Lcom/tangem/commands/file/DeleteFileResponse;", "filesIndices", "", "", "(Ljava/util/List;)V", "requiresPin2", "", "getRequiresPin2", "()Z", "deleteAllFiles", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "deleteFiles", "filesIndex", "run", "tangem-core"})
public final class DeleteFilesTask implements com.tangem.CardSessionRunnable<com.tangem.commands.SimpleResponse> {
    private final boolean requiresPin2 = true;
    private final java.util.List<java.lang.Integer> filesIndices = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    private final void deleteAllFiles(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    private final void deleteFiles(java.util.List<java.lang.Integer> filesIndex, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    public DeleteFilesTask(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> filesIndices) {
        super();
    }
    
    public DeleteFilesTask() {
        super();
    }
}