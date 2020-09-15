package com.tangem;

import java.lang.System;

/**
 * All possible encryption modes.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/tangem/EncryptionMode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "NONE", "FAST", "STRONG", "tangem-core"})
public enum EncryptionMode {
    /*public static final*/ NONE /* = new NONE(0) */,
    /*public static final*/ FAST /* = new FAST(0) */,
    /*public static final*/ STRONG /* = new STRONG(0) */;
    private final int code = 0;
    
    public final int getCode() {
        return 0;
    }
    
    EncryptionMode(int code) {
    }
}