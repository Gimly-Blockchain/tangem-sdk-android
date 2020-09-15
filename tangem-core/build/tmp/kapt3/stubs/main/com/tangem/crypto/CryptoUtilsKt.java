package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u001a\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"ENCRYPTION_SPEC_NO_PADDING", "", "ENCRYPTION_SPEC_PKCS7", "decrypt", "", "key", "usePkcs7", "", "encrypt", "pbkdf2Hash", "salt", "iterations", "", "sign", "privateKeyArray", "curve", "Lcom/tangem/commands/EllipticCurve;", "tangem-core"})
public final class CryptoUtilsKt {
    private static final java.lang.String ENCRYPTION_SPEC_PKCS7 = "AES/CBC/PKCS7PADDING";
    private static final java.lang.String ENCRYPTION_SPEC_NO_PADDING = "AES/CBC/NOPADDING";
    
    /**
     * Extension function to sign a ByteArray with an elliptic curve cryptography.
     *
     * @param privateKeyArray Key to sign data
     * @param curve Elliptic curve that is used to sign data
     *
     * @return Signed data
     */
    @org.jetbrains.annotations.NotNull()
    public static final byte[] sign(@org.jetbrains.annotations.NotNull()
    byte[] $this$sign, @org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] encrypt(@org.jetbrains.annotations.NotNull()
    byte[] $this$encrypt, @org.jetbrains.annotations.NotNull()
    byte[] key, boolean usePkcs7) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] decrypt(@org.jetbrains.annotations.NotNull()
    byte[] $this$decrypt, @org.jetbrains.annotations.NotNull()
    byte[] key, boolean usePkcs7) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] pbkdf2Hash(@org.jetbrains.annotations.NotNull()
    byte[] $this$pbkdf2Hash, @org.jetbrains.annotations.NotNull()
    byte[] salt, int iterations) {
        return null;
    }
}