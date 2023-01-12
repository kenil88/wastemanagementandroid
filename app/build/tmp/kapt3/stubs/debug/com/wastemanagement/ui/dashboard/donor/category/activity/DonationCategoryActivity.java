package com.wastemanagement.ui.dashboard.donor.category.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/wastemanagement/ui/dashboard/donor/category/activity/DonationCategoryActivity;", "Lcom/wastemanagement/core/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/wastemanagement/ui/dashboard/listner/ClickListener;", "()V", "binding", "Lcom/wastemanagement/databinding/ActivityDonationCategoryBinding;", "getBinding", "()Lcom/wastemanagement/databinding/ActivityDonationCategoryBinding;", "setBinding", "(Lcom/wastemanagement/databinding/ActivityDonationCategoryBinding;)V", "categoryList", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/donor/category/model/DonationCategoryModel$Data;", "getCategoryList", "()Ljava/util/ArrayList;", "setCategoryList", "(Ljava/util/ArrayList;)V", "mDonationCategoryAdapter", "Lcom/wastemanagement/ui/dashboard/donor/category/adapter/DonarCategoryListAdapter;", "getMDonationCategoryAdapter", "()Lcom/wastemanagement/ui/dashboard/donor/category/adapter/DonarCategoryListAdapter;", "setMDonationCategoryAdapter", "(Lcom/wastemanagement/ui/dashboard/donor/category/adapter/DonarCategoryListAdapter;)V", "viewModel", "Lcom/wastemanagement/ui/dashboard/viewmodel/CategoryViewModel;", "getViewModel", "()Lcom/wastemanagement/ui/dashboard/viewmodel/CategoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "onCategoryClick", "position", "", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setObserver", "app_debug"})
public final class DonationCategoryActivity extends com.wastemanagement.core.BaseActivity implements android.view.View.OnClickListener, com.wastemanagement.ui.dashboard.listner.ClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    public com.wastemanagement.databinding.ActivityDonationCategoryBinding binding;
    public com.wastemanagement.ui.dashboard.donor.category.adapter.DonarCategoryListAdapter mDonationCategoryAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> categoryList;
    
    public DonationCategoryActivity() {
        super();
    }
    
    private final com.wastemanagement.ui.dashboard.viewmodel.CategoryViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.databinding.ActivityDonationCategoryBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.databinding.ActivityDonationCategoryBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.ui.dashboard.donor.category.adapter.DonarCategoryListAdapter getMDonationCategoryAdapter() {
        return null;
    }
    
    public final void setMDonationCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.donor.category.adapter.DonarCategoryListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> getCategoryList() {
        return null;
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel.Data> p0) {
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
     * Set observer
     */
    private final void setObserver() {
    }
    
    private final void setAdapter() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public void onCategoryClick(int position) {
    }
    
    public void onRequestUpdate(int id, int status) {
    }
}