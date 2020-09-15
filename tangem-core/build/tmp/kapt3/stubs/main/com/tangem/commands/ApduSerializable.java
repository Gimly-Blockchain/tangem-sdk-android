package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lcom/tangem/commands/ApduSerializable;", "T", "Lcom/tangem/commands/CommandResponse;", "", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "(Lcom/tangem/SessionEnvironment;Lcom/tangem/common/apdu/ResponseApdu;)Lcom/tangem/commands/CommandResponse;", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "tangem-core"})
public abstract interface ApduSerializable<T extends com.tangem.commands.CommandResponse> {
    
    /**
     * Serializes data into an array of [com.tangem.common.tlv.Tlv],
     * then creates [CommandApdu] with this data.
     * @param environment [SessionEnvironment] of the current card
     * @return command data converted to [CommandApdu] that allows to convert it to [ByteArray]
     * that can be sent to a Tangem card
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment);
    
    /**
     * Deserializes data received from a card and stored in [ResponseApdu]
     * into an array of [com.tangem.common.tlv.Tlv]. Then maps it into a [CommandResponse].
     * @param environment [SessionEnvironment] of the current card.
     * @param apdu received data.
     * @return Card response converted to a [CommandResponse] of a type [T]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract T deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu);
}