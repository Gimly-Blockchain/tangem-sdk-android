package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003JT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\b\u0010 \u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/tangem/CardValues;", "", "cardId", "", "isPin1Default", "", "isPin2Default", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;)V", "getCardId", "()Ljava/lang/String;", "getCardValidation", "()Lcom/tangem/VerificationState;", "getCardVerification", "getCodeVerification", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;)Lcom/tangem/CardValues;", "equals", "other", "hashCode", "", "toString", "Adapter", "tangem-core"})
public final class CardValues {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isPin1Default = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isPin2Default = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.VerificationState cardVerification = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.VerificationState cardValidation = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.VerificationState codeVerification = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isPin1Default() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isPin2Default() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState getCardVerification() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState getCardValidation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState getCodeVerification() {
        return null;
    }
    
    public CardValues(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin1Default, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.VerificationState component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.CardValues copy(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin1Default, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/tangem/CardValues$Adapter;", "", "cardVerificationAdapter", "Lcom/squareup/sqldelight/ColumnAdapter;", "Lcom/tangem/VerificationState;", "", "cardValidationAdapter", "codeVerificationAdapter", "(Lcom/squareup/sqldelight/ColumnAdapter;Lcom/squareup/sqldelight/ColumnAdapter;Lcom/squareup/sqldelight/ColumnAdapter;)V", "getCardValidationAdapter", "()Lcom/squareup/sqldelight/ColumnAdapter;", "getCardVerificationAdapter", "getCodeVerificationAdapter", "tangem-core"})
    public static final class Adapter {
        @org.jetbrains.annotations.NotNull()
        private final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> cardVerificationAdapter = null;
        @org.jetbrains.annotations.NotNull()
        private final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> cardValidationAdapter = null;
        @org.jetbrains.annotations.NotNull()
        private final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> codeVerificationAdapter = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> getCardVerificationAdapter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> getCardValidationAdapter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> getCodeVerificationAdapter() {
            return null;
        }
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> cardVerificationAdapter, @org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> cardValidationAdapter, @org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.ColumnAdapter<com.tangem.VerificationState, java.lang.String> codeVerificationAdapter) {
            super();
        }
    }
}