package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/tangem/crypto/Pbkdf2;", "", "()V", "F", "Lorg/spongycastle/crypto/macs/HMac;", "deriveKey", "", "password", "salt", "iterations", "", "storeInt32BE", "", "value", "bytes", "offSet", "tangem-core"})
public final class Pbkdf2 {
    private final org.spongycastle.crypto.macs.HMac F = null;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] deriveKey(@org.jetbrains.annotations.NotNull()
    byte[] password, @org.jetbrains.annotations.NotNull()
    byte[] salt, int iterations) {
        return null;
    }
    
    /**
     * Convert a 32-bit integer value into a big-endian byte array
     *
     * @param value  The integer value to convert
     * @param bytes  The byte array to store the converted value
     * @param offSet The offset in the output byte array
     */
    private final void storeInt32BE(int value, byte[] bytes, int offSet) {
    }
    
    public Pbkdf2() {
        super();
    }
}