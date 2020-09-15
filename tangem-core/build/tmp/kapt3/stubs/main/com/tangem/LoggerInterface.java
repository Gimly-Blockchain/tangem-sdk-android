package com.tangem;

import java.lang.System;

/**
 * Interface for logging events within the SDK.
 *
 * It allows to use Android logger or to choose another.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/tangem/LoggerInterface;", "", "e", "", "logTag", "", "message", "i", "v", "tangem-core"})
public abstract interface LoggerInterface {
    
    public abstract void i(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void e(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void v(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
}