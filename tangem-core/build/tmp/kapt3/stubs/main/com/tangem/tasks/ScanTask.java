package com.tangem.tasks;

import java.lang.System;

/**
 * Task that allows to read Tangem card and verify its private key.
 *
 * It performs two commands, [ReadCommand] and [CheckWalletCommand], subsequently.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\'\u0010\f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rH\u0002J9\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\'\u0010\f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rH\u0016JA\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\'\u0010\f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/tangem/tasks/ScanTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/Card;", "()V", "requiresPin2", "", "getRequiresPin2", "()Z", "readSlixTag", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "run", "runCheckWalletIfNeeded", "card", "tangem-core"})
public final class ScanTask implements com.tangem.CardSessionRunnable<com.tangem.commands.Card> {
    private final boolean requiresPin2 = false;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    private final void runCheckWalletIfNeeded(com.tangem.commands.Card card, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    private final void readSlixTag(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    public ScanTask() {
        super();
    }
}