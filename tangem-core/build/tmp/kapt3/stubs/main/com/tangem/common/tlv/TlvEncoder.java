package com.tangem.common.tlv;

import java.lang.System;

/**
 * Encodes information that is to be written on the card from parsed classes into [ByteArray]
 * (according to the provided [TlvTag] and corresponding [TlvValueType])
 * and then forms [Tlv] with the encoded values.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u0006\u001a\u00020\u0007\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u0001H\bH\u0086\b\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\r\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u0002H\bH\u0086\b\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u0010\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u0011\u0018\u00012\u0006\u0010\t\u001a\u00020\nH\u0086\b\u00a8\u0006\u0012"}, d2 = {"Lcom/tangem/common/tlv/TlvEncoder;", "", "()V", "determineByteArraySize", "", "value", "encode", "Lcom/tangem/common/tlv/Tlv;", "T", "tag", "Lcom/tangem/common/tlv/TlvTag;", "(Lcom/tangem/common/tlv/TlvTag;Ljava/lang/Object;)Lcom/tangem/common/tlv/Tlv;", "encodeValue", "", "(Lcom/tangem/common/tlv/TlvTag;Ljava/lang/Object;)[B", "typeCheck", "", "ExpectedT", "tangem-core"})
public final class TlvEncoder {
    
    public final int determineByteArraySize(int value) {
        return 0;
    }
    
    public TlvEncoder() {
        super();
    }
}