package com.wastemanagement.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0004J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/wastemanagement/core/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "customProgressDialog", "Lcom/wastemanagement/view/dialog/CustomProgressDialog;", "mContext", "Landroid/content/Context;", "networkHelper", "Lcom/wastemanagement/network/NetworkHelper;", "getNetworkHelper", "()Lcom/wastemanagement/network/NetworkHelper;", "setNetworkHelper", "(Lcom/wastemanagement/network/NetworkHelper;)V", "preferences", "Lcom/wastemanagement/preferences/Preferences;", "getPreferences", "()Lcom/wastemanagement/preferences/Preferences;", "setPreferences", "(Lcom/wastemanagement/preferences/Preferences;)V", "hideProgress", "", "onAttach", "context", "showProgress", "activity", "Landroid/app/Activity;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public class BaseFragment extends androidx.fragment.app.Fragment {
    private com.wastemanagement.view.dialog.CustomProgressDialog customProgressDialog;
    private android.content.Context mContext;
    @javax.inject.Inject()
    public com.wastemanagement.preferences.Preferences preferences;
    @javax.inject.Inject()
    public com.wastemanagement.network.NetworkHelper networkHelper;
    
    public BaseFragment() {
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
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * show progress dialog
     * @param activity activity of activity
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