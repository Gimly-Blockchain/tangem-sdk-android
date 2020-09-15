package com.tangem.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&\u00a8\u0006\u000f"}, d2 = {"Lcom/tangem/common/CardValuesStorage;", "", "getValues", "Lcom/tangem/CardValues;", "cardId", "", "saveValues", "", "isPin1Default", "", "isPin2Default", "cardVerification", "Lcom/tangem/VerificationState;", "cardValidation", "codeVerification", "tangem-core"})
public abstract interface CardValuesStorage {
    
    public abstract void saveValues(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, boolean isPin1Default, boolean isPin2Default, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardVerification, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState cardValidation, @org.jetbrains.annotations.Nullable()
    com.tangem.VerificationState codeVerification);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.tangem.CardValues getValues(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId);
}