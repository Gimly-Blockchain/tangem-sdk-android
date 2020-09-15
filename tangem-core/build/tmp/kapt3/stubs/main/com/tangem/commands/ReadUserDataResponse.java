package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/tangem/commands/ReadUserDataResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "userData", "", "userProtectedData", "userCounter", "", "userProtectedCounter", "(Ljava/lang/String;[B[BII)V", "getCardId", "()Ljava/lang/String;", "getUserCounter", "()I", "getUserData", "()[B", "getUserProtectedCounter", "getUserProtectedData", "tangem-core"})
public final class ReadUserDataResponse implements com.tangem.commands.CommandResponse {
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    
    /**
     * Data defined by user's App.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] userData = null;
    
    /**
     * Data defined by user's App (confirmed by PIN2).
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] userProtectedData = null;
    
    /**
     * Counter initialized by user's App and increased on every signing of new transaction
     */
    private final int userCounter = 0;
    
    /**
     * Counter initialized by user's App (confirmed by PIN2) and increased on every signing of new transaction
     */
    private final int userProtectedCounter = 0;
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    /**
     * Data defined by user's App.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] getUserData() {
        return null;
    }
    
    /**
     * Data defined by user's App (confirmed by PIN2).
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] getUserProtectedData() {
        return null;
    }
    
    /**
     * Counter initialized by user's App and increased on every signing of new transaction
     */
    public final int getUserCounter() {
        return 0;
    }
    
    /**
     * Counter initialized by user's App (confirmed by PIN2) and increased on every signing of new transaction
     */
    public final int getUserProtectedCounter() {
        return 0;
    }
    
    public ReadUserDataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] userData, @org.jetbrains.annotations.NotNull()
    byte[] userProtectedData, int userCounter, int userProtectedCounter) {
        super();
    }
}