package com.tangem.commands.verifycard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo;", "", "()V", "Request", "Response", "tangem-core"})
public final class CardVerifyAndGetInfo {
    
    public CardVerifyAndGetInfo() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0013"}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request;", "", "requests", "", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request$Item;", "(Ljava/util/List;)V", "getRequests", "()Ljava/util/List;", "setRequests", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "tangem-core"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Request {
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> requests;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> getRequests() {
            return null;
        }
        
        public final void setRequests(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> p0) {
        }
        
        public Request(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> requests) {
            super();
        }
        
        public Request() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item> requests) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Request$Item;", "", "CID", "", "publicKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getCID", "()Ljava/lang/String;", "setCID", "(Ljava/lang/String;)V", "getPublicKey", "setPublicKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tangem-core"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class Item {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String CID;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String publicKey;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCID() {
                return null;
            }
            
            public final void setCID(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPublicKey() {
                return null;
            }
            
            public final void setPublicKey(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public Item(@org.jetbrains.annotations.NotNull()
            java.lang.String CID, @org.jetbrains.annotations.NotNull()
            java.lang.String publicKey) {
                super();
            }
            
            public Item() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Request.Item copy(@org.jetbrains.annotations.NotNull()
            java.lang.String CID, @org.jetbrains.annotations.NotNull()
            java.lang.String publicKey) {
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
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0013"}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response;", "", "results", "", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item;", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "setResults", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "tangem-core"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Response {
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> results;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> getResults() {
            return null;
        }
        
        public final void setResults(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> p0) {
        }
        
        public Response(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> results) {
            super();
        }
        
        public Response() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item> results) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JK\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item;", "", "error", "", "CID", "passed", "", "batch", "artwork", "Lcom/tangem/commands/verifycard/ArtworkInfo;", "substitution", "Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item$SubstitutionInfo;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tangem/commands/verifycard/ArtworkInfo;Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item$SubstitutionInfo;)V", "getCID", "()Ljava/lang/String;", "setCID", "(Ljava/lang/String;)V", "getArtwork", "()Lcom/tangem/commands/verifycard/ArtworkInfo;", "setArtwork", "(Lcom/tangem/commands/verifycard/ArtworkInfo;)V", "getBatch", "setBatch", "getError", "setError", "getPassed", "()Z", "setPassed", "(Z)V", "getSubstitution", "()Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item$SubstitutionInfo;", "setSubstitution", "(Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item$SubstitutionInfo;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "SubstitutionInfo", "tangem-core"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class Item {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String error;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String CID;
            private boolean passed;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String batch;
            @org.jetbrains.annotations.Nullable()
            private com.tangem.commands.verifycard.ArtworkInfo artwork;
            @org.jetbrains.annotations.Nullable()
            private com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo substitution;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getError() {
                return null;
            }
            
            public final void setError(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCID() {
                return null;
            }
            
            public final void setCID(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final boolean getPassed() {
                return false;
            }
            
            public final void setPassed(boolean p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getBatch() {
                return null;
            }
            
            public final void setBatch(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.tangem.commands.verifycard.ArtworkInfo getArtwork() {
                return null;
            }
            
            public final void setArtwork(@org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.ArtworkInfo p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo getSubstitution() {
                return null;
            }
            
            public final void setSubstitution(@org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo p0) {
            }
            
            public Item(@org.jetbrains.annotations.Nullable()
            java.lang.String error, @org.jetbrains.annotations.NotNull()
            java.lang.String CID, boolean passed, @org.jetbrains.annotations.NotNull()
            java.lang.String batch, @org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.ArtworkInfo artwork, @org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo substitution) {
                super();
            }
            
            public Item() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            public final boolean component3() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.tangem.commands.verifycard.ArtworkInfo component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item copy(@org.jetbrains.annotations.Nullable()
            java.lang.String error, @org.jetbrains.annotations.NotNull()
            java.lang.String CID, boolean passed, @org.jetbrains.annotations.NotNull()
            java.lang.String batch, @org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.ArtworkInfo artwork, @org.jetbrains.annotations.Nullable()
            com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo substitution) {
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
            
            @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/tangem/commands/verifycard/CardVerifyAndGetInfo$Response$Item$SubstitutionInfo;", "", "data", "", "signature", "(Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getSignature", "setSignature", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tangem-core"})
            @com.squareup.moshi.JsonClass(generateAdapter = true)
            public static final class SubstitutionInfo {
                @org.jetbrains.annotations.Nullable()
                private java.lang.String data;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String signature;
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getData() {
                    return null;
                }
                
                public final void setData(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getSignature() {
                    return null;
                }
                
                public final void setSignature(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public SubstitutionInfo(@org.jetbrains.annotations.Nullable()
                java.lang.String data, @org.jetbrains.annotations.Nullable()
                java.lang.String signature) {
                    super();
                }
                
                public SubstitutionInfo() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.tangem.commands.verifycard.CardVerifyAndGetInfo.Response.Item.SubstitutionInfo copy(@org.jetbrains.annotations.Nullable()
                java.lang.String data, @org.jetbrains.annotations.Nullable()
                java.lang.String signature) {
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
            }
        }
    }
}