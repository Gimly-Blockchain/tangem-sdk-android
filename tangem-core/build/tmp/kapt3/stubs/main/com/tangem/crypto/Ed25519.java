package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/tangem/crypto/Ed25519;", "", "()V", "generatePublicKey", "", "privateKeyArray", "generatePublicKey$tangem_core", "loadPublicKey", "Ljava/security/PublicKey;", "publicKeyArray", "loadPublicKey$tangem_core", "sign", "data", "sign$tangem_core", "verify", "", "publicKey", "message", "signature", "verify$tangem_core", "tangem-core"})
public final class Ed25519 {
    public static final com.tangem.crypto.Ed25519 INSTANCE = null;
    
    public final boolean verify$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    byte[] message, @org.jetbrains.annotations.NotNull()
    byte[] signature) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.security.PublicKey loadPublicKey$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] publicKeyArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] sign$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] generatePublicKey$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray) {
        return null;
    }
    
    private Ed25519() {
        super();
    }
}