package com.wastemanagement.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/wastemanagement/core/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "customProgressDialog", "Lcom/wastemanagement/view/dialog/CustomProgressDialog;", "networkHelper", "Lcom/wastemanagement/network/NetworkHelper;", "getNetworkHelper", "()Lcom/wastemanagement/network/NetworkHelper;", "setNetworkHelper", "(Lcom/wastemanagement/network/NetworkHelper;)V", "preferences", "Lcom/wastemanagement/preferences/Preferences;", "getPreferences", "()Lcom/wastemanagement/preferences/Preferences;", "setPreferences", "(Lcom/wastemanagement/preferences/Preferences;)V", "hideProgress", "", "showProgress", "activity", "Landroid/app/Activity;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.wastemanagement.preferences.Preferences preferences;
    @javax.inject.Inject()
    public com.wastemanagement.network.NetworkHelper networkHelper;
    private com.wastemanagement.view.dialog.CustomProgressDialog customProgressDialog;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.preferences.Preferences getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.preferences.Preferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.network.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    public final void setNetworkHelper(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.network.NetworkHelper p0) {
    }
    
    /**
     * show progress dialog
     * @param context context of activity
     */
    protected final void showProgress(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * hide progress dialog
     */
    protected final void hideProgress() {
    }
}