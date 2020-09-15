package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/Database;", "Lcom/squareup/sqldelight/Transacter;", "cardValuesEntityQueries", "Lcom/tangem/CardValuesEntityQueries;", "getCardValuesEntityQueries", "()Lcom/tangem/CardValuesEntityQueries;", "Companion", "tangem-core"})
public abstract interface Database extends com.squareup.sqldelight.Transacter {
    public static final com.tangem.Database.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tangem.CardValuesEntityQueries getCardValuesEntityQueries();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/tangem/Database$Companion;", "", "()V", "Schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "getSchema", "()Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "invoke", "Lcom/tangem/Database;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "cardValuesAdapter", "Lcom/tangem/CardValues$Adapter;", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.sqldelight.db.SqlDriver.Schema getSchema() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.Database invoke(@org.jetbrains.annotations.NotNull()
        com.squareup.sqldelight.db.SqlDriver driver, @org.jetbrains.annotations.NotNull()
        com.tangem.CardValues.Adapter cardValuesAdapter) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}