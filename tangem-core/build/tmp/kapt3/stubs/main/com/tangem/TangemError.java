package com.tangem;

import java.lang.System;

/**
 * An interface for any error that may occur when performing Tangem SDK tasks.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/tangem/TangemError;", "", "code", "", "getCode", "()I", "customMessage", "", "getCustomMessage", "()Ljava/lang/String;", "setCustomMessage", "(Ljava/lang/String;)V", "tangem-core"})
public abstract interface TangemError {
    
    public abstract int getCode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCustomMessage();
    
    public abstract void setCustomMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
}