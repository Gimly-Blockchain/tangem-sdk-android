package com.tangem.commands;

import java.lang.System;

/**
 * Signs transaction hashes using a wallet private key, stored on the card.
 *
 * @property hashes Array of transaction hashes.
 * @property cardId CID, Unique Tangem card ID number
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020!H\u0016J9\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2\'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00140)H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J9\u00100\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2\'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00140)H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/tangem/commands/SignCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/SignResponse;", "hashes", "", "", "([[B)V", "currentChunk", "", "hashSizes", "[[B", "hashesChunked", "", "requiresPin2", "", "getRequiresPin2", "()Z", "responses", "", "addTerminalSignature", "", "environment", "Lcom/tangem/SessionEnvironment;", "dataToSign", "tlvBuilder", "Lcom/tangem/common/tlv/TlvBuilder;", "deserialize", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "flattenHashes", "mapError", "Lcom/tangem/TangemError;", "card", "Lcom/tangem/commands/Card;", "error", "performPreCheck", "Lcom/tangem/TangemSdkError;", "run", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "sign", "Companion", "tangem-core"})
public final class SignCommand extends com.tangem.commands.Command<com.tangem.commands.SignResponse> {
    private final boolean requiresPin2 = true;
    private final int hashSizes = 0;
    private final java.util.List<java.util.List<byte[]>> hashesChunked = null;
    private int currentChunk = 0;
    private final java.util.List<com.tangem.commands.SignResponse> responses = null;
    private final byte[][] hashes = null;
    public static final int CHUNK_SIZE = 10;
    public static final com.tangem.commands.SignCommand.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SignResponse>, kotlin.Unit> callback) {
    }
    
    private final void sign(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SignResponse>, kotlin.Unit> callback) {
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    private final byte[] flattenHashes() {
        return null;
    }
    
    /**
     * Application can optionally submit a public key Terminal_PublicKey in [SignCommand].
     * Submitted key is stored by the Tangem card if it differs from a previous submitted Terminal_PublicKey.
     * The Tangem card will not enforce security delay if [SignCommand] will be called with
     * TerminalTransactionSignature parameter containing a correct signature of raw data to be signed made with TerminalPrivateKey
     * (this key should be generated and securily stored by the application).
     */
    private final void addTerminalSignature(com.tangem.SessionEnvironment environment, byte[] dataToSign, com.tangem.common.tlv.TlvBuilder tlvBuilder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.SignResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public SignCommand(@org.jetbrains.annotations.NotNull()
    byte[][] hashes) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/commands/SignCommand$Companion;", "", "()V", "CHUNK_SIZE", "", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}