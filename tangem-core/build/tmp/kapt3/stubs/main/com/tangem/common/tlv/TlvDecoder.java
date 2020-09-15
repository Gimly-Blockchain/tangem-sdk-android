package com.tangem.common.tlv;

import java.lang.System;

/**
 * Maps value fields in [Tlv] from raw [ByteArray] to concrete classes
 * according to their [TlvTag] and corresponding [TlvValueType].
 *
 * @property tlvList List of TLVs, which values are to be converted to particular classes.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\b\u001a\u0002H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0086\b\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u0004\u0018\u0001H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017J!\u0010\u0018\u001a\u00020\u0012\"\u0006\b\u0000\u0010\t\u0018\u0001\"\u0006\b\u0001\u0010\u0019\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/tangem/common/tlv/TlvDecoder;", "", "tlvList", "", "Lcom/tangem/common/tlv/Tlv;", "(Ljava/util/List;)V", "getTlvList", "()Ljava/util/List;", "decode", "T", "tag", "Lcom/tangem/common/tlv/TlvTag;", "logError", "", "(Lcom/tangem/common/tlv/TlvTag;Z)Ljava/lang/Object;", "decodeOptional", "(Lcom/tangem/common/tlv/TlvTag;)Ljava/lang/Object;", "logException", "", "value", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "typeCheck", "ExpectedT", "tangem-core"})
public final class TlvDecoder {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.tangem.common.tlv.Tlv> tlvList = null;
    
    public final void logException(@org.jetbrains.annotations.NotNull()
    com.tangem.common.tlv.TlvTag tag, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tangem.common.tlv.Tlv> getTlvList() {
        return null;
    }
    
    public TlvDecoder(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tangem.common.tlv.Tlv> tlvList) {
        super();
    }
}