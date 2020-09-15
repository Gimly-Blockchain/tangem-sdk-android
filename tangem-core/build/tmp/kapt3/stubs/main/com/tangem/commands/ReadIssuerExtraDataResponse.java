package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/tangem/commands/ReadIssuerExtraDataResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "size", "", "issuerData", "", "issuerDataSignature", "issuerDataCounter", "(Ljava/lang/String;Ljava/lang/Integer;[B[BLjava/lang/Integer;)V", "getCardId", "()Ljava/lang/String;", "getIssuerData", "()[B", "getIssuerDataCounter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIssuerDataSignature", "getSize", "tangem-core"})
public final class ReadIssuerExtraDataResponse implements com.tangem.commands.CommandResponse {
    
    /**
     * CID, Unique Tangem card ID number.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    
    /**
     * Size of all Issuer_Extra_Data field.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer size = null;
    
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
    @org.jetbrains.annotations.Nullable()
    private final byte[] issuerDataSignature = null;
    
    /**
     * An optional counter that protects issuer data against replay attack.
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
     * Size of all Issuer_Extra_Data field.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
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
    @org.jetbrains.annotations.Nullable()
    public final byte[] getIssuerDataSignature() {
        return null;
    }
    
    /**
     * An optional counter that protects issuer data against replay attack.
     * When flag [Settings.ProtectIssuerDataAgainstReplay] set in [SettingsMask]
     * then this value is mandatory and must increase on each execution of [WriteIssuerDataCommand].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIssuerDataCounter() {
        return null;
    }
    
    public ReadIssuerExtraDataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.NotNull()
    byte[] issuerData, @org.jetbrains.annotations.Nullable()
    byte[] issuerDataSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer issuerDataCounter) {
        super();
    }
}