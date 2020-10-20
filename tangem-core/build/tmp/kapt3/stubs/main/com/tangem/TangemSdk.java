package com.tangem;

import java.lang.System;

/**
 * The main interface of Tangem SDK that allows your app to communicate with Tangem cards.
 *
 * @property reader is an interface that is responsible for NFC connection and
 * transfer of data to and from the Tangem Card.
 * Its default implementation, NfcCardReader, is in our tangem-sdk module.
 * @property viewDelegate An interface that allows interaction with users and shows relevant UI.
 * Its default implementation, DefaultCardSessionViewDelegate, is in our tangem-sdk module.
 * @property config allows to change a number of parameters for communication with Tangem cards.
 * Do not change the default values unless you know what you are doing.
 * @param  terminalKeysService allows to retrieve saved terminal keys.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 p2\u00020\u0001:\u0001pB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJY\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2+\u0010\u001c\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u001fj\u0002` 0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJS\u0010$\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\'0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJS\u0010(\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\'0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJG\u0010)\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020*0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJ]\u0010+\u001a\u00020\u00142\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2+\u0010\u001c\u001a\'\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u001fj\u0002`.0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJ;\u0010/\u001a\u00020\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002000\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJ_\u00101\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002090\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJG\u0010:\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020;0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJc\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020>2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020?0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJG\u0010@\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020A0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJI\u0010B\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020C0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dH\u0007JG\u0010D\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020E0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJ;\u0010F\u001a\u00020\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002090\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJZ\u0010G\u001a\u00020\u00142\f\u0010H\u001a\b\u0012\u0004\u0012\u00020&0I2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020J0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\u0002\u0010KJX\u0010L\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b28\u0010\u001c\u001a4\u0012\u0013\u0012\u00110N\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(O\u0012\u0015\u0012\u0013\u0018\u00010P\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(Q\u0012\u0004\u0012\u00020\u00140MJ_\u0010R\u001a\u00020\u0014\"\b\b\u0000\u0010S*\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u0002HS0V2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002HS0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJQ\u0010W\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010X\u001a\u00020>2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020Y0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJU\u0010Z\u001a\u00020\u00142\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dJh\u0010^\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020b0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\u0002\u0010cJr\u0010d\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010_\u001a\u00020&2\u0006\u0010e\u001a\u00020&2\u0006\u0010f\u001a\u00020&2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020b0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dH\u0007\u00a2\u0006\u0002\u0010gJ`\u0010h\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010i\u001a\u00020&2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020k0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\u0002\u0010lJ`\u0010m\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010n\u001a\u00020&2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020k0\u001e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\u0002\u0010lR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006q"}, d2 = {"Lcom/tangem/TangemSdk;", "", "reader", "Lcom/tangem/CardReader;", "viewDelegate", "Lcom/tangem/SessionViewDelegate;", "config", "Lcom/tangem/Config;", "cardValuesStorage", "Lcom/tangem/common/CardValuesStorage;", "terminalKeysService", "Lcom/tangem/common/TerminalKeysService;", "(Lcom/tangem/CardReader;Lcom/tangem/SessionViewDelegate;Lcom/tangem/Config;Lcom/tangem/common/CardValuesStorage;Lcom/tangem/common/TerminalKeysService;)V", "getConfig", "()Lcom/tangem/Config;", "setConfig", "(Lcom/tangem/Config;)V", "environmentService", "Lcom/tangem/SessionEnvironmentService;", "changeFilesSettings", "", "changes", "", "Lcom/tangem/commands/file/FileSettingsChange;", "cardId", "", "initialMessage", "Lcom/tangem/Message;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lcom/tangem/commands/SimpleResponse;", "Lcom/tangem/commands/file/ChangeFileSettingsResponse;", "Lkotlin/ParameterName;", "name", "result", "changePin1", "pin", "", "Lcom/tangem/commands/SetPinResponse;", "changePin2", "createWallet", "Lcom/tangem/commands/CreateWalletResponse;", "deleteFiles", "indices", "", "Lcom/tangem/commands/file/DeleteFileResponse;", "depersonalize", "Lcom/tangem/commands/personalization/DepersonalizeResponse;", "personalize", "Lcom/tangem/commands/personalization/entities/CardConfig;", "issuer", "Lcom/tangem/commands/personalization/entities/Issuer;", "manufacturer", "Lcom/tangem/commands/personalization/entities/Manufacturer;", "acquirer", "Lcom/tangem/commands/personalization/entities/Acquirer;", "Lcom/tangem/commands/Card;", "purgeWallet", "Lcom/tangem/commands/PurgeWalletResponse;", "readFiles", "readPrivateFiles", "", "Lcom/tangem/tasks/file/ReadFilesResponse;", "readIssuerData", "Lcom/tangem/commands/ReadIssuerDataResponse;", "readIssuerExtraData", "Lcom/tangem/commands/ReadIssuerExtraDataResponse;", "readUserData", "Lcom/tangem/commands/ReadUserDataResponse;", "scanCard", "sign", "hashes", "", "Lcom/tangem/commands/SignResponse;", "([[BLjava/lang/String;Lcom/tangem/Message;Lkotlin/jvm/functions/Function1;)V", "startSession", "Lkotlin/Function2;", "Lcom/tangem/CardSession;", "session", "Lcom/tangem/TangemError;", "error", "startSessionWithRunnable", "T", "Lcom/tangem/commands/CommandResponse;", "runnable", "Lcom/tangem/CardSessionRunnable;", "verify", "online", "Lcom/tangem/commands/verifycard/VerifyCardResponse;", "writeFiles", "files", "Lcom/tangem/commands/file/FileData;", "Lcom/tangem/commands/file/WriteFileDataResponse;", "writeIssuerData", "issuerData", "issuerDataSignature", "issuerDataCounter", "Lcom/tangem/commands/WriteIssuerDataResponse;", "(Ljava/lang/String;[B[BLjava/lang/Integer;Lcom/tangem/Message;Lkotlin/jvm/functions/Function1;)V", "writeIssuerExtraData", "startingSignature", "finalizingSignature", "(Ljava/lang/String;[B[B[BLjava/lang/Integer;Lcom/tangem/Message;Lkotlin/jvm/functions/Function1;)V", "writeUserData", "userData", "userCounter", "Lcom/tangem/commands/WriteUserDataResponse;", "(Ljava/lang/String;[BLjava/lang/Integer;Lcom/tangem/Message;Lkotlin/jvm/functions/Function1;)V", "writeUserProtectedData", "userProtectedData", "userProtectedCounter", "Companion", "tangem-core"})
public final class TangemSdk {
    private final com.tangem.SessionEnvironmentService environmentService = null;
    private final com.tangem.CardReader reader = null;
    private final com.tangem.SessionViewDelegate viewDelegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.tangem.Config config;
    public static final com.tangem.TangemSdk.Companion Companion = null;
    
    /**
     * This method launches a [ScanTask] on a new thread.
     *
     * To start using any card, you first need to read it using the scanCard() method.
     * This method launches an NFC session, and once it’s connected with the card,
     * it obtains the card data. Optionally, if the card contains a wallet (private and public key pair),
     * it proves that the wallet owns a private key that corresponds to a public one.
     *
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * * @param callback is triggered on the completion of the [ScanTask] and provides card response
     * in the form of [Card] if the task was performed successfully or [TangemSdkError] in case of an error.
     */
    public final void scanCard(@org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [SignCommand] on a new thread.
     *
     * It allows you to sign one or multiple hashes.
     * Simultaneous signing of array of hashes in a single [SignCommand] is required to support
     * Bitcoin-type multi-input blockchains (UTXO).
     * The [SignCommand] will return a corresponding array of signatures.
     *
     * Please note that Tangem cards usually protect the signing with a security delay
     * that may last up to 45 seconds, depending on a card.
     * It is for [SessionViewDelegate] to notify users of security delay.
     *
     * @param hashes Array of transaction hashes. It can be from one or up to ten hashes of the same length.
     * @param cardId CID, Unique Tangem card ID number
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [SignCommand] and provides card response
     * in the form of [SignResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void sign(@org.jetbrains.annotations.NotNull()
    byte[][] hashes, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SignResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [ReadIssuerDataCommand] on a new thread.
     *
     * This command returns 512-byte Issuer Data field and its issuer’s signature.
     * Issuer Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
     * format and payload of Issuer Data. For example, this field may contain information about
     * wallet balance signed by the issuer or additional issuer’s attestation data.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [ReadIssuerDataCommand] and provides
     * card response in the form of [ReadIssuerDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void readIssuerData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [WriteIssuerDataCommand] on a new thread.
     *
     * This command writes 512-byte Issuer Data field and its issuer’s signature.
     * Issuer Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
     * format and payload of Issuer Data. For example, this field may contain information about
     * wallet balance signed by the issuer or additional issuer’s attestation data.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param issuerData Data provided by issuer.
     * @param issuerDataSignature Issuer’s signature of [issuerData] with Issuer Data Private Key.
     * @param issuerDataCounter An optional counter that protect issuer data against replay attack.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [WriteIssuerDataCommand] and provides
     * card response in the form of [WriteIssuerDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void writeIssuerData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] issuerData, @org.jetbrains.annotations.NotNull()
    byte[] issuerDataSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer issuerDataCounter, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.WriteIssuerDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [ReadIssuerExtraDataCommand] on a new thread.
     *
     * This command retrieves Issuer Extra Data field and its issuer’s signature.
     * Issuer Extra Data is never changed or parsed from within the Tangem COS. The issuer defines purpose of use,
     * format and payload of Issuer Data. . For example, this field may contain photo or
     * biometric information for ID card product. Because of the large size of Issuer_Extra_Data,
     * a series of these commands have to be executed to read the entire Issuer_Extra_Data.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [ReadIssuerExtraDataCommand] and provides
     * card response in the form of [ReadIssuerExtraDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    @java.lang.Deprecated()
    public final void readIssuerExtraData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadIssuerExtraDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [WriteIssuerExtraDataCommand] on a new thread.
     *
     * This command writes Issuer Extra Data field and its issuer’s signature.
     * Issuer Extra Data is never changed or parsed from within the Tangem COS.
     * The issuer defines purpose of use, format and payload of Issuer Data.
     * For example, this field may contain a photo or biometric information for ID card products.
     * Because of the large size of IssuerExtraData, a series of these commands have to be executed
     * to write entire IssuerExtraData.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param issuerData Data provided by issuer.
     * @param startingSignature Issuer’s signature with Issuer Data Private Key of [cardId],
     * [issuerDataCounter] (if flags Protect_Issuer_Data_Against_Replay and
     * Restrict_Overwrite_Issuer_Extra_Data are set in [SettingsMask]) and size of [issuerData].
     * @param finalizingSignature Issuer’s signature with Issuer Data Private Key of [cardId],
     * [issuerData] and [issuerDataCounter] (the latter one only if flags Protect_Issuer_Data_Against_Replay
     * andRestrict_Overwrite_Issuer_Extra_Data are set in [SettingsMask]).
     * @param issuerDataCounter An optional counter that protect issuer data against replay attack.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [WriteIssuerExtraDataCommand] and provides
     * card response in the form of [WriteIssuerDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    @java.lang.Deprecated()
    public final void writeIssuerExtraData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] issuerData, @org.jetbrains.annotations.NotNull()
    byte[] startingSignature, @org.jetbrains.annotations.NotNull()
    byte[] finalizingSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer issuerDataCounter, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.WriteIssuerDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [WriteFilesTask] on a new thread.
     *
     * This task allows to write multiple files to a card. Files can be signed by Issuer
     * (specified on card during personalization) - [FileData.DataProtectedBySignature] or
     * files can be written using PIN2 (Passcode) - [FileData.DataProtectedByPasscode].
     *
     * @param files files to be written.
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [WriteFilesTask] and provides
     * card response in the form of [WriteFileDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void writeFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tangem.commands.file.FileData> files, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.file.WriteFileDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [ReadFilesTask] on a new thread.
     *
     * This task allows to read multiple files from a card. If the files are private,
     * then Passcode (PIN2) is required to read the files.
     *
     * @param readPrivateFiles if set to true, then the task will read private files,
     * for which it requires PIN2. Otherwise only public files can be read.
     * @param indices indices of files to be read. If not provided, the task will read and return
     * all files from a card that satisfy the access level condition (either only public or private and public).
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [ReadFilesTask] and provides
     * card response in the form of [ReadFilesResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void readFiles(boolean readPrivateFiles, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> indices, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.tasks.file.ReadFilesResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [ChangeFilesSettingsTask] on a new thread.
     *
     * This task allows to change settings of multiple files written to the card with [WriteFileDataCommand].
     * Passcode (PIN2) is required for this operation.
     * [FileSettings] change access level to a file - it can be [FileSettings.Private],
     * accessible only with PIN2, or [FileSettings.Public], accessible without PIN2
     *
     * @param changes contains list of [FileSettingsChange] -
     * indices of files that are to be changed and desired settings.
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [ChangeFilesSettingsTask] and provides
     * card response in the form of [ChangeFileSettingsResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void changeFilesSettings(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tangem.commands.file.FileSettingsChange> changes, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [DeleteFilesTask] on a new thread.
     *
     * This task allows to delete multiple or all files written to the card with [WriteFileDataCommand].
     * Passcode (PIN2) is required to delete the files.
     *
     * @param indices indices of files to be deleted. If [indices] are not provided,
     * then all files will be deleted.
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [DeleteFilesTask] and provides
     * card response in the form of [DeleteFileResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void deleteFiles(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> indices, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SimpleResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [ReadUserDataCommand] on a new thread.
     *
     * This command returns two up to 512-byte User_Data, User_Protected_Data and two counters User_Counter and
     * User_Protected_Counter fields.
     * User_Data and User_ProtectedData are never changed or parsed by the executable code the Tangem COS.
     * The App defines purpose of use, format and it's payload. For example, this field may contain cashed information
     * from blockchain to accelerate preparing new transaction.
     * User_Counter and User_ProtectedCounter are counters, that initial values can be set by App and increased on every signing
     * of new transaction (on SIGN command that calculate new signatures). The App defines purpose of use.
     * For example, this fields may contain blockchain nonce value.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [ReadUserDataCommand] and provides
     * card response in the form of [ReadUserDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void readUserData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.ReadUserDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [WriteUserDataCommand] on a new thread, writing  UserData and UserCounter fields.
     *
     * User_Data is never changed or parsed by the executable code the Tangem COS.
     * The App defines purpose of use, format and its payload. For example, this field may contain cashed information
     * from blockchain to accelerate preparing new transaction.
     * The initial value of User_Counter can be set by an App and increased on every signing
     * of new transaction (on SIGN command that calculate new signatures). The App defines purpose of use.
     * For example, this fields may contain blockchain nonce value.
     *
     * Writing of UserCounter and UserData is protected only by PIN1.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param userData: A data for which an SDK's user can define its purpose of use,
     * format and it's payload. For example, this field may contain cashed information from blockchain
     * to accelerate preparing new transaction.
     * @param userCounter: A counter that initial value can be set by an SDK's user and
     * increased on every signing of new transaction (on [SignCommand] that calculate new signatures).
     * An SDK's user defines purpose of its use. If null, the current counter value will not be overwritten.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [WriteUserDataCommand] and provides
     * card response in the form of [WriteUserDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void writeUserData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] userData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userCounter, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.WriteUserDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [WriteUserDataCommand] on a new thread,
     * writing UserProtectedData and UserProtectedCounter fields.
     *
     * User_ProtectedData is never changed or parsed by the executable code the Tangem COS.
     * The App defines purpose of use, format and its payload. For example, this field may contain cashed information
     * from blockchain to accelerate preparing new transaction.
     * The initial value of User_ProtectedCounter can be set by an App and increased on every signing
     * of a new transaction (on SIGN command that calculate new signatures). The App defines the purpose of use.
     * For example, this fields may contain blockchain nonce value.
     *
     * UserProtectedCounter and UserProtectedData require PIN2 for confirmation.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param userProtectedData: A data for which an SDK's user can define its purpose of use,
     * format and it's payload. For example, this field may contain cashed information from blockchain
     * to accelerate preparing new transaction.
     * @param userProtectedCounter: A counter that initial value can be set by an SDK's user and
     * increased on every signing of new transaction (on [SignCommand] that calculate new signatures).
     * An SDK's user defines purpose of its use. If null, the current counter value will not be overwritten.
     * For example, this fields may contain blockchain nonce value.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [WriteUserDataCommand] and provides
     * card response in the form of [WriteUserDataResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void writeUserProtectedData(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    byte[] userProtectedData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userProtectedCounter, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.WriteUserDataResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [CreateWalletTask] on a new thread.
     *
     * This this will create a new wallet on the card having ‘Empty’ state with [CreateWalletCommand]
     * and will check the success of the operation by performing [CheckWalletCommand].
     * A key pair WalletPublicKey / WalletPrivateKey is generated and securely stored in the card.
     * App will need to obtain Wallet_PublicKey from the [CreateWalletResponse] or from the
     * response of [ReadCommand] and then transform it into an address of corresponding
     * blockchain wallet according to a specific blockchain algorithm.
     * WalletPrivateKey is never revealed by the card and will be used by [SignCommand] and [CheckWalletCommand].
     * RemainingSignature is set to MaxSignatures.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [CreateWalletTask] and provides
     * card response in the form of [CreateWalletResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void createWallet(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.CreateWalletResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [PurgeWalletCommand] on a new thread.
     *
     * This command deletes all wallet data. If IsReusable flag is enabled during personalization,
     * the card changes state to ‘Empty’ and a new wallet can be created by [CreateWalletTask]
     * or [CreateWalletCommand].
     * If IsReusable flag is disabled, the card switches to ‘Purged’ state.
     * ‘Purged’ state is final, it makes the card useless.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [PurgeWalletCommand] and provides
     * card response in the form of [PurgeWalletResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void purgeWallet(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.PurgeWalletResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [VerifyCardCommand] on a new thread.
     *
     * The command to ensures the card has not been counterfeited.
     * By using standard challenge-response scheme, the card proves possession of CardPrivateKey
     * that corresponds to CardPublicKey returned by [ReadCommand]. Then the data is sent
     * to Tangem server to prove that  this card was indeed issued by Tangem.
     * The online part of the verification is unavailable for DevKit cards.
     *
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param online flag that allows disable online verification
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [VerifyCardCommand] and provides
     * card response in the form of [VerifyCardResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void verify(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, boolean online, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.verifycard.VerifyCardResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * Command available on SDK cards only
     *
     * This method launches a [PersonalizeCommand] on a new thread.
     *
     * Personalization is an initialization procedure, required before starting using a card.
     * During this procedure a card setting is set up.
     * During this procedure all data exchange is encrypted.
     * @param config is a configuration file with all the card settings that are written on the card
     * during personalization.
     * @param issuer Issuer is a third-party team or company wishing to use Tangem cards.
     * @param manufacturer Tangem Card Manufacturer.
     * @param acquirer Acquirer is a trusted third-party company that operates proprietary
     * (non-EMV) POS terminal infrastructure and transaction processing back-end.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [PersonalizeCommand] and provides
     * card response in the form of [Card] if the command was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void personalize(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.CardConfig config, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.Issuer issuer, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.Manufacturer manufacturer, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.personalization.entities.Acquirer acquirer, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    /**
     * Command available on SDK cards only
     *
     * This method launches a [DepersonalizeCommand] on a new thread.
     *
     * This command resets card to initial state,
     * erasing all data written during personalization and usage.
     *
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [DepersonalizeCommand] and provides
     * card response in the form of [DepersonalizeResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void depersonalize(@org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.personalization.DepersonalizeResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [SetPinCommand] on a new thread.
     *
     * This command allows to change PIN1. This 32-byte code restricts access to the whole card.
     * App must submit the correct value of PIN1 in each command
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param pin: PIN1 value to be set. If null, the command will trigger [SessionViewDelegate] method
     * that prompts user to enter new PIN.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [DepersonalizeCommand] and provides
     * card response in the form of [DepersonalizeResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void changePin1(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    byte[] pin, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SetPinResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * This method launches a [SetPinCommand] on a new thread.
     *
     * This command allows to change PIN2.
     * All cards will require submitting the correct 32-byte PIN2 code in order to sign a transaction
     * or to perform other commands entailing a change of the card state. App should ask the user
     * to enter PIN2 before sending such commands to the card.
     *
     * @param cardId CID, Unique Tangem card ID number.
     * @param pin: PIN2 value to be set. If null, the command will trigger [SessionViewDelegate] method
     * that prompts user to enter new PIN.
     * @param initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @param callback is triggered on the completion of the [DepersonalizeCommand] and provides
     * card response in the form of [DepersonalizeResponse] if the task was performed successfully
     * or [TangemSdkError] in case of an error.
     */
    public final void changePin2(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    byte[] pin, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.SetPinResponse>, kotlin.Unit> callback) {
    }
    
    /**
     * Allows running a custom bunch of commands in one [CardSession] by creating a custom task.
     * [TangemSdk] will start a card session, perform preflight [ReadCommand],
     * invoke [CardSessionRunnable.run] and close the session.
     * You can find the current card in the [CardSession.environment].
     *
     * @runnable: A custom task, adopting [CardSessionRunnable] protocol
     * @cardId: CID, Unique Tangem card ID number. If not null, the SDK will check that you the card
     * with which you tapped a phone has this [cardId] and SDK will return
     * the [TangemSdkError.WrongCardNumber] otherwise.
     * @initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @callback: Standard [TangemSdk] callback.
     */
    public final <T extends com.tangem.commands.CommandResponse>void startSessionWithRunnable(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSessionRunnable<T> runnable, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<T>, kotlin.Unit> callback) {
    }
    
    /**
     * Allows running  a custom bunch of commands in one [CardSession] with lightweight closure syntax.
     * Tangem SDK will start a card session and perform preflight [ReadCommand].
     *
     * @cardId: CID, Unique Tangem card ID number. If not null, the SDK will check that you the card
     * with which you tapped a phone has this [cardId] and SDK will return
     * the [TangemSdkError.WrongCardNumber] otherwise.
     * @initialMessage: A custom description that shows at the beginning of the NFC session.
     * If null, default message will be used.
     * @callback: At first, you should check that the [TangemSdkError] is not null,
     * then you can use the [CardSession] to interact with a card.
     */
    public final void startSession(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    com.tangem.Message initialMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tangem.CardSession, ? super com.tangem.TangemError, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    com.tangem.Config p0) {
    }
    
    public TangemSdk(@org.jetbrains.annotations.NotNull()
    com.tangem.CardReader reader, @org.jetbrains.annotations.NotNull()
    com.tangem.SessionViewDelegate viewDelegate, @org.jetbrains.annotations.NotNull()
    com.tangem.Config config, @org.jetbrains.annotations.NotNull()
    com.tangem.common.CardValuesStorage cardValuesStorage, @org.jetbrains.annotations.Nullable()
    com.tangem.common.TerminalKeysService terminalKeysService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdk$Companion;", "", "()V", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}