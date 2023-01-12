package com.wastemanagement.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/wastemanagement/utils/Constants;", "", "()V", "InternalServerError", "", "Location", "", "MSG_NO_INTERNET_CONNECTION", "MSG_SOMETHING_WENT_WRONG", "Pallet", "SuccessCode", "UnAuthorize", "logout", "", "appContext", "Landroid/content/Context;", "userPreferences", "Lcom/wastemanagement/preferences/Preferences;", "IntentConstants", "PrefKeys", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.wastemanagement.utils.Constants INSTANCE = null;
    public static final int UnAuthorize = 401;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String Location = "Location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String Pallet = "Pallet";
    public static final int SuccessCode = 200;
    public static final int InternalServerError = 500;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_NO_INTERNET_CONNECTION = "The internet connection appears to be offline";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_SOMETHING_WENT_WRONG = "Something went wrong";
    
    private Constants() {
        super();
    }
    
    public final void logout(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.preferences.Preferences userPreferences) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b\u00a8\u0006*"}, d2 = {"Lcom/wastemanagement/utils/Constants$PrefKeys;", "", "()V", "categoryId", "", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "categoryName", "getCategoryName", "setCategoryName", "email", "getEmail", "setEmail", "firstName", "getFirstName", "setFirstName", "lastName", "getLastName", "setLastName", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "orgContact", "getOrgContact", "setOrgContact", "orgLocation", "getOrgLocation", "setOrgLocation", "orgName", "getOrgName", "setOrgName", "userToken", "getUserToken", "setUserToken", "userid", "getUserid", "setUserid", "app_debug"})
    public static final class PrefKeys {
        @org.jetbrains.annotations.NotNull()
        public static final com.wastemanagement.utils.Constants.PrefKeys INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String userid = "userid";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String userToken = "usertoken";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String email = "email";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String firstName = "first_name";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String lastName = "last_name";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String orgName = "org_name";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String orgLocation = "org_location";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String latitude = "latitude";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String longitude = "longitude";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String orgContact = "org_contact";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String categoryName = "category_name";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String categoryId = "category_id";
        
        private PrefKeys() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserid() {
            return null;
        }
        
        public final void setUserid(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserToken() {
            return null;
        }
        
        public final void setUserToken(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirstName() {
            return null;
        }
        
        public final void setFirstName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastName() {
            return null;
        }
        
        public final void setLastName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrgName() {
            return null;
        }
        
        public final void setOrgName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrgLocation() {
            return null;
        }
        
        public final void setOrgLocation(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLatitude() {
            return null;
        }
        
        public final void setLatitude(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLongitude() {
            return null;
        }
        
        public final void setLongitude(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrgContact() {
            return null;
        }
        
        public final void setOrgContact(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategoryName() {
            return null;
        }
        
        public final void setCategoryName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategoryId() {
            return null;
        }
        
        public final void setCategoryId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wastemanagement/utils/Constants$IntentConstants;", "", "()V", "CATEGORY_ID", "", "ORGANIZATION_ID", "ORGANIZATION_NAME", "app_debug"})
    public static final class IntentConstants {
        @org.jetbrains.annotations.NotNull()
        public static final com.wastemanagement.utils.Constants.IntentConstants INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CATEGORY_ID = "categoryid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ORGANIZATION_ID = "orgid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ORGANIZATION_NAME = "orgname";
        
        private IntentConstants() {
            super();
        }
    }
}