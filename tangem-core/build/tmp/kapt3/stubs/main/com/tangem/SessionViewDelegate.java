package com.tangem;

import java.lang.System;

/**
 * Allows interaction with users and shows visual elements.
 *
 * Its default implementation, DefaultCardManagerDelegate, is in our tangem-sdk module.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J3\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000fH&J3\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H&J\u001e\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0014\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&\u00a8\u0006\""}, d2 = {"Lcom/tangem/SessionViewDelegate;", "", "onDelay", "", "total", "", "current", "step", "onError", "error", "Lcom/tangem/TangemError;", "onPinChangeRequested", "pinType", "Lcom/tangem/commands/PinType;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pin", "onPinRequested", "onSecurityDelay", "ms", "totalDurationSeconds", "onSessionStarted", "cardId", "message", "Lcom/tangem/Message;", "onSessionStopped", "onTagConnected", "onTagLost", "onWrongCard", "wrongValueType", "Lcom/tangem/WrongValueType;", "tangem-core"})
public abstract interface SessionViewDelegate {
    
    /**
     * It is called when user is expected to scan a Tangem Card with an Android device.
     */
    public abstract void onSessionStarted(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message message);
    
    /**
     * It is called when security delay is triggered by the card.
     * A user is expected to hold the card until the security delay is over.
     */
    public abstract void onSecurityDelay(int ms, int totalDurationSeconds);
    
    /**
     * It is called when long tasks are performed.
     * A user is expected to hold the card until the task is complete.
     */
    public abstract void onDelay(int total, int current, int step);
    
    /**
     * It is called when user takes the card away from the Android device during the scanning
     * (for example when security delay is in progress) and the TagLostException is received.
     */
    public abstract void onTagLost();
    
    public abstract void onTagConnected();
    
    public abstract void onWrongCard(@org.jetbrains.annotations.NotNull()
    com.tangem.WrongValueType wrongValueType);
    
    /**
     * It is called when NFC session was completed and a user can take the card away from the Android device.
     */
    public abstract void onSessionStopped(@org.jetbrains.annotations.Nullable()
    com.tangem.Message message);
    
    /**
     * It is called when some error occur during NFC session.
     */
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error);
    
    /**
     * It is called when a user is expected to enter pin code.
     */
    public abstract void onPinRequested(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.PinType pinType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback);
    
    /**
     * It is called when a user wants to change pin code.
     */
    public abstract void onPinChangeRequested(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.PinType pinType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback);
    
    /**
     * Allows interaction with users and shows visual elements.
     *
     * Its default implementation, DefaultCardManagerDelegate, is in our tangem-sdk module.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}