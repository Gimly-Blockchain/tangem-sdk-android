package com.tangem.commands.personalization.entities;

import java.lang.System;

/**
 * It is a configuration file with all the card settings that are written on the card
 * during [PersonalizeCommand].
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0012\n\u0002\b\u001b\u0018\u0000 g2\u00020\u0001:\u0001gB\u00e5\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0011\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020\u0011\u0012\u0006\u0010\'\u001a\u00020\u0011\u0012\u0006\u0010(\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\u0011\u0012\u0006\u0010*\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010,\u001a\u00020\u0011\u0012\u0006\u0010-\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\u0011\u0012\u0006\u0010/\u001a\u000200\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00020302\u00a2\u0006\u0002\u00104R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010 \u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0018\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u0019\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0011\u0010/\u001a\u000200\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010-\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010.\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0011\u0010&\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u0011\u0010%\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0011\u0010!\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00106R\u0011\u0010\u0017\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u00108R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020302\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010?R\u0011\u0010\n\u001a\u00020M\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u000b\u001a\u00020M\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0011\u0010\f\u001a\u00020M\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010$\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u0011\u0010#\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00108R\u0011\u0010\"\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00108R\u0011\u0010,\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0011\u0010+\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00108R\u0011\u0010*\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00108R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010(\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00108R\u0011\u0010\'\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00108R\u0011\u0010)\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00108R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00108R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010\u001a\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00108R\u0011\u0010\u001f\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00108R\u0011\u0010\u001b\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00108R\u0011\u0010\u001d\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00108R\u0011\u0010\u001c\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00108R\u0011\u0010\u001e\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00108\u00a8\u0006h"}, d2 = {"Lcom/tangem/commands/personalization/entities/CardConfig;", "", "issuerName", "", "acquirerName", "series", "startNumber", "", "count", "", "pin", "pin2", "pin3", "hexCrExKey", "cvc", "pauseBeforePin2", "smartSecurityDelay", "", "curveID", "Lcom/tangem/commands/EllipticCurve;", "signingMethods", "Lcom/tangem/commands/SigningMethodMask;", "maxSignatures", "isReusable", "allowSwapPin", "allowSwapPin2", "useActivation", "useCvc", "useNdef", "useDynamicNdef", "useOneCommandAtTime", "useBlock", "allowSelectBlockchain", "forbidPurgeWallet", "protocolAllowUnencrypted", "protocolAllowStaticEncryption", "protectIssuerDataAgainstReplay", "forbidDefaultPin", "disablePrecomputedNdef", "skipSecurityDelayIfValidatedByIssuer", "skipCheckPIN2andCVCIfValidatedByIssuer", "skipSecurityDelayIfValidatedByLinkedTerminal", "restrictOverwriteIssuerDataEx", "requireTerminalTxSignature", "requireTerminalCertSignature", "checkPin3onCard", "createWallet", "cardData", "Lcom/tangem/commands/CardData;", "ndefRecords", "", "Lcom/tangem/commands/personalization/entities/NdefRecord;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/tangem/commands/EllipticCurve;Lcom/tangem/commands/SigningMethodMask;IZZZZZZZZZZZZZZZZZZZZZZZZLcom/tangem/commands/CardData;Ljava/util/List;)V", "getAcquirerName", "()Ljava/lang/String;", "getAllowSelectBlockchain", "()Z", "getAllowSwapPin", "getAllowSwapPin2", "getCardData", "()Lcom/tangem/commands/CardData;", "getCheckPin3onCard", "getCount", "()I", "getCreateWallet", "getCurveID", "()Lcom/tangem/commands/EllipticCurve;", "getCvc", "getDisablePrecomputedNdef", "getForbidDefaultPin", "getForbidPurgeWallet", "getHexCrExKey", "getIssuerName", "getMaxSignatures", "getNdefRecords", "()Ljava/util/List;", "getPauseBeforePin2", "", "getPin", "()[B", "getPin2", "getPin3", "getProtectIssuerDataAgainstReplay", "getProtocolAllowStaticEncryption", "getProtocolAllowUnencrypted", "getRequireTerminalCertSignature", "getRequireTerminalTxSignature", "getRestrictOverwriteIssuerDataEx", "getSeries", "getSigningMethods", "()Lcom/tangem/commands/SigningMethodMask;", "getSkipCheckPIN2andCVCIfValidatedByIssuer", "getSkipSecurityDelayIfValidatedByIssuer", "getSkipSecurityDelayIfValidatedByLinkedTerminal", "getSmartSecurityDelay", "getStartNumber", "()J", "getUseActivation", "getUseBlock", "getUseCvc", "getUseDynamicNdef", "getUseNdef", "getUseOneCommandAtTime", "Companion", "tangem-core"})
public final class CardConfig {
    @org.jetbrains.annotations.NotNull()
    private final byte[] pin = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] pin2 = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] pin3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String issuerName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String acquirerName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String series = null;
    private final long startNumber = 0L;
    private final int count = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hexCrExKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cvc = null;
    private final int pauseBeforePin2 = 0;
    private final boolean smartSecurityDelay = false;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.EllipticCurve curveID = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.SigningMethodMask signingMethods = null;
    private final int maxSignatures = 0;
    private final boolean isReusable = false;
    private final boolean allowSwapPin = false;
    private final boolean allowSwapPin2 = false;
    private final boolean useActivation = false;
    private final boolean useCvc = false;
    private final boolean useNdef = false;
    private final boolean useDynamicNdef = false;
    private final boolean useOneCommandAtTime = false;
    private final boolean useBlock = false;
    private final boolean allowSelectBlockchain = false;
    private final boolean forbidPurgeWallet = false;
    private final boolean protocolAllowUnencrypted = false;
    private final boolean protocolAllowStaticEncryption = false;
    private final boolean protectIssuerDataAgainstReplay = false;
    private final boolean forbidDefaultPin = false;
    private final boolean disablePrecomputedNdef = false;
    private final boolean skipSecurityDelayIfValidatedByIssuer = false;
    private final boolean skipCheckPIN2andCVCIfValidatedByIssuer = false;
    private final boolean skipSecurityDelayIfValidatedByLinkedTerminal = false;
    private final boolean restrictOverwriteIssuerDataEx = false;
    private final boolean requireTerminalTxSignature = false;
    private final boolean requireTerminalCertSignature = false;
    private final boolean checkPin3onCard = false;
    private final boolean createWallet = false;
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.CardData cardData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.tangem.commands.personalization.entities.NdefRecord> ndefRecords = null;
    public static final com.tangem.commands.personalization.entities.CardConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getPin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getPin2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getPin3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssuerName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAcquirerName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSeries() {
        return null;
    }
    
    public final long getStartNumber() {
        return 0L;
    }
    
    public final int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHexCrExKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCvc() {
        return null;
    }
    
    public final int getPauseBeforePin2() {
        return 0;
    }
    
    public final boolean getSmartSecurityDelay() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.EllipticCurve getCurveID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.SigningMethodMask getSigningMethods() {
        return null;
    }
    
    public final int getMaxSignatures() {
        return 0;
    }
    
    public final boolean isReusable() {
        return false;
    }
    
    public final boolean getAllowSwapPin() {
        return false;
    }
    
    public final boolean getAllowSwapPin2() {
        return false;
    }
    
    public final boolean getUseActivation() {
        return false;
    }
    
    public final boolean getUseCvc() {
        return false;
    }
    
    public final boolean getUseNdef() {
        return false;
    }
    
    public final boolean getUseDynamicNdef() {
        return false;
    }
    
    public final boolean getUseOneCommandAtTime() {
        return false;
    }
    
    public final boolean getUseBlock() {
        return false;
    }
    
    public final boolean getAllowSelectBlockchain() {
        return false;
    }
    
    public final boolean getForbidPurgeWallet() {
        return false;
    }
    
    public final boolean getProtocolAllowUnencrypted() {
        return false;
    }
    
    public final boolean getProtocolAllowStaticEncryption() {
        return false;
    }
    
    public final boolean getProtectIssuerDataAgainstReplay() {
        return false;
    }
    
    public final boolean getForbidDefaultPin() {
        return false;
    }
    
    public final boolean getDisablePrecomputedNdef() {
        return false;
    }
    
    public final boolean getSkipSecurityDelayIfValidatedByIssuer() {
        return false;
    }
    
    public final boolean getSkipCheckPIN2andCVCIfValidatedByIssuer() {
        return false;
    }
    
    public final boolean getSkipSecurityDelayIfValidatedByLinkedTerminal() {
        return false;
    }
    
    public final boolean getRestrictOverwriteIssuerDataEx() {
        return false;
    }
    
    public final boolean getRequireTerminalTxSignature() {
        return false;
    }
    
    public final boolean getRequireTerminalCertSignature() {
        return false;
    }
    
    public final boolean getCheckPin3onCard() {
        return false;
    }
    
    public final boolean getCreateWallet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.CardData getCardData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tangem.commands.personalization.entities.NdefRecord> getNdefRecords() {
        return null;
    }
    
    public CardConfig(@org.jetbrains.annotations.Nullable()
    java.lang.String issuerName, @org.jetbrains.annotations.Nullable()
    java.lang.String acquirerName, @org.jetbrains.annotations.Nullable()
    java.lang.String series, long startNumber, int count, @org.jetbrains.annotations.NotNull()
    java.lang.String pin, @org.jetbrains.annotations.NotNull()
    java.lang.String pin2, @org.jetbrains.annotations.NotNull()
    java.lang.String pin3, @org.jetbrains.annotations.Nullable()
    java.lang.String hexCrExKey, @org.jetbrains.annotations.NotNull()
    java.lang.String cvc, int pauseBeforePin2, boolean smartSecurityDelay, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.EllipticCurve curveID, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.SigningMethodMask signingMethods, int maxSignatures, boolean isReusable, boolean allowSwapPin, boolean allowSwapPin2, boolean useActivation, boolean useCvc, boolean useNdef, boolean useDynamicNdef, boolean useOneCommandAtTime, boolean useBlock, boolean allowSelectBlockchain, boolean forbidPurgeWallet, boolean protocolAllowUnencrypted, boolean protocolAllowStaticEncryption, boolean protectIssuerDataAgainstReplay, boolean forbidDefaultPin, boolean disablePrecomputedNdef, boolean skipSecurityDelayIfValidatedByIssuer, boolean skipCheckPIN2andCVCIfValidatedByIssuer, boolean skipSecurityDelayIfValidatedByLinkedTerminal, boolean restrictOverwriteIssuerDataEx, boolean requireTerminalTxSignature, boolean requireTerminalCertSignature, boolean checkPin3onCard, boolean createWallet, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.CardData cardData, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tangem.commands.personalization.entities.NdefRecord> ndefRecords) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tangem/commands/personalization/entities/CardConfig$Companion;", "", "()V", "tangem-core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}