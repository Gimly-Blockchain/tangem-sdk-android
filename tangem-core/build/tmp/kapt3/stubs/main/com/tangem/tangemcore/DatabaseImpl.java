package com.tangem.tangemcore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/tangem/tangemcore/DatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lcom/tangem/Database;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "cardValuesAdapter", "Lcom/tangem/CardValues$Adapter;", "(Lcom/squareup/sqldelight/db/SqlDriver;Lcom/tangem/CardValues$Adapter;)V", "getCardValuesAdapter$tangem_core", "()Lcom/tangem/CardValues$Adapter;", "cardValuesEntityQueries", "Lcom/tangem/tangemcore/CardValuesEntityQueriesImpl;", "getCardValuesEntityQueries", "()Lcom/tangem/tangemcore/CardValuesEntityQueriesImpl;", "Schema", "tangem-core"})
final class DatabaseImpl extends com.squareup.sqldelight.TransacterImpl implements com.tangem.Database {
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.tangemcore.CardValuesEntityQueriesImpl cardValuesEntityQueries = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.CardValues.Adapter cardValuesAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.tangemcore.CardValuesEntityQueriesImpl getCardValuesEntityQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.CardValues.Adapter getCardValuesAdapter$tangem_core() {
        return null;
    }
    
    public DatabaseImpl(@org.jetbrains.annotations.NotNull()
    com.squareup.sqldelight.db.SqlDriver driver, @org.jetbrains.annotations.NotNull()
    com.tangem.CardValues.Adapter cardValuesAdapter) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/tangem/tangemcore/DatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "tangem-core"})
    public static final class Schema implements com.squareup.sqldelight.db.SqlDriver.Schema {
        public static final com.tangem.tangemcore.DatabaseImpl.Schema INSTANCE = null;
        
        @java.lang.Override()
        public int getVersion() {
            return 0;
        }
        
        @java.lang.Override()
        public void create(@org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.db.SqlDriver driver) {
        }
        
        @java.lang.Override()
        public void migrate(@org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.db.SqlDriver driver, int oldVersion, int newVersion) {
        }
        
        private Schema() {
            super();
        }
    }
}