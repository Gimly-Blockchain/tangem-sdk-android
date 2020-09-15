package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&JG\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0006H&J\u00b8\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0011\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0095\u0001\u0010\u0015\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\t\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\t\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00130\u0016H&\u00a8\u0006\u0019"}, d2 = {"Lcom/tangem/CardValuesEntityQueries;", "Lcom/squareup/sqldelight/Transacter;", "deleteAll", "", "deleteByCardId", "cardId", "", "insertOrReplace", "isPin1Default", "", "isPin2Default", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;Lcom/tangem/VerificationState;)V", "selectByCardId", "Lcom/squareup/sqldelight/Query;", "Lcom/tangem/CardValues;", "T", "", "mapper", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "tangem-core"})
public abstract interface CardValuesEntityQueries extends com.squareup.sqldelight.Transacter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>com.squareup.sqldelight.Query<T> selectByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function6<? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super com.tangem.VerificationState, ? super com.tangem.VerificationState, ? super com.tangem.VerificationState, ? extends T> mapper);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.squareup.sqldelight.Query<com.tangem.CardValues> selectByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId);
    
    public abstract void insertOrReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin1Default, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification);
    
    public abstract void deleteAll();
    
    public abstract void deleteByCardId(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId);
}