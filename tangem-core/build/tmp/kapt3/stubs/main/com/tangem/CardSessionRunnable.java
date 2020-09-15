package com.tangem;

import java.lang.System;

/**
 * Basic interface for running tasks and [com.tangem.commands.Command] in a [CardSession]
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\'\u0010\f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/tangem/CardSessionRunnable;", "T", "Lcom/tangem/commands/CommandResponse;", "", "requiresPin2", "", "getRequiresPin2", "()Z", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "tangem-core"})
public abstract interface CardSessionRunnable<T extends com.tangem.commands.CommandResponse> {
    
    public abstract boolean getRequiresPin2();
    
    /**
     * The starting point for custom business logic.
     * Implement this interface and use [TangemSdk.startSessionWithRunnable] to run.
     * @param session run commands in this [CardSession].
     * @param callback trigger the callback to complete the task.
     */
    public abstract void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback);
}