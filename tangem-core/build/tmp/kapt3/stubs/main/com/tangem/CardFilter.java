package com.tangem;

import java.lang.System;

/**
 * Filter that can be used to limit cards that can be interacted with in TangemSdk.
 *
 * @property allowedCardTypes Type of cards that are allowed to be interacted with in TangemSdk.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/tangem/CardFilter;", "", "allowedCardTypes", "Ljava/util/EnumSet;", "Lcom/tangem/common/extensions/CardType;", "(Ljava/util/EnumSet;)V", "getAllowedCardTypes", "()Ljava/util/EnumSet;", "setAllowedCardTypes", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tangem-core"})
public final class CardFilter {
    @org.jetbrains.annotations.NotNull()
    private java.util.EnumSet<com.tangem.common.extensions.CardType> allowedCardTypes;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.EnumSet<com.tangem.common.extensions.CardType> getAllowedCardTypes() {
        return null;
    }
    
    public final void setAllowedCardTypes(@org.jetbrains.annotations.NotNull()
    java.util.EnumSet<com.tangem.common.extensions.CardType> p0) {
    }
    
    public CardFilter(@org.jetbrains.annotations.NotNull()
    java.util.EnumSet<com.tangem.common.extensions.CardType> allowedCardTypes) {
        super();
    }
    
    public CardFilter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.EnumSet<com.tangem.common.extensions.CardType> component1() {
        return null;
    }
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     *
     * @property allowedCardTypes Type of cards that are allowed to be interacted with in TangemSdk.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.CardFilter copy(@org.jetbrains.annotations.NotNull()
    java.util.EnumSet<com.tangem.common.extensions.CardType> allowedCardTypes) {
        return null;
    }
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     *
     * @property allowedCardTypes Type of cards that are allowed to be interacted with in TangemSdk.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     *
     * @property allowedCardTypes Type of cards that are allowed to be interacted with in TangemSdk.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Filter that can be used to limit cards that can be interacted with in TangemSdk.
     *
     * @property allowedCardTypes Type of cards that are allowed to be interacted with in TangemSdk.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}