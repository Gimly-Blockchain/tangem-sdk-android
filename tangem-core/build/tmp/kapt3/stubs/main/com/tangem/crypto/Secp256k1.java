package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/tangem/crypto/Secp256k1;", "", "()V", "calculateR", "Lorg/spongycastle/asn1/ASN1Integer;", "signature", "", "size", "", "calculateS", "checkSignatureForErrors", "", "enc", "generatePublicKey", "privateKeyArray", "generatePublicKey$tangem_core", "loadPublicKey", "Ljava/security/PublicKey;", "publicKeyArray", "loadPublicKey$tangem_core", "sign", "data", "sign$tangem_core", "toByte64", "verify", "", "publicKey", "message", "verify$tangem_core", "tangem-core"})
public final class Secp256k1 {
    public static final com.tangem.crypto.Secp256k1 INSTANCE = null;
    
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
    
    private final org.spongycastle.asn1.ASN1Integer calculateR(byte[] signature, int size) {
        return null;
    }
    
    private final org.spongycastle.asn1.ASN1Integer calculateS(byte[] signature, int size) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] sign$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray) {
        return null;
    }
    
    private final void checkSignatureForErrors(byte[] enc) {
    }
    
    private final byte[] toByte64(byte[] enc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] generatePublicKey$tangem_core(@org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray) {
        return null;
    }
    
    private Secp256k1() {
        super();
    }
}