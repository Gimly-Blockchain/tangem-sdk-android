package com.tangem.commands.common;

import java.lang.System;

/**
 * This enum specifies modes for [WriteIssuerExtraDataCommand].
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/tangem/commands/common/IssuerDataMode;", "", "code", "", "(Ljava/lang/String;IB)V", "getCode", "()B", "ReadData", "WriteData", "ReadExtraData", "InitializeWritingExtraData", "WriteExtraData", "FinalizeExtraData", "Companion", "tangem-core"})
public enum IssuerDataMode {
    /*public static final*/ ReadData /* = new ReadData(0) */,
    /*public static final*/ WriteData /* = new WriteData(0) */,
    /*public static final*/ ReadExtraData /* = new ReadExtraData(0) */,
    /*public static final*/ InitializeWritingExtraData /* = new InitializeWritingExtraData(0) */,
    /*public static final*/ WriteExtraData /* = new WriteExtraData(0) */,
    /*public static final*/ FinalizeExtraData /* = new FinalizeExtraData(0) */;
    private final byte code = 0;
    private static final com.tangem.commands.common.IssuerDataMode[] values = null;
    public static final com.tangem.commands.common.IssuerDataMode.Companion Companion = null;
    
    public final byte getCode() {
        return 0;
    }
    
    IssuerDataMode(byte code) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/commands/common/IssuerDataMode$Companion;", "", "()V", "values", "", "Lcom/tangem/commands/common/IssuerDataMode;", "[Lcom/tangem/commands/common/IssuerDataMode;", "byCode", "code", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tangem.commands.common.IssuerDataMode byCode(byte code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}