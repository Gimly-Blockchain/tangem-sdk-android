package com.tangem;

import java.lang.System;

/**
 * An error class that represent typical errors that may occur when performing Tangem SDK tasks.
 * Errors are propagated back to the caller in callbacks.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:1\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>?B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u00011@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnop\u00a8\u0006q"}, d2 = {"Lcom/tangem/TangemSdkError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/tangem/TangemError;", "code", "", "(I)V", "getCode", "()I", "customMessage", "", "getCustomMessage", "()Ljava/lang/String;", "setCustomMessage", "(Ljava/lang/String;)V", "AlreadyCreated", "AlreadyPersonalized", "Busy", "CannotBeDepersonalized", "CardError", "CardIsEmpty", "CardIsPurged", "DataCannotBeWritten", "DataSizeTooLarge", "DecodingFailed", "DecodingFailedMissingTag", "DecodingFailedTypeMismatch", "DeserializeApduFailed", "EmptyHashes", "EncodingFailed", "EncodingFailedTypeMismatch", "ErrorProcessingCommand", "ExtendedDataSizeTooLarge", "ExtendedLengthNotSupported", "FileNotFound", "HashSizeMustBeEqual", "InsNotSupported", "InvalidParams", "InvalidResponse", "InvalidState", "MissingCounter", "MissingIssuerPubicKey", "MissingPreflightRead", "NeedEncryption", "NoRemainingSignatures", "NotActivated", "NotPersonalized", "OverwritingDataIsProhibited", "Pin1CannotBeChanged", "Pin1CannotBeDefault", "Pin1Required", "Pin2CannotBeChanged", "Pin2OrCvcRequired", "PurgeWalletProhibited", "SerializeCommandError", "SignHashesNotAvailable", "TagLost", "TooManyHashesInOneTransaction", "UnknownError", "UnknownStatus", "UserCancelled", "VerificationFailed", "WrongCardNumber", "WrongCardType", "Lcom/tangem/TangemSdkError$TagLost;", "Lcom/tangem/TangemSdkError$ExtendedLengthNotSupported;", "Lcom/tangem/TangemSdkError$SerializeCommandError;", "Lcom/tangem/TangemSdkError$DeserializeApduFailed;", "Lcom/tangem/TangemSdkError$EncodingFailedTypeMismatch;", "Lcom/tangem/TangemSdkError$EncodingFailed;", "Lcom/tangem/TangemSdkError$DecodingFailedMissingTag;", "Lcom/tangem/TangemSdkError$DecodingFailedTypeMismatch;", "Lcom/tangem/TangemSdkError$DecodingFailed;", "Lcom/tangem/TangemSdkError$InvalidResponse;", "Lcom/tangem/TangemSdkError$UnknownStatus;", "Lcom/tangem/TangemSdkError$ErrorProcessingCommand;", "Lcom/tangem/TangemSdkError$InvalidState;", "Lcom/tangem/TangemSdkError$InsNotSupported;", "Lcom/tangem/TangemSdkError$InvalidParams;", "Lcom/tangem/TangemSdkError$NeedEncryption;", "Lcom/tangem/TangemSdkError$FileNotFound;", "Lcom/tangem/TangemSdkError$AlreadyPersonalized;", "Lcom/tangem/TangemSdkError$CannotBeDepersonalized;", "Lcom/tangem/TangemSdkError$Pin1Required;", "Lcom/tangem/TangemSdkError$AlreadyCreated;", "Lcom/tangem/TangemSdkError$PurgeWalletProhibited;", "Lcom/tangem/TangemSdkError$Pin1CannotBeChanged;", "Lcom/tangem/TangemSdkError$Pin2CannotBeChanged;", "Lcom/tangem/TangemSdkError$Pin1CannotBeDefault;", "Lcom/tangem/TangemSdkError$NoRemainingSignatures;", "Lcom/tangem/TangemSdkError$EmptyHashes;", "Lcom/tangem/TangemSdkError$HashSizeMustBeEqual;", "Lcom/tangem/TangemSdkError$CardIsEmpty;", "Lcom/tangem/TangemSdkError$SignHashesNotAvailable;", "Lcom/tangem/TangemSdkError$TooManyHashesInOneTransaction;", "Lcom/tangem/TangemSdkError$ExtendedDataSizeTooLarge;", "Lcom/tangem/TangemSdkError$NotPersonalized;", "Lcom/tangem/TangemSdkError$NotActivated;", "Lcom/tangem/TangemSdkError$CardIsPurged;", "Lcom/tangem/TangemSdkError$Pin2OrCvcRequired;", "Lcom/tangem/TangemSdkError$VerificationFailed;", "Lcom/tangem/TangemSdkError$DataSizeTooLarge;", "Lcom/tangem/TangemSdkError$MissingCounter;", "Lcom/tangem/TangemSdkError$OverwritingDataIsProhibited;", "Lcom/tangem/TangemSdkError$DataCannotBeWritten;", "Lcom/tangem/TangemSdkError$MissingIssuerPubicKey;", "Lcom/tangem/TangemSdkError$UnknownError;", "Lcom/tangem/TangemSdkError$UserCancelled;", "Lcom/tangem/TangemSdkError$Busy;", "Lcom/tangem/TangemSdkError$MissingPreflightRead;", "Lcom/tangem/TangemSdkError$WrongCardNumber;", "Lcom/tangem/TangemSdkError$WrongCardType;", "Lcom/tangem/TangemSdkError$CardError;", "tangem-core"})
public abstract class TangemSdkError extends java.lang.Exception implements com.tangem.TangemError {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String customMessage;
    private final int code = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCustomMessage() {
        return null;
    }
    
    @java.lang.Override()
    public void setCustomMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public final int getCode() {
        return 0;
    }
    
    private TangemSdkError(int code) {
        super();
    }
    
    /**
     * This error is returned when Android  NFC reader loses a tag
     * (e.g. a user detaches card from the phone's NFC module) while the NFC session is in progress.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$TagLost;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class TagLost extends com.tangem.TangemSdkError {
        
        public TagLost() {
            super(0);
        }
    }
    
    /**
     * This error is returned when NFC driver on an Android device does not support sending more than 261 bytes.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$ExtendedLengthNotSupported;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class ExtendedLengthNotSupported extends com.tangem.TangemSdkError {
        
        public ExtendedLengthNotSupported() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$SerializeCommandError;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class SerializeCommandError extends com.tangem.TangemSdkError {
        
        public SerializeCommandError() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DeserializeApduFailed;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DeserializeApduFailed extends com.tangem.TangemSdkError {
        
        public DeserializeApduFailed() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$EncodingFailedTypeMismatch;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class EncodingFailedTypeMismatch extends com.tangem.TangemSdkError {
        
        public EncodingFailedTypeMismatch() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$EncodingFailed;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class EncodingFailed extends com.tangem.TangemSdkError {
        
        public EncodingFailed() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DecodingFailedMissingTag;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DecodingFailedMissingTag extends com.tangem.TangemSdkError {
        
        public DecodingFailedMissingTag() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DecodingFailedTypeMismatch;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DecodingFailedTypeMismatch extends com.tangem.TangemSdkError {
        
        public DecodingFailedTypeMismatch() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DecodingFailed;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DecodingFailed extends com.tangem.TangemSdkError {
        
        public DecodingFailed() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$InvalidResponse;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class InvalidResponse extends com.tangem.TangemSdkError {
        
        public InvalidResponse() {
            super(0);
        }
    }
    
    /**
     * This error is returned when unknown [StatusWord] is received from a card.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$UnknownStatus;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class UnknownStatus extends com.tangem.TangemSdkError {
        
        public UnknownStatus() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a card's reply is [StatusWord.ErrorProcessingCommand].
     * The card sends this status in case of internal card error.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$ErrorProcessingCommand;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class ErrorProcessingCommand extends com.tangem.TangemSdkError {
        
        public ErrorProcessingCommand() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a card's reply is [StatusWord.InvalidState].
     * The card sends this status when command can not be executed in the current state of a card.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$InvalidState;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class InvalidState extends com.tangem.TangemSdkError {
        
        public InvalidState() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a card's reply is [StatusWord.InsNotSupported].
     * The card sends this status when the card cannot process the [com.tangem.common.apdu.Instruction].
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$InsNotSupported;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class InsNotSupported extends com.tangem.TangemSdkError {
        
        public InsNotSupported() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a card's reply is [StatusWord.InvalidParams].
     * The card sends this status when there are wrong or not sufficient parameters in TLV request,
     * or wrong PIN1/PIN2.
     * The error may be caused, for example, by wrong parameters of the [Task], [CommandSerializer],
     * mapping or serialization errors.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$InvalidParams;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class InvalidParams extends com.tangem.TangemSdkError {
        
        public InvalidParams() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a card's reply is [StatusWord.NeedEncryption]
     * and the encryption was not established by TangemSdk.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$NeedEncryption;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class NeedEncryption extends com.tangem.TangemSdkError {
        
        public NeedEncryption() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$FileNotFound;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class FileNotFound extends com.tangem.TangemSdkError {
        
        public FileNotFound() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$AlreadyPersonalized;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class AlreadyPersonalized extends com.tangem.TangemSdkError {
        
        public AlreadyPersonalized() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$CannotBeDepersonalized;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class CannotBeDepersonalized extends com.tangem.TangemSdkError {
        
        public CannotBeDepersonalized() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Pin1Required;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Pin1Required extends com.tangem.TangemSdkError {
        
        public Pin1Required() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$AlreadyCreated;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class AlreadyCreated extends com.tangem.TangemSdkError {
        
        public AlreadyCreated() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$PurgeWalletProhibited;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class PurgeWalletProhibited extends com.tangem.TangemSdkError {
        
        public PurgeWalletProhibited() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Pin1CannotBeChanged;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Pin1CannotBeChanged extends com.tangem.TangemSdkError {
        
        public Pin1CannotBeChanged() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Pin2CannotBeChanged;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Pin2CannotBeChanged extends com.tangem.TangemSdkError {
        
        public Pin2CannotBeChanged() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Pin1CannotBeDefault;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Pin1CannotBeDefault extends com.tangem.TangemSdkError {
        
        public Pin1CannotBeDefault() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$NoRemainingSignatures;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class NoRemainingSignatures extends com.tangem.TangemSdkError {
        
        public NoRemainingSignatures() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a [com.tangem.commands.SignCommand]
     * receives only empty hashes for signature.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$EmptyHashes;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class EmptyHashes extends com.tangem.TangemSdkError {
        
        public EmptyHashes() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a [com.tangem.commands.SignCommand]
     * receives hashes of different lengths for signature.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$HashSizeMustBeEqual;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class HashSizeMustBeEqual extends com.tangem.TangemSdkError {
        
        public HashSizeMustBeEqual() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$CardIsEmpty;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class CardIsEmpty extends com.tangem.TangemSdkError {
        
        public CardIsEmpty() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$SignHashesNotAvailable;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class SignHashesNotAvailable extends com.tangem.TangemSdkError {
        
        public SignHashesNotAvailable() {
            super(0);
        }
    }
    
    /**
     * Tangem cards can sign currently up to 10 hashes during one [com.tangem.commands.SignCommand].
     * This error is returned when a [com.tangem.commands.SignCommand] receives more than 10 hashes to sign.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$TooManyHashesInOneTransaction;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class TooManyHashesInOneTransaction extends com.tangem.TangemSdkError {
        
        public TooManyHashesInOneTransaction() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$ExtendedDataSizeTooLarge;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class ExtendedDataSizeTooLarge extends com.tangem.TangemSdkError {
        
        public ExtendedDataSizeTooLarge() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$NotPersonalized;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class NotPersonalized extends com.tangem.TangemSdkError {
        
        public NotPersonalized() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$NotActivated;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class NotActivated extends com.tangem.TangemSdkError {
        
        public NotActivated() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$CardIsPurged;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class CardIsPurged extends com.tangem.TangemSdkError {
        
        public CardIsPurged() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Pin2OrCvcRequired;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Pin2OrCvcRequired extends com.tangem.TangemSdkError {
        
        public Pin2OrCvcRequired() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a [Task] checks unsuccessfully either
     * a card's ability to sign with its private key, or the validity of issuer data.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$VerificationFailed;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class VerificationFailed extends com.tangem.TangemSdkError {
        
        public VerificationFailed() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DataSizeTooLarge;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DataSizeTooLarge extends com.tangem.TangemSdkError {
        
        public DataSizeTooLarge() {
            super(0);
        }
    }
    
    /**
     * This error is returned when [ReadIssuerDataTask] or [ReadIssuerExtraDataTask] expects a counter
     * (when the card's requires it), but the counter is missing.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$MissingCounter;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class MissingCounter extends com.tangem.TangemSdkError {
        
        public MissingCounter() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$OverwritingDataIsProhibited;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class OverwritingDataIsProhibited extends com.tangem.TangemSdkError {
        
        public OverwritingDataIsProhibited() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$DataCannotBeWritten;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class DataCannotBeWritten extends com.tangem.TangemSdkError {
        
        public DataCannotBeWritten() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$MissingIssuerPubicKey;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class MissingIssuerPubicKey extends com.tangem.TangemSdkError {
        
        public MissingIssuerPubicKey() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$UnknownError;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class UnknownError extends com.tangem.TangemSdkError {
        
        public UnknownError() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a user manually closes NFC Reading Bottom Sheet Dialog.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$UserCancelled;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class UserCancelled extends com.tangem.TangemSdkError {
        
        public UserCancelled() {
            super(0);
        }
    }
    
    /**
     * This error is returned when [com.tangem.TangemSdk] was called with a new [Task],
     * while a previous [Task] is still in progress.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$Busy;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class Busy extends com.tangem.TangemSdkError {
        
        public Busy() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a task (such as [ScanTask]) requires that [ReadCommand]
     * is executed before performing other commands.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$MissingPreflightRead;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class MissingPreflightRead extends com.tangem.TangemSdkError {
        
        public MissingPreflightRead() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a [Task] expects a user to use a particular card,
     * but the user tries to use a different card.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$WrongCardNumber;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class WrongCardNumber extends com.tangem.TangemSdkError {
        
        public WrongCardNumber() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a user scans a card of a [com.tangem.common.extensions.CardType]
     * that is not specified in [Config.cardFilter].
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$WrongCardType;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class WrongCardType extends com.tangem.TangemSdkError {
        
        public WrongCardType() {
            super(0);
        }
    }
    
    /**
     * This error is returned when a [ScanTask] returns a [Card] without some of the essential fields.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/TangemSdkError$CardError;", "Lcom/tangem/TangemSdkError;", "()V", "tangem-core"})
    public static final class CardError extends com.tangem.TangemSdkError {
        
        public CardError() {
            super(0);
        }
    }
}