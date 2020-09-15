package com.tangem.commands.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/tangem/commands/common/network/TangemService;", "", "()V", "tangemApi", "Lcom/tangem/commands/common/network/TangemApi;", "getTangemApi", "()Lcom/tangem/commands/common/network/TangemApi;", "tangemApi$delegate", "Lkotlin/Lazy;", "verifyAndGetInfo", "Lcom/tangem/commands/common/network/Result;", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response;", "cardId", "", "cardPublicKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tangem-core"})
public final class TangemService {
    private final kotlin.Lazy tangemApi$delegate = null;
    
    private final com.tangem.commands.common.network.TangemApi getTangemApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifyAndGetInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String cardPublicKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tangem.commands.common.network.Result<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response>> p2) {
        return null;
    }
    
    public TangemService() {
        super();
    }
}