package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tangem/commands/SetPinResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "status", "Lcom/tangem/commands/SetPinStatus;", "(Ljava/lang/String;Lcom/tangem/commands/SetPinStatus;)V", "getCardId", "()Ljava/lang/String;", "getStatus", "()Lcom/tangem/commands/SetPinStatus;", "tangem-core"})
public final class SetPinResponse implements com.tangem.commands.CommandResponse {
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.SetPinStatus status = null;
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.SetPinStatus getStatus() {
        return null;
    }
    
    public SetPinResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.SetPinStatus status) {
        super();
    }
}