package com.tangem.commands.personalization;

import java.lang.System;

/**
 * Command available on SDK cards only
 *
 * Personalization is an initialization procedure, required before starting using a card.
 * During this procedure a card setting is set up.
 * During this procedure all data exchange is encrypted.
 * @property config is a configuration file with all the card settings that are written on the card
 * during personalization.
 * @property issuer Issuer is a third-party team or company wishing to use Tangem cards.
 * @property manufacturer Tangem Card Manufacturer.
 * @property acquirer Acquirer is a trusted third-party company that operates proprietary
 * (non-EMV) POS terminal infrastructure and transaction processing back-end.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J9\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\'\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u001a\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/tangem/commands/personalization/PersonalizeCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/Card;", "config", "Lcom/tangem/commands/personalization/entities/CardConfig;", "issuer", "Lcom/tangem/commands/personalization/entities/Issuer;", "manufacturer", "Lcom/tangem/commands/personalization/entities/Manufacturer;", "acquirer", "Lcom/tangem/commands/personalization/entities/Acquirer;", "(Lcom/tangem/commands/personalization/entities/CardConfig;Lcom/tangem/commands/personalization/entities/Issuer;Lcom/tangem/commands/personalization/entities/Manufacturer;Lcom/tangem/commands/personalization/entities/Acquirer;)V", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "performPreCheck", "Lcom/tangem/TangemSdkError;", "card", "run", "", "session", "Lcom/tangem/CardSession;", "callback", "Lkotlin/Function1;", "Lcom/tangem/common/CompletionResult;", "Lkotlin/ParameterName;", "name", "result", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "serializeCardData", "", "cardId", "", "cardData", "Lcom/tangem/commands/CardData;", "serializeNdef", "serializePersonalizationData", "Companion", "tangem-core"})
public final class PersonalizeCommand extends com.tangem.commands.Command<com.tangem.commands.Card> {
    private final com.tangem.commands.personalization.entities.CardConfig config = null;
    private final com.tangem.commands.personalization.entities.Issuer issuer = null;
    private final com.tangem.commands.personalization.entities.Manufacturer manufacturer = null;
    private final com.tangem.commands.personalization.entities.Acquirer acquirer = null;
    @org.jetbrains.annotations.NotNull()
    private static final byte[] devPersonalizationKey = null;
    public static final com.tangem.commands.personalization.PersonalizeCommand.Companion Companion = null;
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    com.tangem.CardSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tangem.common.CompletionResult<com.tangem.commands.Card>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.common.apdu.CommandApdu serialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.commands.Card deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    private final byte[] serializePersonalizationData(com.tangem.commands.personalization.entities.CardConfig config) {
        return null;
    }
    
    private final byte[] serializeNdef(com.tangem.commands.personalization.entities.CardConfig config) {
        return null;
    }
    
    private final byte[] serializeCardData(java.lang.String cardId, com.tangem.commands.CardData cardData) {
        return null;
    }
    
    public PersonalizeCommand(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.CardConfig config, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.Issuer issuer, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.Manufacturer manufacturer, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.personalization.entities.Acquirer acquirer) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tangem/commands/personalization/PersonalizeCommand$Companion;", "", "()V", "devPersonalizationKey", "", "getDevPersonalizationKey", "()[B", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getDevPersonalizationKey() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}