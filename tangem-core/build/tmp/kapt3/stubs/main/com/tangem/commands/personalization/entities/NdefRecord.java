package com.tangem.commands.personalization.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/tangem/commands/personalization/entities/NdefRecord;", "", "type", "Lcom/tangem/commands/personalization/entities/NdefRecord$Type;", "value", "", "(Lcom/tangem/commands/personalization/entities/NdefRecord$Type;Ljava/lang/String;)V", "getType", "()Lcom/tangem/commands/personalization/entities/NdefRecord$Type;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "valueInBytes", "", "Type", "tangem-core"})
public final class NdefRecord {
    @org.jetbrains.annotations.NotNull()
    private final com.tangem.commands.personalization.entities.NdefRecord.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] valueInBytes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.personalization.entities.NdefRecord.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    public NdefRecord(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.NdefRecord.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.personalization.entities.NdefRecord.Type component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tangem.commands.personalization.entities.NdefRecord copy(@org.jetbrains.annotations.NotNull()
    com.tangem.commands.personalization.entities.NdefRecord.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tangem/commands/personalization/entities/NdefRecord$Type;", "", "(Ljava/lang/String;I)V", "URI", "AAR", "TEXT", "tangem-core"})
    public static enum Type {
        /*public static final*/ URI /* = new URI() */,
        /*public static final*/ AAR /* = new AAR() */,
        /*public static final*/ TEXT /* = new TEXT() */;
        
        Type() {
        }
    }
}