package com.tangem.commands;

import java.lang.System;

/**
 * Elliptic curve used for wallet key operations.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/tangem/commands/EllipticCurve;", "", "curve", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCurve", "()Ljava/lang/String;", "Secp256k1", "Ed25519", "Companion", "tangem-core"})
public enum EllipticCurve {
    @com.google.gson.annotations.SerializedName(value = "secp256k1")
    /*public static final*/ Secp256k1 /* = new Secp256k1(null) */,
    @com.google.gson.annotations.SerializedName(value = "ed25519")
    /*public static final*/ Ed25519 /* = new Ed25519(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String curve = null;
    private static final com.tangem.commands.EllipticCurve[] values = null;
    public static final com.tangem.commands.EllipticCurve.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurve() {
        return null;
    }
    
    EllipticCurve(java.lang.String curve) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/commands/EllipticCurve$Companion;", "", "()V", "values", "", "Lcom/tangem/commands/EllipticCurve;", "[Lcom/tangem/commands/EllipticCurve;", "byName", "curve", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tangem.commands.EllipticCurve byName(@org.jetbrains.annotations.NotNull()
        java.lang.String curve) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}