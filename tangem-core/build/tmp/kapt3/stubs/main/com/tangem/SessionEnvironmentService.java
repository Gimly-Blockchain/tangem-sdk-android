package com.tangem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/tangem/SessionEnvironmentService;", "", "config", "Lcom/tangem/Config;", "terminalKeysService", "Lcom/tangem/common/TerminalKeysService;", "cardValuesStorage", "Lcom/tangem/common/CardValuesStorage;", "(Lcom/tangem/Config;Lcom/tangem/common/TerminalKeysService;Lcom/tangem/common/CardValuesStorage;)V", "createEnvironment", "Lcom/tangem/SessionEnvironment;", "cardId", "", "saveEnvironmentValues", "", "environment", "updateEnvironment", "tangem-core"})
public final class SessionEnvironmentService {
    private final com.tangem.Config config = null;
    private final com.tangem.common.TerminalKeysService terminalKeysService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.SessionEnvironment createEnvironment(@org.jetbrains.annotations.Nullable()
    java.lang.String cardId) {
        return null;
    }
    
    public final void updateEnvironment(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.NotNull()
    java.lang.String cardId) {
    }
    
    public final void saveEnvironmentValues(@org.jetbrains.annotations.NotNull()
    com.tangem.SessionEnvironment environment, @org.jetbrains.annotations.Nullable()
    java.lang.String cardId) {
    }
    
    public SessionEnvironmentService(@org.jetbrains.annotations.NotNull()
    com.tangem.Config config, @org.jetbrains.annotations.Nullable()
    com.tangem.common.TerminalKeysService terminalKeysService, @org.jetbrains.annotations.Nullable()
    com.tangem.common.CardValuesStorage cardValuesStorage) {
        super();
    }
}