package com.tangem.commands.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/tangem/commands/common/network/TangemApi;", "", "getArtwork", "Lokhttp3/ResponseBody;", "artworkId", "", "CID", "publicKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardVerifyAndGetInfo", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response;", "requestBody", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request;", "(Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tangem-core"})
public abstract interface TangemApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "card/verify-and-get-info")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getCardVerifyAndGetInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "card/artwork")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getArtwork(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "artworkId")
    java.lang.String artworkId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "CID")
    java.lang.String CID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "publicKey")
    java.lang.String publicKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> p3);
}