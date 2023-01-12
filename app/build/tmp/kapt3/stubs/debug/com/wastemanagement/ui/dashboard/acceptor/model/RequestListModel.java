package com.wastemanagement.ui.dashboard.acceptor.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel;", "", "message", "", "result", "", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result;", "status", "", "(Ljava/lang/String;Ljava/util/List;Z)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "getStatus", "()Z", "setStatus", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Result", "app_debug"})
public final class RequestListModel {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "result")
    private java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> result;
    @com.google.gson.annotations.SerializedName(value = "status")
    private boolean status;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> result, boolean status) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RequestListModel() {
        super();
    }
    
    public RequestListModel(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> result, boolean status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00017Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u0019\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u00c6\u0003Js\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00068"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result;", "", "requestId", "", "acceptorId", "", "description", "donorContact", "donorEmail", "donorLocation", "donorName", "isAccepted", "requestImage", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result$RequestImage;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAcceptorId", "()Ljava/lang/String;", "setAcceptorId", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getDonorContact", "setDonorContact", "getDonorEmail", "setDonorEmail", "getDonorLocation", "setDonorLocation", "getDonorName", "setDonorName", "setAccepted", "getRequestId", "()I", "setRequestId", "(I)V", "getRequestImage", "()Ljava/util/ArrayList;", "setRequestImage", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "RequestImage", "app_debug"})
    public static final class Result {
        @com.google.gson.annotations.SerializedName(value = "request_id")
        private int requestId;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "acceptor_id")
        private java.lang.String acceptorId;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "description")
        private java.lang.String description;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "donor_contact")
        private java.lang.String donorContact;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "donor_email")
        private java.lang.String donorEmail;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "donor_location")
        private java.lang.String donorLocation;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "donor_name")
        private java.lang.String donorName;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "is_accepted")
        private java.lang.String isAccepted;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "request_image")
        private java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> requestImage;
        
        @org.jetbrains.annotations.NotNull()
        public final com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result copy(int requestId, @org.jetbrains.annotations.NotNull()
        java.lang.String acceptorId, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String donorContact, @org.jetbrains.annotations.NotNull()
        java.lang.String donorEmail, @org.jetbrains.annotations.NotNull()
        java.lang.String donorLocation, @org.jetbrains.annotations.NotNull()
        java.lang.String donorName, @org.jetbrains.annotations.NotNull()
        java.lang.String isAccepted, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> requestImage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Result() {
            super();
        }
        
        public Result(int requestId, @org.jetbrains.annotations.NotNull()
        java.lang.String acceptorId, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String donorContact, @org.jetbrains.annotations.NotNull()
        java.lang.String donorEmail, @org.jetbrains.annotations.NotNull()
        java.lang.String donorLocation, @org.jetbrains.annotations.NotNull()
        java.lang.String donorName, @org.jetbrains.annotations.NotNull()
        java.lang.String isAccepted, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> requestImage) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getRequestId() {
            return 0;
        }
        
        public final void setRequestId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAcceptorId() {
            return null;
        }
        
        public final void setAcceptorId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDonorContact() {
            return null;
        }
        
        public final void setDonorContact(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDonorEmail() {
            return null;
        }
        
        public final void setDonorEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDonorLocation() {
            return null;
        }
        
        public final void setDonorLocation(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDonorName() {
            return null;
        }
        
        public final void setDonorName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String isAccepted() {
            return null;
        }
        
        public final void setAccepted(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> getRequestImage() {
            return null;
        }
        
        public final void setRequestImage(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result$RequestImage;", "", "imageName", "", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "setImageName", "(Ljava/lang/String;)V", "getPath", "setPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
        public static final class RequestImage {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "image_name")
            private java.lang.String imageName;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "path")
            private java.lang.String path;
            
            @org.jetbrains.annotations.NotNull()
            public final com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result.RequestImage copy(@org.jetbrains.annotations.NotNull()
            java.lang.String imageName, @org.jetbrains.annotations.NotNull()
            java.lang.String path) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public RequestImage() {
                super();
            }
            
            public RequestImage(@org.jetbrains.annotations.NotNull()
            java.lang.String imageName, @org.jetbrains.annotations.NotNull()
            java.lang.String path) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getImageName() {
                return null;
            }
            
            public final void setImageName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPath() {
                return null;
            }
            
            public final void setPath(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
        }
    }
}