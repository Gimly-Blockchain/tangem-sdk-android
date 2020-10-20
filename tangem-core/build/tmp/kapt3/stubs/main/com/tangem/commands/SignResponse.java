package com.tangem.commands;

import java.lang.System;

/**
 * @param cardId CID, Unique Tangem card ID number
 * @param signature Signed hashes (array of resulting signatures)
 * @param walletRemainingSignatures Remaining number of sign operations before the wallet will stop signing transactions.
 * @param walletSignedHashes Total number of signed single hashes returned by the card in sign command responses.
 * Sums up array elements within all SIGN commands
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/tangem/commands/SignResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "signature", "", "walletRemainingSignatures", "", "walletSignedHashes", "(Ljava/lang/String;[BILjava/lang/Integer;)V", "getCardId", "()Ljava/lang/String;", "getSignature", "()[B", "getWalletRemainingSignatures", "()I", "getWalletSignedHashes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "tangem-core"})
public final class SignResponse implements com.tangem.commands.CommandResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] signature = null;
    private final int walletRemainingSignatures = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer walletSignedHashes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getSignature() {
        return null;
    }
    
    public final int getWalletRemainingSignatures() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWalletSignedHashes() {
        return null;
    }
    
    public SignResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] signature, int walletRemainingSignatures, @org.jetbrains.annotations.Nullable()
    java.lang.Integer walletSignedHashes) {
        super();
    }
}