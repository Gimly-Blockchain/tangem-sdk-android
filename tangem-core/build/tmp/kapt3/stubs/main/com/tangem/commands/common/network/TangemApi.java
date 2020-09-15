package com.tangem.commands.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/commands/common/network/TangemApi;", "", "getCardVerifyAndGetInfo", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response;", "requestBody", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request;", "(Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tangem-core"})
public abstract interface TangemApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "card/verify-and-get-info")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getCardVerifyAndGetInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response> p1);
}