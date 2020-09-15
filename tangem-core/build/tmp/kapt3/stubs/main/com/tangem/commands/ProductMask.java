package com.tangem.commands;

import java.lang.System;

/**
 * Mask of products enabled on card
 * @property rawValue Products mask values,
 * while flags definitions and values are in [ProductMask.Companion] as constants.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/tangem/commands/ProductMask;", "", "rawValue", "", "(I)V", "getRawValue", "()I", "component1", "contains", "", "product", "Lcom/tangem/commands/Product;", "copy", "equals", "other", "hashCode", "toString", "", "tangem-core"})
public final class ProductMask {
    private final int rawValue = 0;
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Product product) {
        return false;
    }
    
    public final int getRawValue() {
        return 0;
    }
    
    public ProductMask(int rawValue) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    /**
     * Mask of products enabled on card
     * @property rawValue Products mask values,
     * while flags definitions and values are in [ProductMask.Companion] as constants.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.ProductMask copy(int rawValue) {
        return null;
    }
    
    /**
     * Mask of products enabled on card
     * @property rawValue Products mask values,
     * while flags definitions and values are in [ProductMask.Companion] as constants.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Mask of products enabled on card
     * @property rawValue Products mask values,
     * while flags definitions and values are in [ProductMask.Companion] as constants.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Mask of products enabled on card
     * @property rawValue Products mask values,
     * while flags definitions and values are in [ProductMask.Companion] as constants.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}