package com.tangem.tasks.file;

import java.lang.System;

/**
 * This task allows to read multiple files written to the card with [WriteFileDataCommand].
 * If the files are private, then Passcode (PIN2) is required to read the files.
 *
 * @property readPrivateFiles if set to true, then the task will read private files,
 * for which it requires PIN2. Otherwise only public files can be read.
 * @property indices indices of files to be read. If not provided, the task will read and return
 * all files from a card that satisfy the access level condition (either only public or private and public).
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ9\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0015H\u0002JG\u0010\u001a\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J9\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0015H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/tangem/tasks/file/ReadFilesTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/tasks/file/ReadFilesResponse;", "readPrivateFiles", "", "indices", "", "", "(ZLjava/util/List;)V", "files", "", "Lcom/tangem/tasks/file/File;", "index", "requiresPin2", "getRequiresPin2", "()Z", "readAllFiles", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "readSpecifiedFiles", "run", "tangem-core"})
public final class ReadFilesTask implements com.tangem.CardSessionRunnable<com.tangem.tasks.file.ReadFilesResponse> {
    private final boolean requiresPin2 = false;
    private int index = 0;
    private final java.util.List<com.tangem.tasks.file.File> files = null;
    private final boolean readPrivateFiles = false;
    private final java.util.List<java.lang.Integer> indices = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.tasks.file.ReadFilesResponse>, kotlin.Unit> callback) {
    }
    
    private final void readAllFiles(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.tasks.file.ReadFilesResponse>, kotlin.Unit> callback) {
    }
    
    private final void readSpecifiedFiles(java.util.List<java.lang.Integer> indices, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.tasks.file.ReadFilesResponse>, kotlin.Unit> callback) {
    }
    
    public ReadFilesTask(boolean readPrivateFiles, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> indices) {
        super();
    }
    
    public ReadFilesTask() {
        super();
    }
}