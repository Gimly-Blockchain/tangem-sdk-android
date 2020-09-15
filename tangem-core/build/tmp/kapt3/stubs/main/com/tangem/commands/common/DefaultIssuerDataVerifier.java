package com.tangem.commands.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/tangem/commands/common/DefaultIssuerDataVerifier;", "Lcom/tangem/commands/common/IssuerDataVerifier;", "()V", "verify", "", "issuerPublicKey", "", "signature", "issuerDataToVerify", "Lcom/tangem/commands/common/IssuerDataToVerify;", "tangem-core"})
public final class DefaultIssuerDataVerifier implements com.tangem.commands.common.IssuerDataVerifier {
    
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.NotNull()
    byte[] issuerPublicKey, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    com.tangem.commands.common.IssuerDataToVerify issuerDataToVerify) {
        return false;
    }
    
    public DefaultIssuerDataVerifier() {
        super();
    }
}