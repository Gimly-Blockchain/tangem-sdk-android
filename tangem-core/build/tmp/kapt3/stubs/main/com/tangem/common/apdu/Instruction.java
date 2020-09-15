package com.tangem.common.apdu;

import java.lang.System;

/**
 * Instruction code that determines the type of the command that is sent to the Tangem card.
 * It is used in the construction of [com.tangem.common.apdu.CommandApdu].
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/tangem/common/apdu/Instruction;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "setCode", "(I)V", "Unknown", "Personalize", "Read", "VerifyCard", "ValidateCard", "VerifyCode", "WriteIssuerData", "ReadIssuerData", "CreateWallet", "CheckWallet", "SetPin", "Sign", "PurgeWallet", "Activate", "OpenSession", "WriteUserData", "ReadUserData", "Depersonalize", "WriteFileData", "ReadFileData", "Companion", "tangem-core"})
public enum Instruction {
    /*public static final*/ Unknown /* = new Unknown(0) */,
    /*public static final*/ Personalize /* = new Personalize(0) */,
    /*public static final*/ Read /* = new Read(0) */,
    /*public static final*/ VerifyCard /* = new VerifyCard(0) */,
    /*public static final*/ ValidateCard /* = new ValidateCard(0) */,
    /*public static final*/ VerifyCode /* = new VerifyCode(0) */,
    /*public static final*/ WriteIssuerData /* = new WriteIssuerData(0) */,
    /*public static final*/ ReadIssuerData /* = new ReadIssuerData(0) */,
    /*public static final*/ CreateWallet /* = new CreateWallet(0) */,
    /*public static final*/ CheckWallet /* = new CheckWallet(0) */,
    /*public static final*/ SetPin /* = new SetPin(0) */,
    /*public static final*/ Sign /* = new Sign(0) */,
    /*public static final*/ PurgeWallet /* = new PurgeWallet(0) */,
    /*public static final*/ Activate /* = new Activate(0) */,
    /*public static final*/ OpenSession /* = new OpenSession(0) */,
    /*public static final*/ WriteUserData /* = new WriteUserData(0) */,
    /*public static final*/ ReadUserData /* = new ReadUserData(0) */,
    /*public static final*/ Depersonalize /* = new Depersonalize(0) */,
    /*public static final*/ WriteFileData /* = new WriteFileData(0) */,
    /*public static final*/ ReadFileData /* = new ReadFileData(0) */;
    private int code;
    private static final com.tangem.common.apdu.Instruction[] values = null;
    public static final com.tangem.common.apdu.Instruction.Companion Companion = null;
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    Instruction(int code) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/tangem/common/apdu/Instruction$Companion;", "", "()V", "values", "", "Lcom/tangem/common/apdu/Instruction;", "[Lcom/tangem/common/apdu/Instruction;", "byCode", "code", "", "tangem-core"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.common.apdu.Instruction byCode(int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}