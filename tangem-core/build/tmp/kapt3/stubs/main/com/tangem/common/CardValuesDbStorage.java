package com.tangem.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tangem/common/CardValuesDbStorage;", "Lcom/tangem/common/CardValuesStorage;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/squareup/sqldelight/db/SqlDriver;)V", "cardValuesQueries", "Lcom/tangem/CardValuesEntityQueries;", "getValues", "Lcom/tangem/CardValues;", "cardId", "", "saveValues", "", "isPin1Default", "", "isPin2Default", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "Companion", "tangem-core"})
public final class CardValuesDbStorage implements com.tangem.common.CardValuesStorage {
    private final com.tangem.CardValuesEntityQueries cardValuesQueries = null;
    public static final com.tangem.common.CardValuesDbStorage.Companion Companion = null;
    
    @java.lang.Override()
    public void saveValues(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, boolean isPin1Default, boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.CardValues getValues(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId) {
        return null;
    }
    
    public CardValuesDbStorage(@org.jetbrains.annotations.NotNull()
    com.squareup.sqldelight.db.SqlDriver driver) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/common/CardValuesDbStorage$Companion;", "", "()V", "initJvm", "Lcom/tangem/common/CardValuesDbStorage;", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.common.CardValuesDbStorage initJvm() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}