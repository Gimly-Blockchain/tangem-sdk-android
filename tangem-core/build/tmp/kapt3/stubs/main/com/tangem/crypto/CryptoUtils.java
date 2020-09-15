package com.tangem.crypto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/tangem/crypto/CryptoUtils;", "", "()V", "generatePublicKey", "", "privateKeyArray", "curve", "Lcom/tangem/commands/EllipticCurve;", "generateRandomBytes", "length", "", "initCrypto", "", "loadPublicKey", "Ljava/security/PublicKey;", "publicKey", "verify", "", "message", "signature", "tangem-core"})
public final class CryptoUtils {
    public static final com.tangem.crypto.CryptoUtils INSTANCE = null;
    
    public final void initCrypto() {
    }
    
    /**
     * Generates ByteArray of random bytes.
     * It is used, among other things, to generate helper private keys
     * (not the one for the blockchains, that one is generated on the card and does not leave the card).
     *
     * @param length length of the ByteArray that is to be generated.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] generateRandomBytes(int length) {
        return null;
    }
    
    /**
     * Helper function to verify that the data was signed with a private key that corresponds
     * to the provided public key.
     *
     * @param publicKey Corresponding to the private key that was used to sing a message
     * @param message The data that was signed
     * @param signature Signed data
     * @param curve Elliptic curve used
     *
     * @return Result of a verification
     */
    public final boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    byte[] message, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve) {
        return false;
    }
    
    /**
     * Helper function that generates public key from a private key.
     *
     * @param privateKeyArray  A private key from which a public key is generated
     * @param curve Elliptic curve used
     *
     * @return Public key [ByteArray]
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] generatePublicKey(@org.jetbrains.annotations.NotNull()
    byte[] privateKeyArray, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.security.PublicKey loadPublicKey(@org.jetbrains.annotations.NotNull()
    byte[] publicKey, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curve) {
        return null;
    }
    
    private CryptoUtils() {
        super();
    }
}