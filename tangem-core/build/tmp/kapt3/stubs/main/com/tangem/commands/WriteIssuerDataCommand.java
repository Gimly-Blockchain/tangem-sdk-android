package com.tangem.commands;

import java.lang.System;

/**
 * This command writes 512-byte Issuer Data field and its issuer’s signature.
 * Issuer Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
 * format and payload of Issuer Data. For example, this field may contain information about
 * wallet balance signed by the issuer or additional issuer’s attestation data.
 * @property cardId CID, Unique Tangem card ID number.
 * @property issuerData Data provided by issuer.
 * @property issuerDataSignature Issuer’s signature of [issuerData] with Issuer Data Private Key (which is kept on card).
 * @property issuerDataCounter An optional counter that protect issuer data against replay attack.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \'2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\'B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u001f\u0010\u0016\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J!\u0010\u001f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0096\u0001J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/tangem/commands/WriteIssuerDataCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/WriteIssuerDataResponse;", "Lcom/tangem/commands/common/IssuerDataVerifier;", "issuerData", "", "issuerDataSignature", "issuerDataCounter", "", "issuerPublicKey", "verifier", "([B[BLjava/lang/Integer;[BLcom/tangem/commands/common/IssuerDataVerifier;)V", "Ljava/lang/Integer;", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "isCounterRequired", "", "card", "Lcom/tangem/commands/Card;", "isCounterValid", "(Ljava/lang/Integer;Lcom/tangem/commands/Card;)Z", "mapError", "Lcom/tangem/TangemError;", "error", "performPreCheck", "Lcom/tangem/TangemSdkError;", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "verify", "signature", "issuerDataToVerify", "Lcom/tangem/commands/common/IssuerDataToVerify;", "verifySignature", "publicKey", "cardId", "", "Companion", "tangem-core"})
public final class WriteIssuerDataCommand extends com.tangem.commands.Command<com.tangem.commands.WriteIssuerDataResponse> implements com.tangem.commands.common.IssuerDataVerifier {
    private final byte[] issuerData = null;
    private final byte[] issuerDataSignature = null;
    private final java.lang.Integer issuerDataCounter = null;
    private final byte[] issuerPublicKey = null;
    public static final int MAX_SIZE = 512;
    public static final com.tangem.commands.WriteIssuerDataCommand.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.TangemError mapError(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card, @org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error) {
        return null;
    }
    
    private final boolean isCounterValid(java.lang.Integer issuerDataCounter, com.tangem.commands.Card card) {
        return false;
    }
    
    private final boolean isCounterRequired(com.tangem.commands.Card card) {
        return false;
    }
    
    private final boolean verifySignature(byte[] publicKey, java.lang.String cardId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.WriteIssuerDataResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public WriteIssuerDataCommand(@org.jetbrains.annotations.NotNull()
    byte[] issuerData, @org.jetbrains.annotations.NotNull()
    byte[] issuerDataSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer issuerDataCounter, @org.jetbrains.annotations.Nullable()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataVerifier verifier) {
        super();
    }
    
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataToVerify issuerDataToVerify) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/commands/WriteIssuerDataCommand$Companion;", "", "()V", "MAX_SIZE", "", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}