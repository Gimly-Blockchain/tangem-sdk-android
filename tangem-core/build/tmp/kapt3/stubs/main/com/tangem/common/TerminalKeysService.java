package com.tangem.common;

import java.lang.System;

/**
 * Interface for a service for managing Terminal keypair, used for Linked Terminal feature.
 * Its implementation Needs to be provided to [com.tangem.TangemSdk]
 * by calling [com.tangem.TangemSdk.setTerminalKeysService].
 * Default implementation is provided in tangem-sdk module: [TerminalKeysStorage].
 * Linked Terminal feature can be disabled manually by editing [com.tangem.Config].
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/tangem/common/TerminalKeysService;", "", "getKeys", "Lcom/tangem/KeyPair;", "tangem-core"})
public abstract interface TerminalKeysService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tangem.KeyPair getKeys();
}