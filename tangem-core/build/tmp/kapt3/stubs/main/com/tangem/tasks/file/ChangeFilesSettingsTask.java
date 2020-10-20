package com.tangem.tasks.file;

import java.lang.System;

/**
 * This task allows to change settings of multiple files written to the card with [WriteFileDataCommand].
 * Passcode (PIN2) is required for this operation.
 * [FileSettings] change access level to a file - it can be [FileSettings.Private],
 * accessible only with PIN2, or [FileSettings.Public], accessible without PIN2
 *
 * @property changes contains list of [FileSettingsChange] -
 * indices of files that are to be changed and desired settings.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J=\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112+\u0010\u0012\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002J=\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112+\u0010\u0012\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/tangem/tasks/file/ChangeFilesSettingsTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/SimpleResponse;", "Lcom/tangem/commands/file/ChangeFileSettingsResponse;", "changes", "", "Lcom/tangem/commands/file/FileSettingsChange;", "(Ljava/util/List;)V", "currentIndex", "", "requiresPin2", "", "getRequiresPin2", "()Z", "changeSettings", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "run", "tangem-core"})
public final class ChangeFilesSettingsTask implements com.tangem.CardSessionRunnable<com.tangem.commands.SimpleResponse> {
    private final boolean requiresPin2 = true;
    private int currentIndex = 0;
    private final java.util.List<com.tangem.commands.file.FileSettingsChange> changes = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    private final void changeSettings(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    public ChangeFilesSettingsTask(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tangem.commands.file.FileSettingsChange> changes) {
        super();
    }
}