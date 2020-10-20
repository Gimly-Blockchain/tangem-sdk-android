package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\'\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/tangem/CardSessionPreparable;", "", "prepare", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "tangem-core"})
public abstract interface CardSessionPreparable {
    
    public abstract void prepare(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<kotlin.Unit>, kotlin.Unit> callback);
}