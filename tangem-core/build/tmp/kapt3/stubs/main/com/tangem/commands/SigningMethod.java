package com.tangem.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/tangem/commands/SigningMethod;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "SignHash", "SignRaw", "SignHashSignedByIssuer", "SignRawSignedByIssuer", "SignHashSignedByIssuerAndUpdateIssuerData", "SignRawSignedByIssuerAndUpdateIssuerData", "SignPos", "tangem-core"})
public enum SigningMethod {
    /*public static final*/ SignHash /* = new SignHash(0) */,
    /*public static final*/ SignRaw /* = new SignRaw(0) */,
    /*public static final*/ SignHashSignedByIssuer /* = new SignHashSignedByIssuer(0) */,
    /*public static final*/ SignRawSignedByIssuer /* = new SignRawSignedByIssuer(0) */,
    /*public static final*/ SignHashSignedByIssuerAndUpdateIssuerData /* = new SignHashSignedByIssuerAndUpdateIssuerData(0) */,
    /*public static final*/ SignRawSignedByIssuerAndUpdateIssuerData /* = new SignRawSignedByIssuerAndUpdateIssuerData(0) */,
    /*public static final*/ SignPos /* = new SignPos(0) */;
    private final int code = 0;
    
    public final int getCode() {
        return 0;
    }
    
    SigningMethod(int code) {
    }
}