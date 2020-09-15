package com.tangem.commands;

import java.lang.System;

/**
 * Deserialized response from the Tangem card after [CheckWalletCommand].
 *
 * @property cardId Unique Tangem card ID number
 * @property salt Random salt generated by the card.
 * @property walletSignature Challenge and salt signed with the wallet private key.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/tangem/commands/CheckWalletResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "salt", "", "walletSignature", "(Ljava/lang/String;[B[B)V", "getCardId", "()Ljava/lang/String;", "getSalt", "()[B", "getWalletSignature", "verify", "", "curve", "Lcom/tangem/commands/EllipticCurve;", "publicKey", "challenge", "tangem-core"})
public final class CheckWalletResponse implements com.tangem.commands.CommandResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] salt = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] walletSignature = null;
    
    public final boolean verify(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve, @org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    byte[] challenge) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getSalt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getWalletSignature() {
        return null;
    }
    
    public CheckWalletResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] salt, @org.jetbrains.annotations.NotNull()
    byte[] walletSignature) {
        super();
    }
}