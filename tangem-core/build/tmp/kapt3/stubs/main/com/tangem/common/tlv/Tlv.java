package com.tangem.common.tlv;

import java.lang.System;

/**
 * The data converted to the Tag Length Value protocol.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/tangem/common/tlv/Tlv;", "", "tagCode", "", "value", "", "(I[B)V", "tag", "Lcom/tangem/common/tlv/TlvTag;", "(Lcom/tangem/common/tlv/TlvTag;[B)V", "getTag", "()Lcom/tangem/common/tlv/TlvTag;", "tagRaw", "getTagRaw", "()I", "getValue", "()[B", "toString", "", "Companion", "tangem-core"})
public final class Tlv {
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.common.tlv.TlvTag tag = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] value = null;
    private final int tagRaw = 0;
    public static final com.tangem.common.tlv.Tlv.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.common.tlv.TlvTag getTag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getValue() {
        return null;
    }
    
    public final int getTagRaw() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Tlv(int tagCode, @org.jetbrains.annotations.NotNull()
    byte[] value) {
        super();
    }
    
    public Tlv(@org.jetbrains.annotations.NotNull()
    com.tangem.common.tlv.TlvTag tag, @org.jetbrains.annotations.NotNull()
    byte[] value) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a8\u0006\r"}, d2 = {"Lcom/tangem/common/tlv/Tlv$Companion;", "", "()V", "deserialize", "", "Lcom/tangem/common/tlv/Tlv;", "data", "", "nfcV", "", "tlvFromBytes", "stream", "Ljava/io/ByteArrayInputStream;", "tangem-core"})
    public static final class Companion {
        
        private final com.tangem.common.tlv.Tlv tlvFromBytes(java.io.ByteArrayInputStream stream) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.tangem.common.tlv.Tlv> deserialize(@org.jetbrains.annotations.NotNull()
        byte[] data, boolean nfcV) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}