package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/tangem/Log;", "", "()V", "loggerInstance", "Lcom/tangem/LoggerInterface;", "e", "", "logTag", "", "message", "i", "setLogger", "logger", "v", "tangem-core"})
public final class Log {
    private static com.tangem.LoggerInterface loggerInstance;
    public static final com.tangem.Log INSTANCE = null;
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String logTag, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setLogger(@org.jetbrains.annotations.NotNull()
    com.tangem.LoggerInterface logger) {
    }
    
    private Log() {
        super();
    }
}