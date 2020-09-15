package com.tangem.commands.file;

import java.lang.System;

/**
 * Task uses commands that are in development and subject to future changes
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J9\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\'\u0010\u0016\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0018\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00130\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/tangem/commands/file/WriteFileDataTask;", "Lcom/tangem/CardSessionRunnable;", "Lcom/tangem/commands/file/WriteFileDataResponse;", "data", "", "issuerKeys", "Lcom/tangem/KeyPair;", "([BLcom/tangem/KeyPair;)V", "requiresPin2", "", "getRequiresPin2", "()Z", "getFinalizingSignature", "counter", "", "cardId", "", "getStartingSignature", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "tangem-core"})
public final class WriteFileDataTask implements com.tangem.CardSessionRunnable<com.tangem.commands.file.WriteFileDataResponse> {
    private final boolean requiresPin2 = false;
    private final byte[] data = null;
    private final com.tangem.KeyPair issuerKeys = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    private final byte[] getStartingSignature(byte[] data, int counter, java.lang.String cardId) {
        return null;
    }
    
    private final byte[] getFinalizingSignature(byte[] data, int counter, java.lang.String cardId) {
        return null;
    }
    
    public WriteFileDataTask(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    com.tangem.KeyPair issuerKeys) {
        super();
    }
}