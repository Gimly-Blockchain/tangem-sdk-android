package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/tangem/commands/SetPinStatus;", "", "(Ljava/lang/String;I)V", "PinsNotChanged", "Pin1Changed", "Pin2Changed", "Pin3Changed", "Pins12Changed", "Pins13Changed", "Pins23Changed", "Pins123Changed", "Companion", "tangem-core"})
public enum SetPinStatus {
    /*public static final*/ PinsNotChanged /* = new PinsNotChanged() */,
    /*public static final*/ Pin1Changed /* = new Pin1Changed() */,
    /*public static final*/ Pin2Changed /* = new Pin2Changed() */,
    /*public static final*/ Pin3Changed /* = new Pin3Changed() */,
    /*public static final*/ Pins12Changed /* = new Pins12Changed() */,
    /*public static final*/ Pins13Changed /* = new Pins13Changed() */,
    /*public static final*/ Pins23Changed /* = new Pins23Changed() */,
    /*public static final*/ Pins123Changed /* = new Pins123Changed() */;
    public static final com.tangem.commands.SetPinStatus.Companion Companion = null;
    
    SetPinStatus() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/commands/SetPinStatus$Companion;", "", "()V", "fromStatusWord", "Lcom/tangem/commands/SetPinStatus;", "statusWord", "Lcom/tangem/common/apdu/StatusWord;", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tangem.commands.SetPinStatus fromStatusWord(@org.jetbrains.annotations.NotNull()
        com.tangem.common.apdu.StatusWord statusWord) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}