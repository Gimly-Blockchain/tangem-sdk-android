package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tangem/commands/PurgeWalletResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "status", "Lcom/tangem/commands/CardStatus;", "(Ljava/lang/String;Lcom/tangem/commands/CardStatus;)V", "getCardId", "()Ljava/lang/String;", "getStatus", "()Lcom/tangem/commands/CardStatus;", "tangem-core"})
public final class PurgeWalletResponse implements com.tangem.commands.CommandResponse {
    
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
    
    public PurgeWalletResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.CardStatus status) {
        super();
    }
}