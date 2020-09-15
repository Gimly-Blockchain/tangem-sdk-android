package com.tangem.common.apdu;

import java.lang.System;

/**
 * Part of a response from the card, shows the status of the operation
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/tangem/common/apdu/StatusWord;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "ProcessCompleted", "InvalidParams", "ErrorProcessingCommand", "InvalidState", "Pin1Changed", "Pin2Changed", "Pins12Changed", "Pin3Changed", "Pins13Changed", "Pins23Changed", "Pins123Changed", "InsNotSupported", "NeedEncryption", "NeedPause", "FileNotFound", "Unknown", "Companion", "tangem-core"})
public enum StatusWord {
    /*public static final*/ ProcessCompleted /* = new ProcessCompleted(0) */,
    /*public static final*/ InvalidParams /* = new InvalidParams(0) */,
    /*public static final*/ ErrorProcessingCommand /* = new ErrorProcessingCommand(0) */,
    /*public static final*/ InvalidState /* = new InvalidState(0) */,
    /*public static final*/ Pin1Changed /* = new Pin1Changed(0) */,
    /*public static final*/ Pin2Changed /* = new Pin2Changed(0) */,
    /*public static final*/ Pins12Changed /* = new Pins12Changed(0) */,
    /*public static final*/ Pin3Changed /* = new Pin3Changed(0) */,
    /*public static final*/ Pins13Changed /* = new Pins13Changed(0) */,
    /*public static final*/ Pins23Changed /* = new Pins23Changed(0) */,
    /*public static final*/ Pins123Changed /* = new Pins123Changed(0) */,
    /*public static final*/ InsNotSupported /* = new InsNotSupported(0) */,
    /*public static final*/ NeedEncryption /* = new NeedEncryption(0) */,
    /*public static final*/ NeedPause /* = new NeedPause(0) */,
    /*public static final*/ FileNotFound /* = new FileNotFound(0) */,
    /*public static final*/ Unknown /* = new Unknown(0) */;
    private final int code = 0;
    private static final com.tangem.common.apdu.StatusWord[] values = null;
    public static final com.tangem.common.apdu.StatusWord.Companion Companion = null;
    
    public final int getCode() {
        return 0;
    }
    
    StatusWord(int code) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/common/apdu/StatusWord$Companion;", "", "()V", "values", "", "Lcom/tangem/common/apdu/StatusWord;", "[Lcom/tangem/common/apdu/StatusWord;", "byCode", "code", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.common.apdu.StatusWord byCode(int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}