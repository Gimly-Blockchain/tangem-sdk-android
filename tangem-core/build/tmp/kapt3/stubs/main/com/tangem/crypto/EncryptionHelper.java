package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/tangem/crypto/EncryptionHelper;", "", "keyA", "", "getKeyA", "()[B", "generateSecret", "keyB", "Companion", "tangem-core"})
public abstract interface EncryptionHelper {
    public static final com.tangem.crypto.EncryptionHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] getKeyA();
    
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] generateSecret(@org.jetbrains.annotations.NotNull()
    byte[] keyB);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/crypto/EncryptionHelper$Companion;", "", "()V", "create", "Lcom/tangem/crypto/EncryptionHelper;", "encryptionMode", "Lcom/tangem/EncryptionMode;", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tangem.crypto.EncryptionHelper create(@org.jetbrains.annotations.NotNull()
        com.tangem.EncryptionMode encryptionMode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}