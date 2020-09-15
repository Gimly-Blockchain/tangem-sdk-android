package com.tangem.common.apdu;

import java.lang.System;

/**
 * Stores response data from the card and parses it to [Tlv] and [StatusWord].
 *
 * @property data Raw response from the card.
 * @property sw Status word code, reflecting the status of the response.
 * @property statusWord Parsed status word.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/tangem/common/apdu/ResponseApdu;", "", "data", "", "([B)V", "statusWord", "Lcom/tangem/common/apdu/StatusWord;", "getStatusWord", "()Lcom/tangem/common/apdu/StatusWord;", "sw", "", "getSw", "()I", "sw1", "sw2", "decrypt", "encryptionKey", "getTlvData", "", "Lcom/tangem/common/tlv/Tlv;", "tangem-core"})
public final class ResponseApdu {
    private final int sw1 = 0;
    private final int sw2 = 0;
    private final int sw = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.common.apdu.StatusWord statusWord = null;
    private final byte[] data = null;
    
    public final int getSw() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.common.apdu.StatusWord getStatusWord() {
        return null;
    }
    
    /**
     * Converts raw response data to the list of TLVs.
     *
     * @param encryptionKey key to decrypt response.
     * (Encryption / decryption functionality is not implemented yet.)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tangem.common.tlv.Tlv> getTlvData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.common.apdu.ResponseApdu decrypt(@org.jetbrains.annotations.Nullable()
    byte[] encryptionKey) {
        return null;
    }
    
    public ResponseApdu(@org.jetbrains.annotations.NotNull()
    byte[] data) {
        super();
    }
}