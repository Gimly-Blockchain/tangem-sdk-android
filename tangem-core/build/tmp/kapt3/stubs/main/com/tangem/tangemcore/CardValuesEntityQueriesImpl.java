package com.tangem.tangemcore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016JG\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u00b8\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0095\u0001\u0010\u001e\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/tangem/tangemcore/CardValuesEntityQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lcom/tangem/CardValuesEntityQueries;", "database", "Lcom/tangem/tangemcore/DatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/tangem/tangemcore/DatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "selectByCardId", "", "Lcom/squareup/sqldelight/Query;", "getSelectByCardId$tangem_core", "()Ljava/util/List;", "deleteAll", "", "deleteByCardId", "cardId", "", "insertOrReplace", "isPin1Default", "", "isPin2Default", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;)V", "Lcom/tangem/CardValues;", "T", "", "mapper", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "SelectByCardIdQuery", "tangem-core"})
final class CardValuesEntityQueriesImpl extends com.squareup.sqldelight.TransacterImpl implements com.tangem.CardValuesEntityQueries {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.squareup.sqldelight.Query<?>> selectByCardId = null;
    private final com.tangem.tangemcore.DatabaseImpl database = null;
    private final com.squareup.sqldelight.db.SqlDriver driver = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.squareup.sqldelight.Query<?>> getSelectByCardId$tangem_core() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends java.lang.Object>com.squareup.sqldelight.Query<T> selectByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function6<? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super com.tangem.VerificationState, ? super com.tangem.VerificationState, ? super com.tangem.VerificationState, ? extends T> mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.squareup.sqldelight.Query<com.tangem.CardValues> selectByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId) {
        return null;
    }
    
    @java.lang.Override()
    public void insertOrReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin1Default, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification) {
    }
    
    @java.lang.Override()
    public void deleteAll() {
    }
    
    @java.lang.Override()
    public void deleteByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId) {
    }
    
    public CardValuesEntityQueriesImpl(@org.jetbrains.annotations.NotNull()
    com.tangem.tangemcore.DatabaseImpl database, @org.jetbrains.annotations.NotNull()
    com.squareup.sqldelight.db.SqlDriver driver) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/tangem/tangemcore/CardValuesEntityQueriesImpl$SelectByCardIdQuery;", "T", "", "Lcom/squareup/sqldelight/Query;", "cardId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lcom/tangem/tangemcore/CardValuesEntityQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "execute", "toString", "tangem-core"})
    final class SelectByCardIdQuery<T extends java.lang.Object> extends com.squareup.sqldelight.Query<T> {
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String cardId = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.squareup.sqldelight.db.SqlCursor execute() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SelectByCardIdQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String cardId, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.squareup.sqldelight.db.SqlCursor, ? extends T> mapper) {
            super(null, null);
        }
    }
}