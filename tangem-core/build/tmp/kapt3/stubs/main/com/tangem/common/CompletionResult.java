package com.tangem.common;

import java.lang.System;

/**
 * Response class encapsulating successful and failed results.
 * @param T Type of data that is returned in [Success].
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tangem/common/CompletionResult;", "T", "", "()V", "Failure", "Success", "Lcom/tangem/common/CompletionResult$Success;", "Lcom/tangem/common/CompletionResult$Failure;", "tangem-core"})
public abstract class CompletionResult<T extends java.lang.Object> {
    
    private CompletionResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/tangem/common/CompletionResult$Success;", "T", "Lcom/tangem/common/CompletionResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "tangem-core"})
    public static final class Success<T extends java.lang.Object> extends com.tangem.common.CompletionResult<T> {
        private final T data = null;
        
        public final T getData() {
            return null;
        }
        
        public Success(T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tangem/common/CompletionResult$Failure;", "T", "Lcom/tangem/common/CompletionResult;", "error", "Lcom/tangem/TangemError;", "(Lcom/tangem/TangemError;)V", "getError", "()Lcom/tangem/TangemError;", "tangem-core"})
    public static final class Failure<T extends java.lang.Object> extends com.tangem.common.CompletionResult<T> {
        @org.jetbrains.annotations.NotNull()
        private final com.tangem.TangemError error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.TangemError getError() {
            return null;
        }
        
        public Failure(@org.jetbrains.annotations.NotNull()
        com.tangem.TangemError error) {
            super();
        }
    }
}