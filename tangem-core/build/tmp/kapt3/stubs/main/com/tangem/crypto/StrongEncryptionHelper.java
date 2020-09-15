package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/tangem/crypto/StrongEncryptionHelper;", "Lcom/tangem/crypto/EncryptionHelper;", "()V", "keyA", "", "getKeyA", "()[B", "keyAgreement", "Ljavax/crypto/KeyAgreement;", "keyPair", "Ljava/security/KeyPair;", "generateKeyAgreement", "generateKeyPair", "generateSecret", "keyB", "provideKeyA", "tangem-core"})
public final class StrongEncryptionHelper implements com.tangem.crypto.EncryptionHelper {
    private final java.security.KeyPair keyPair = null;
    private final javax.crypto.KeyAgreement keyAgreement = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] keyA = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public byte[] getKeyA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public byte[] generateSecret(@org.jetbrains.annotations.NotNull()
    byte[] keyB) {
        return null;
    }
    
    private final java.security.KeyPair generateKeyPair() {
        return null;
    }
    
    private final javax.crypto.KeyAgreement generateKeyAgreement(java.security.KeyPair keyPair) {
        return null;
    }
    
    private final byte[] provideKeyA(java.security.KeyPair keyPair) {
        return null;
    }
    
    public StrongEncryptionHelper() {
        super();
    }
}