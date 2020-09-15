package com.tangem;

import java.lang.System;

/**
 * Allows interaction between the phone or any other terminal and Tangem card.
 *
 * Its default implementation, NfcCardReader, is in our tangem-sdk module.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH&J1\u0010\u000f\u001a\u00020\u000e2\'\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0011H&J\b\u0010\u0017\u001a\u00020\u000eH&J\b\u0010\u0018\u001a\u00020\u000eH&J\u0012\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH&J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ9\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\'\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u000e0\u0011H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/tangem/CardReader;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "tag", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/tangem/TagType;", "getTag", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "pauseSession", "", "readSlixTag", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lcom/tangem/common/apdu/ResponseApdu;", "Lkotlin/ParameterName;", "name", "result", "resumeSession", "startSession", "stopSession", "cancelled", "", "transceiveApdu", "apdu", "Lcom/tangem/common/apdu/CommandApdu;", "(Lcom/tangem/common/apdu/CommandApdu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "response", "tangem-core"})
public abstract interface CardReader {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.channels.BroadcastChannel<com.tangem.TagType> getTag();
    
    @org.jetbrains.annotations.Nullable()
    public abstract kotlinx.coroutines.CoroutineScope getScope();
    
    public abstract void setScope(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.CoroutineScope p0);
    
    /**
     * Sends data to the card and receives the reply in an asynchronous way using coroutines.
     *
     * @param apdu Data to be sent. [CommandApdu] serializes it to a [ByteArray]
     * @param callback Returns response from the card,
     * [ResponseApdu] Allows to convert raw data to [Tlv]
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object transceiveApdu(@org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.CommandApdu apdu, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>> p1);
    
    /**
     * Sends data to the card and receives the reply.
     *
     * @param apdu Data to be sent. [CommandApdu] serializes it to a [ByteArray]
     * @param callback Returns response from the card,
     * [ResponseApdu] Allows to convert raw data to [Tlv]
     */
    public abstract void transceiveApdu(@org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.CommandApdu apdu, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>, kotlin.Unit> callback);
    
    /**
     * Signals to [CardReader] to become ready to transceive data.
     */
    public abstract void startSession();
    
    /**
     * Signals to [CardReader] that no further NFC transition is expected.
     */
    public abstract void stopSession(boolean cancelled);
    
    public abstract void pauseSession();
    
    public abstract void resumeSession();
    
    public abstract void readSlixTag(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>, kotlin.Unit> callback);
    
    /**
     * Allows interaction between the phone or any other terminal and Tangem card.
     *
     * Its default implementation, NfcCardReader, is in our tangem-sdk module.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}