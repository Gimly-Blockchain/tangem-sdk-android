package com.tangem.commands;

import java.lang.System;

/**
 * This command will create a new wallet on the card having ‘Empty’ state.
 * A key pair WalletPublicKey / WalletPrivateKey is generated and securely stored in the card.
 * App will need to obtain Wallet_PublicKey from the response of [CreateWalletCommand] or [ReadCommand]
 * and then transform it into an address of corresponding blockchain wallet
 * according to a specific blockchain algorithm.
 * WalletPrivateKey is never revealed by the card and will be used by [SignCommand] and [CheckWalletCommand].
 * RemainingSignature is set to MaxSignatures.
 *
 * @property cardId CID, Unique Tangem card ID number.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/tangem/commands/CreateWalletCommand;", "Lcom/tangem/commands/Command;", "Lcom/tangem/commands/CreateWalletResponse;", "()V", "requiresPin2", "", "getRequiresPin2", "()Z", "deserialize", "environment", "Lcom/tangem/SessionEnvironment;", "apdu", "Lcom/tangem/common/apdu/ResponseApdu;", "mapError", "Lcom/tangem/TangemError;", "card", "Lcom/tangem/commands/Card;", "error", "performPreCheck", "Lcom/tangem/TangemSdkError;", "serialize", "Lcom/tangem/common/apdu/CommandApdu;", "tangem-core"})
public final class CreateWalletCommand extends com.tangem.commands.Command<com.tangem.commands.CreateWalletResponse> {
    private final boolean requiresPin2 = true;
    
    @java.lang.Override()
    public boolean getRequiresPin2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tangem.TangemSdkError performPreCheck(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tangem.TangemError mapError(@org.jetbrains.annotations.Nullable()
    com.tangem.commands.Card card, @org.jetbrains.annotations.NotNull()
    com.tangem.TangemError error) {
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
    public com.tangem.commands.CreateWalletResponse deserialize(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.tangem.common.apdu.ResponseApdu apdu) {
        return null;
    }
    
    public CreateWalletCommand() {
        super();
    }
}