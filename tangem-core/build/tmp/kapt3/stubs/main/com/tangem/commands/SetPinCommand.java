package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J9\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00190\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00190\u001dH\u0016J9\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00190\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00190\u001dH\u0002J9\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00190\u001dH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\'"}, d2 = {"Lcom/tangem/commands/SetPinCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/SetPinResponse;", "Lcom/tangem/CardSessionPreparable;", "pinType", "Lcom/tangem/commands/PinType;", "newPin1", "", "newPin2", "(Lcom/tangem/commands/PinType;[B[B)V", "requiresPin2", "", "getRequiresPin2", "()Z", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "mapError", "Lcom/tangem/TangemError;", "card", "Lcom/tangem/commands/Card;", "error", "prepare", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "requestNewPin", "run", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "Companion", "tangem-core"})
public final class SetPinCommand extends com.tangem.commands.Command<com.tangem.commands.SetPinResponse> implements com.tangem.CardSessionPreparable {
    private final boolean requiresPin2 = true;
    private final com.tangem.commands.PinType pinType = null;
    private byte[] newPin1;
    private byte[] newPin2;
    public static final com.tangem.commands.SetPinCommand.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @java.lang.Override()
    public void prepare(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<kotlin.Unit>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.TangemError mapError(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card, @org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error) {
        return null;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SetPinResponse>, kotlin.Unit> callback) {
    }
    
    private final void requestNewPin(com.tangem.CardSession session, kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<kotlin.Unit>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.SetPinResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public SetPinCommand(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.PinType pinType, @org.jetbrains.annotations.Nullable()
    byte[] newPin1, @org.jetbrains.annotations.Nullable()
    byte[] newPin2) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/tangem/commands/SetPinCommand$Companion;", "", "()V", "setPin1", "Lcom/tangem/commands/SetPinCommand;", "newPin1", "", "setPin2", "newPin2", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.SetPinCommand setPin1(@org.jetbrains.annotations.Nullable()
        byte[] newPin1) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.SetPinCommand setPin2(@org.jetbrains.annotations.Nullable()
        byte[] newPin2) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}