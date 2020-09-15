package com.tangem.commands.verifycard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/tangem/commands/verifycard/VerifyCardResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "verificationState", "Lcom/tangem/commands/verifycard/VerifyCardState;", "artworkInfo", "Lcom/tangem/commands/verifycard/ArtworkInfo;", "salt", "", "cardSignature", "(Ljava/lang/String;Lcom/tangem/commands/verifycard/VerifyCardState;Lcom/tangem/commands/verifycard/ArtworkInfo;[B[B)V", "getArtworkInfo", "()Lcom/tangem/commands/verifycard/ArtworkInfo;", "getCardId", "()Ljava/lang/String;", "getCardSignature$tangem_core", "()[B", "getSalt$tangem_core", "getVerificationState", "()Lcom/tangem/commands/verifycard/VerifyCardState;", "verify", "", "publicKey", "challenge", "tangem-core"})
public final class VerifyCardResponse implements com.tangem.commands.CommandResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.commands.verifycard.VerifyCardState verificationState = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.commands.verifycard.ArtworkInfo artworkInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] salt = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] cardSignature = null;
    
    public final boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    byte[] challenge) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.verifycard.VerifyCardState getVerificationState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.verifycard.ArtworkInfo getArtworkInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getSalt$tangem_core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getCardSignature$tangem_core() {
        return null;
    }
    
    public VerifyCardResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.verifycard.VerifyCardState verificationState, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.verifycard.ArtworkInfo artworkInfo, @org.jetbrains.annotations.NotNull()
    byte[] salt, @org.jetbrains.annotations.NotNull()
    byte[] cardSignature) {
        super();
    }
}