package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/tangem/commands/CreateWalletResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "status", "Lcom/tangem/commands/CardStatus;", "walletPublicKey", "", "(Ljava/lang/String;Lcom/tangem/commands/CardStatus;[B)V", "getCardId", "()Ljava/lang/String;", "getStatus", "()Lcom/tangem/commands/CardStatus;", "getWalletPublicKey", "()[B", "tangem-core"})
public final class CreateWalletResponse implements com.tangem.commands.CommandResponse {
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    
    /**
     * Current status of the card [1 - Empty, 2 - Loaded, 3- Purged]
     */
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.CardStatus status = null;
    
    /**
     * Public key of a newly created blockchain wallet.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] walletPublicKey = null;
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    /**
     * Current status of the card [1 - Empty, 2 - Loaded, 3- Purged]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.CardStatus getStatus() {
        return null;
    }
    
    /**
     * Public key of a newly created blockchain wallet.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] getWalletPublicKey() {
        return null;
    }
    
    public CreateWalletResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.CardStatus status, @org.jetbrains.annotations.NotNull()
    byte[] walletPublicKey) {
        super();
    }
}