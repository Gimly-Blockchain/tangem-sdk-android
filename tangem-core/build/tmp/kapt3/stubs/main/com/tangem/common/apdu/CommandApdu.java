package com.tangem.common.apdu;

import java.lang.System;

/**
 * Class that provides conversion of serialized request and Instruction code
 * to a raw data that can be sent to the card.
 *
 * @property ins Instruction code that determines the type of request for the card.
 * @property tlvs Tlvs encoded to a [ByteArray] that are to be sent to the card.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B9\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/tangem/common/apdu/CommandApdu;", "", "instruction", "Lcom/tangem/common/apdu/Instruction;", "tlvs", "", "(Lcom/tangem/common/apdu/Instruction;[B)V", "ins", "", "p1", "p2", "le", "cla", "(I[BIIII)V", "apduData", "getApduData", "()[B", "getIns", "()I", "encrypt", "encryptionMode", "Lcom/tangem/EncryptionMode;", "encryptionKey", "toBytes", "writeLength", "", "Ljava/io/ByteArrayOutputStream;", "lc", "Companion", "tangem-core"})
public final class CommandApdu {
    
    /**
     * Request converted to a raw data
     */
    @org.jetbrains.annotations.NotNull()
    private final byte[] apduData = null;
    private final int ins = 0;
    private final byte[] tlvs = null;
    private final int p1 = 0;
    private final int p2 = 0;
    private final int le = 0;
    private final int cla = 0;
    public static final int ISO_CLA = 0;
    public static final com.tangem.common.apdu.CommandApdu.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getApduData() {
        return null;
    }
    
    private final byte[] toBytes() {
        return null;
    }
    
    private final void writeLength(java.io.ByteArrayOutputStream $this$writeLength, int lc) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.common.apdu.CommandApdu encrypt(@org.jetbrains.annotations.NotNull()
    com.tangem.EncryptionMode encryptionMode, @org.jetbrains.annotations.Nullable()
    byte[] encryptionKey) {
        return null;
    }
    
    public final int getIns() {
        return 0;
    }
    
    public CommandApdu(int ins, @org.jetbrains.annotations.NotNull()
    byte[] tlvs, int p1, int p2, int le, int cla) {
        super();
    }
    
    public CommandApdu(@org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.Instruction instruction, @org.jetbrains.annotations.NotNull()
    byte[] tlvs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/common/apdu/CommandApdu$Companion;", "", "()V", "ISO_CLA", "", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}