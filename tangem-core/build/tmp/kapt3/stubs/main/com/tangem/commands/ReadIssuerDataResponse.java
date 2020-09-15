package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/tangem/commands/ReadIssuerDataResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "issuerData", "", "issuerDataSignature", "issuerDataCounter", "", "(Ljava/lang/String;[B[BLjava/lang/Integer;)V", "getCardId", "()Ljava/lang/String;", "getIssuerData", "()[B", "getIssuerDataCounter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIssuerDataSignature", "tangem-core"})
public final class ReadIssuerDataResponse implements com.tangem.commands.CommandResponse {
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    
    /**
     * Data defined by issuer.
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] issuerData = null;
    
    /**
     * Issuer’s signature of [issuerData] with Issuer Data Private Key (which is kept on card).
     * Issuer’s signature of SHA256-hashed [cardId] concatenated with [issuerData]:
     * SHA256([cardId] | [issuerData]).
     * When flag [Settings.ProtectIssuerDataAgainstReplay] set in [SettingsMask] then signature of
     * SHA256-hashed CID Issuer_Data concatenated with and [issuerDataCounter]:
     * SHA256([cardId] | [issuerData] | [issuerDataCounter]).
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] issuerDataSignature = null;
    
    /**
     * An optional counter that protect issuer data against replay attack.
     * When flag [Settings.ProtectIssuerDataAgainstReplay] set in [SettingsMask]
     * then this value is mandatory and must increase on each execution of [WriteIssuerDataCommand].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer issuerDataCounter = null;
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    /**
     * Data defined by issuer.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] getIssuerData() {
        return null;
    }
    
    /**
     * Issuer’s signature of [issuerData] with Issuer Data Private Key (which is kept on card).
     * Issuer’s signature of SHA256-hashed [cardId] concatenated with [issuerData]:
     * SHA256([cardId] | [issuerData]).
     * When flag [Settings.ProtectIssuerDataAgainstReplay] set in [SettingsMask] then signature of
     * SHA256-hashed CID Issuer_Data concatenated with and [issuerDataCounter]:
     * SHA256([cardId] | [issuerData] | [issuerDataCounter]).
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] getIssuerDataSignature() {
        return null;
    }
    
    /**
     * An optional counter that protect issuer data against replay attack.
     * When flag [Settings.ProtectIssuerDataAgainstReplay] set in [SettingsMask]
     * then this value is mandatory and must increase on each execution of [WriteIssuerDataCommand].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIssuerDataCounter() {
        return null;
    }
    
    public ReadIssuerDataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] issuerData, @org.jetbrains.annotations.NotNull()
    byte[] issuerDataSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer issuerDataCounter) {
        super();
    }
}