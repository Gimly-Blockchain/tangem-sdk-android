package com.tangem.commands.personalization;

import java.lang.System;

/**
 * Encodes information that is to be written on the card as an Ndef Tag.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/tangem/commands/personalization/NdefEncoder;", "", "ndefRecords", "", "Lcom/tangem/commands/personalization/entities/NdefRecord;", "useDinamicNdef", "", "(Ljava/util/List;Z)V", "encode", "", "encodeValue", "", "ndefRecord", "headerValue", "", "bs", "Ljava/io/ByteArrayOutputStream;", "tangem-core"})
public final class NdefEncoder {
    private final java.util.List<com.tangem.commands.personalization.entities.NdefRecord> ndefRecords = null;
    private final boolean useDinamicNdef = false;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] encode() {
        return null;
    }
    
    private final void encodeValue(com.tangem.commands.personalization.entities.NdefRecord ndefRecord, int headerValue, java.io.ByteArrayOutputStream bs) {
    }
    
    public NdefEncoder(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tangem.commands.personalization.entities.NdefRecord> ndefRecords, boolean useDinamicNdef) {
        super();
    }
}