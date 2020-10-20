package com.tangem.commands.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/tangem/commands/common/network/TangemService;", "", "()V", "tangemApi", "Lcom/tangem/commands/common/network/TangemApi;", "getTangemApi", "()Lcom/tangem/commands/common/network/TangemApi;", "tangemApi$delegate", "Lkotlin/Lazy;", "getArtwork", "Lcom/tangem/commands/common/network/Result;", "Lokhttp3/ResponseBody;", "cardId", "", "cardPublicKey", "artworkId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyAndGetInfo", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "tangem-core"})
public final class TangemService {
    private final kotlin.Lazy tangemApi$delegate = null;
    public static final com.tangem.commands.common.network.TangemService.Companion Companion = null;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getArtwork(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String cardPublicKey, @org.jetbrains.annotations.NotNull()
    java.lang.String artworkId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tangem.commands.common.network.Result<? extends okhttp3.ResponseBody>> p3) {
        return null;
    }
    
    public TangemService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/tangem/commands/common/network/TangemService$Companion;", "", "()V", "getUrlForArtwork", "", "cardId", "cardPublicKey", "artworkId", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrlForArtwork(@org.jetbrains.annotations.NotNull()
        java.lang.String cardId, @org.jetbrains.annotations.NotNull()
        java.lang.String cardPublicKey, @org.jetbrains.annotations.NotNull()
        java.lang.String artworkId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}