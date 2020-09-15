package com.tangem;

import java.lang.System;

/**
 * Allows interaction with Tangem cards. Should be opened before sending commands.
 *
 * @property environment
 * @property reader  is an interface that is responsible for NFC connection and
 * transfer of data to and from the Tangem Card.
 * @property viewDelegate is an  interface that allows interaction with users and shows relevant UI.
 * @property cardId ID, Unique Tangem card ID number. If not null, the SDK will check that you the card
 * with which you tapped a phone has this [cardId] and SDK will return
 * the [TangemSdkError.WrongCardNumber] otherwise.
 * @property initialMessage A custom description that will be shown at the beginning of the NFC session.
 * If null, a default header and text body will be used.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020+H\u0002J\u0006\u0010/\u001a\u00020+JB\u00100\u001a\u00020+28\u00101\u001a4\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0015\u0012\u0013\u0018\u000106\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020+02H\u0002J/\u00108\u001a\u00020+2\'\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020+09J\u0006\u0010:\u001a\u00020+J7\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=2\'\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020+09J@\u0010>\u001a\u00020+28\u00101\u001a4\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0015\u0012\u0013\u0018\u000106\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020+02JV\u0010?\u001a\u00020+\"\u000e\b\u0000\u0010@*\b\u0012\u0004\u0012\u0002HB0A\"\b\b\u0001\u0010B*\u00020C2\u0006\u0010D\u001a\u0002H@2\'\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002HB0%\u00a2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020+09\u00a2\u0006\u0002\u0010EJ\u0014\u0010F\u001a\u00020+2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010H\u001a\u00020+H\u0002J\u0010\u0010I\u001a\u00020+2\u0006\u00107\u001a\u000206H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n !*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006J"}, d2 = {"Lcom/tangem/CardSession;", "", "environmentService", "Lcom/tangem/SessionEnvironmentService;", "reader", "Lcom/tangem/CardReader;", "viewDelegate", "Lcom/tangem/SessionViewDelegate;", "cardId", "", "initialMessage", "Lcom/tangem/Message;", "(Lcom/tangem/SessionEnvironmentService;Lcom/tangem/CardReader;Lcom/tangem/SessionViewDelegate;Ljava/lang/String;Lcom/tangem/Message;)V", "connectedTag", "Lcom/tangem/TagType;", "getConnectedTag", "()Lcom/tangem/TagType;", "setConnectedTag", "(Lcom/tangem/TagType;)V", "environment", "Lcom/tangem/SessionEnvironment;", "getEnvironment", "()Lcom/tangem/SessionEnvironment;", "performPreflightRead", "", "pin2Required", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "state", "Lcom/tangem/CardSessionState;", "tag", "kotlin.jvm.PlatformType", "getViewDelegate", "()Lcom/tangem/SessionViewDelegate;", "decrypt", "Lcom/tangem/common/CompletionResult;", "Lcom/tangem/common/apdu/ResponseApdu;", "result", "establishEncryptionIfNeeded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleError", "", "throwable", "", "handleTagLost", "pause", "preflightCheck", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "session", "Lcom/tangem/TangemError;", "error", "readSlixTag", "Lkotlin/Function1;", "resume", "send", "apdu", "Lcom/tangem/common/apdu/CommandApdu;", "start", "startWithRunnable", "T", "Lcom/tangem/CardSessionRunnable;", "R", "Lcom/tangem/commands/CommandResponse;", "runnable", "(Lcom/tangem/CardSessionRunnable;Lkotlin/jvm/functions/Function1;)V", "stop", "message", "stopSession", "stopWithError", "tangem-core"})
public final class CardSession {
    @org.jetbrains.annotations.Nullable()
    private com.tangem.TagType connectedTag;
    
    /**
     * True if some operation is still in progress.
     */
    private com.tangem.CardSessionState state = com.tangem.CardSessionState.Inactive;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final java.lang.String tag = null;
    private boolean performPreflightRead = true;
    private boolean pin2Required = false;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.SessionEnvironment environment = null;
    private final com.tangem.SessionEnvironmentService environmentService = null;
    private final com.tangem.CardReader reader = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.SessionViewDelegate viewDelegate = null;
    private java.lang.String cardId;
    private final com.tangem.Message initialMessage = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.TagType getConnectedTag() {
        return null;
    }
    
    public final void setConnectedTag(@org.jetbrains.annotations.Nullable()
    com.tangem.TagType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.SessionEnvironment getEnvironment() {
        return null;
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
    
    /**
     * This method starts a card session, performs preflight [ReadCommand],
     * invokes [CardSessionRunnable.run] and closes the session.
     * @param runnable [CardSessionRunnable] that will be performed in the session.
     * @param callback will be triggered with a [CompletionResult] of a session.
     */
    public final <T extends com.tangem.CardSessionRunnable<R>, R extends com.tangem.commands.CommandResponse>void startWithRunnable(@org.jetbrains.annotations.NotNull()
    T runnable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<R>, kotlin.Unit> callback) {
    }
    
    /**
     * Starts a card session and performs preflight [ReadCommand].
     * @param callback: callback with the card session. Can contain [TangemSdkError] if something goes wrong.
     */
    public final void start(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tangem.CardSession, ? super com.tangem.TangemError, kotlin.Unit> callback) {
    }
    
    private final void handleTagLost() {
    }
    
    private final void preflightCheck(kotlin.jvm.functions.Function2<? super com.tangem.CardSession, ? super com.tangem.TangemError, kotlin.Unit> callback) {
    }
    
    public final void readSlixTag(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>, kotlin.Unit> callback) {
    }
    
    /**
     * Stops the current session with the text message.
     * @param message If null, the default message will be shown.
     */
    private final void stop(com.tangem.Message message) {
    }
    
    /**
     * Stops the current session on error.
     * @param error An error that will be shown.
     */
    private final void stopWithError(com.tangem.TangemError error) {
    }
    
    private final void stopSession() {
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.CommandApdu apdu, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu>, kotlin.Unit> callback) {
    }
    
    public final void pause() {
    }
    
    public final void resume() {
    }
    
    private final com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu> decrypt(com.tangem.common.CompletionResult<com.tangem.common.apdu.ResponseApdu> result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.SessionViewDelegate getViewDelegate() {
        return null;
    }
    
    public CardSession(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironmentService environmentService, @org.jetbrains.annotations.NotNull()
    com.tangem.CardReader reader, @org.jetbrains.annotations.NotNull()
    com.tangem.SessionViewDelegate viewDelegate, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage) {
        super();
    }
}