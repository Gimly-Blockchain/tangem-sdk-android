package com.tangem.commands;

import java.lang.System;

/**
 * Detailed information about card contents.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/tangem/commands/CardData;", "", "batchId", "", "manufactureDateTime", "Ljava/util/Date;", "issuerName", "blockchainName", "manufacturerSignature", "", "productMask", "Lcom/tangem/commands/ProductMask;", "tokenSymbol", "tokenContractAddress", "tokenDecimal", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;[BLcom/tangem/commands/ProductMask;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBatchId", "()Ljava/lang/String;", "getBlockchainName", "getIssuerName", "getManufactureDateTime", "()Ljava/util/Date;", "getManufacturerSignature", "()[B", "getProductMask", "()Lcom/tangem/commands/ProductMask;", "getTokenContractAddress", "getTokenDecimal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTokenSymbol", "tangem-core"})
public final class CardData {
    
    /**
     * Tangem internal manufacturing batch ID.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String batchId = null;
    
    /**
     * Timestamp of manufacturing.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date manufactureDateTime = null;
    
    /**
     * Name of the issuer.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String issuerName = null;
    
    /**
     * Name of the blockchain.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String blockchainName = null;
    
    /**
     * Signature of CardId with manufacturer’s private key.
     */
    @org.jetbrains.annotations.Nullable()
    private final byte[] manufacturerSignature = null;
    
    /**
     * Mask of products enabled on card.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.commands.ProductMask productMask = null;
    
    /**
     * Name of the token.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tokenSymbol = null;
    
    /**
     * Smart contract address.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tokenContractAddress = null;
    
    /**
     * Number of decimals in token value.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer tokenDecimal = null;
    
    /**
     * Tangem internal manufacturing batch ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBatchId() {
        return null;
    }
    
    /**
     * Timestamp of manufacturing.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getManufactureDateTime() {
        return null;
    }
    
    /**
     * Name of the issuer.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssuerName() {
        return null;
    }
    
    /**
     * Name of the blockchain.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockchainName() {
        return null;
    }
    
    /**
     * Signature of CardId with manufacturer’s private key.
     */
    @org.jetbrains.annotations.Nullable()
    public final byte[] getManufacturerSignature() {
        return null;
    }
    
    /**
     * Mask of products enabled on card.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.ProductMask getProductMask() {
        return null;
    }
    
    /**
     * Name of the token.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenSymbol() {
        return null;
    }
    
    /**
     * Smart contract address.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenContractAddress() {
        return null;
    }
    
    /**
     * Number of decimals in token value.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTokenDecimal() {
        return null;
    }
    
    public CardData(@org.jetbrains.annotations.Nullable()
    java.lang.String batchId, @org.jetbrains.annotations.Nullable()
    java.util.Date manufactureDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String issuerName, @org.jetbrains.annotations.Nullable()
    java.lang.String blockchainName, @org.jetbrains.annotations.Nullable()
    byte[] manufacturerSignature, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.ProductMask productMask, @org.jetbrains.annotations.Nullable()
    java.lang.String tokenSymbol, @org.jetbrains.annotations.Nullable()
    java.lang.String tokenContractAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tokenDecimal) {
        super();
    }
}