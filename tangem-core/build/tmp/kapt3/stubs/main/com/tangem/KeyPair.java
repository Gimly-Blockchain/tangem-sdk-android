package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/tangem/KeyPair;", "", "privateKey", "", "curve", "Lcom/tangem/commands/EllipticCurve;", "([BLcom/tangem/commands/EllipticCurve;)V", "publicKey", "([B[B)V", "getPrivateKey", "()[B", "getPublicKey", "tangem-core"})
public final class KeyPair {
    @org.jetbrains.annotations.NotNull()
    private final byte[] publicKey = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] privateKey = null;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getPublicKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getPrivateKey() {
        return null;
    }
    
    public KeyPair(@org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    byte[] privateKey) {
        super();
    }
    
    public KeyPair(@org.jetbrains.annotations.NotNull()
    byte[] privateKey, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve) {
        super();
    }
}