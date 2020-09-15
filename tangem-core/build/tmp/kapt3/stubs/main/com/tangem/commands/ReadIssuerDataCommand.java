package com.tangem.commands;

import java.lang.System;

/**
 * This command returns 512-byte Issuer Data field and its issuer’s signature.
 * Issuer Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
 * format and payload of Issuer Data. For example, this field may contain information about
 * wallet balance signed by the issuer or additional issuer’s attestation data.
 * @property cardId CID, Unique Tangem card ID number.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J9\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\'\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0019\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0096\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/tangem/commands/ReadIssuerDataCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/ReadIssuerDataResponse;", "Lcom/tangem/commands/common/IssuerDataVerifier;", "issuerPublicKey", "", "verifier", "([BLcom/tangem/commands/common/IssuerDataVerifier;)V", "getIssuerPublicKey", "()[B", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "performPreCheck", "Lcom/tangem/TangemSdkError;", "card", "Lcom/tangem/commands/Card;", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "verify", "", "signature", "issuerDataToVerify", "Lcom/tangem/commands/common/IssuerDataToVerify;", "tangem-core"})
public final class ReadIssuerDataCommand extends com.tangem.commands.Command<com.tangem.commands.ReadIssuerDataResponse> implements com.tangem.commands.common.IssuerDataVerifier {
    @org.jetbrains.annotations.Nullable()
    private final byte[] issuerPublicKey = null;
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerDataResponse>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.ReadIssuerDataResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getIssuerPublicKey() {
        return null;
    }
    
    public ReadIssuerDataCommand(@org.jetbrains.annotations.Nullable()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataVerifier verifier) {
        super();
    }
    
    public ReadIssuerDataCommand() {
        super();
    }
    
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataToVerify issuerDataToVerify) {
        return false;
    }
}