package com.wastemanagement.ui.dashboard.acceptor.profile.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020)H\u0002J\u0012\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u00020)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b\'\u0010\u0018\u00a8\u00066"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/profile/activity/UpdateProfileActivity;", "Lcom/wastemanagement/core/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/wastemanagement/databinding/ActivityUpdateProfileBinding;", "categoryList", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/donor/category/model/DonationCategoryModel$Data;", "getCategoryList", "()Ljava/util/ArrayList;", "setCategoryList", "(Ljava/util/ArrayList;)V", "categoryViewModel", "Lcom/wastemanagement/ui/dashboard/viewmodel/CategoryViewModel;", "getCategoryViewModel", "()Lcom/wastemanagement/ui/dashboard/viewmodel/CategoryViewModel;", "categoryViewModel$delegate", "Lkotlin/Lazy;", "latitude", "", "getLatitude", "()Ljava/lang/String;", "setLatitude", "(Ljava/lang/String;)V", "longitude", "getLongitude", "setLongitude", "profileViewModel", "Lcom/wastemanagement/ui/dashboard/viewmodel/ProfileVIewModel;", "getProfileViewModel", "()Lcom/wastemanagement/ui/dashboard/viewmodel/ProfileVIewModel;", "profileViewModel$delegate", "startPlacesAutoSearchResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "strCategoryId", "getStrCategoryId", "setStrCategoryId", "callAutoSearch", "", "checkValidation", "", "init", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCategoryListAdapter", "setObserver", "setProfileData", "app_debug"})
public final class UpdateProfileActivity extends com.wastemanagement.core.BaseActivity implements android.view.View.OnClickListener {
    private com.wastemanagement.databinding.ActivityUpdateProfileBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> categoryList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strCategoryId = "-1";
    private final kotlin.Lazy categoryViewModel$delegate = null;
    private final kotlin.Lazy profileViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String latitude = "0.0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String longitude = "0.0";
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startPlacesAutoSearchResult = null;
    
    public UpdateProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> getCategoryList() {
        return null;
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCategoryId() {
        return null;
    }
    
    public final void setStrCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.wastemanagement.ui.dashboard.viewmodel.CategoryViewModel getCategoryViewModel() {
        return null;
    }
    
    private final com.wastemanagement.ui.dashboard.viewmodel.ProfileVIewModel getProfileViewModel() {
        return null;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Method is used to initialize data and views
     */
    private final void init() {
    }
    
    /**
     * set Profile data to UI
     */
    private final void setProfileData() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    /**
     * manage auto search places
     */
    private final void callAutoSearch() {
    }
    
    /**
     * Set observer
     */
    private final void setObserver() {
    }
    
    /**
     * This is used to set category list to dropdown
     */
    private final void setCategoryListAdapter() {
    }
    
    /**
     * Method is used to check all value are valid or not
     */
    public final boolean checkValidation() {
        return false;
    }
}