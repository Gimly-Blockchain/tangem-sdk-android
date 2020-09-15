package com.tangem.commands.file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/tangem/commands/file/ReadFileDataResponse;", "Lcom/tangem/commands/CommandResponse;", "cardId", "", "size", "", "fileData", "", "fileIndex", "fileSettings", "Lcom/tangem/commands/file/FileSettings;", "fileDataSignature", "fileDataCounter", "(Ljava/lang/String;Ljava/lang/Integer;[BILcom/tangem/commands/file/FileSettings;[BLjava/lang/Integer;)V", "getCardId", "()Ljava/lang/String;", "getFileData", "()[B", "getFileDataCounter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFileDataSignature", "getFileIndex", "()I", "getFileSettings", "()Lcom/tangem/commands/file/FileSettings;", "getSize", "tangem-core"})
public final class ReadFileDataResponse implements com.tangem.commands.CommandResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer size = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] fileData = null;
    private final int fileIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.tangem.commands.file.FileSettings fileSettings = null;
    @org.jetbrains.annotations.Nullable()
    private final byte[] fileDataSignature = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fileDataCounter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getFileData() {
        return null;
    }
    
    public final int getFileIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tangem.commands.file.FileSettings getFileSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getFileDataSignature() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFileDataCounter() {
        return null;
    }
    
    public ReadFileDataResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.NotNull()
    byte[] fileData, int fileIndex, @org.jetbrains.annotations.Nullable()
    com.tangem.commands.file.FileSettings fileSettings, @org.jetbrains.annotations.Nullable()
    byte[] fileDataSignature, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fileDataCounter) {
        super();
    }
}