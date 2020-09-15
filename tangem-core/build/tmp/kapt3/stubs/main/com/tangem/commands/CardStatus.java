package com.tangem.commands;

import java.lang.System;

/**
 * Status of the card and its wallet.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/tangem/commands/CardStatus;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "NotPersonalized", "Empty", "Loaded", "Purged", "Companion", "tangem-core"})
public enum CardStatus {
    /*public static final*/ NotPersonalized /* = new NotPersonalized(0) */,
    /*public static final*/ Empty /* = new Empty(0) */,
    /*public static final*/ Loaded /* = new Loaded(0) */,
    /*public static final*/ Purged /* = new Purged(0) */;
    private final int code = 0;
    private static final com.tangem.commands.CardStatus[] values = null;
    public static final com.tangem.commands.CardStatus.Companion Companion = null;
    
    public final int getCode() {
        return 0;
    }
    
    CardStatus(int code) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/commands/CardStatus$Companion;", "", "()V", "values", "", "Lcom/tangem/commands/CardStatus;", "[Lcom/tangem/commands/CardStatus;", "byCode", "code", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tangem.commands.CardStatus byCode(int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}