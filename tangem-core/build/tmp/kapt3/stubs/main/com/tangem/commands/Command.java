package com.tangem.commands;

import java.lang.System;

/**
 * Basic class for Tangem card commands
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016JA\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00180\u001eH\u0002J9\u0010#\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00180\u001eH\u0016J7\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00180\u001eJA\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u001b\u001a\u00020\u001c2\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0\u001f\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00180\u001eH\u0002J9\u0010(\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f\u00a2\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00180\u001eH\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006)"}, d2 = {"Lcom/tangem/commands/Command;", "T", "Lcom/tangem/commands/CommandResponse;", "Lcom/tangem/commands/ApduSerializable;", "Lcom/tangem/CardSessionRunnable;", "()V", "performPreflightRead", "", "getPerformPreflightRead", "()Z", "requiresPin2", "getRequiresPin2", "deserializeSecurityDelay", "", "responseApdu", "Lcom/tangem/common/apdu/ResponseApdu;", "(Lcom/tangem/common/apdu/ResponseApdu;)Ljava/lang/Integer;", "mapError", "Lcom/tangem/TangemError;", "card", "Lcom/tangem/commands/Card;", "error", "performPreCheck", "requestPin", "", "pinType", "Lcom/tangem/commands/PinType;", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "run", "transceive", "transceiveApdu", "apdu", "Lcom/tangem/common/apdu/CommandApdu;", "transceiveInternal", "tangem-core"})
public abstract class Command<T extends com.tangem.commands.CommandResponse> implements com.tangem.commands.ApduSerializable<T>, com.tangem.CardSessionRunnable<T> {
    private final boolean performPreflightRead = true;
    private final boolean requiresPin2 = false;
    
    public boolean getPerformPreflightRead() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.tangem.TangemError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.tangem.TangemError mapError(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card, @org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error) {
        return null;
    }
    
    public final void transceive(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback) {
    }
    
    private final void transceiveInternal(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback) {
    }
    
    private final void transceiveApdu(com.tangem.common.apdu.CommandApdu apdu, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>, kotlin.Unit> callback) {
    }
    
    /**
     * Helper method to parse security delay information received from a card.
     *
     * @return Remaining security delay in milliseconds.
     */
    private final java.lang.Integer deserializeSecurityDelay(com.tangem.common.apdu.ResponseApdu responseApdu) {
        return null;
    }
    
    private final void requestPin(com.tangem.commands.PinType pinType, com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback) {
    }
    
    public Command() {
        super();
    }
}