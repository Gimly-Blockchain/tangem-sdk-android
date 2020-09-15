package com.tangem.commands.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/tangem/commands/common/CardDeserializer;", "", "()V", "Companion", "tangem-core"})
public final class CardDeserializer {
    public static final com.tangem.commands.common.CardDeserializer.Companion Companion = null;
    
    public CardDeserializer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/tangem/commands/common/CardDeserializer$Companion;", "", "()V", "deserialize", "Lcom/tangem/commands/Card;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "deserializeCardData", "Lcom/tangem/commands/CardData;", "tlvData", "", "Lcom/tangem/common/tlv/Tlv;", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.Card deserialize(@org.jetbrains.annotations.NotNull()
        com.tangem.common.apdu.ResponseApdu apdu) {
            return null;
        }
        
        private final com.tangem.commands.CardData deserializeCardData(java.util.List<com.tangem.common.tlv.Tlv> tlvData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}