package com.wastemanagement.ui.dashboard.donor.organization.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u0006\u00100\u001a\u00020.J\u0012\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0010\u00107\u001a\u00020.2\u0006\u00102\u001a\u00020\u0019H\u0016J\u0010\u00108\u001a\u00020\u00142\u0006\u00102\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020\u000eH\u0016J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020.H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*\u00a8\u0006>"}, d2 = {"Lcom/wastemanagement/ui/dashboard/donor/organization/activity/OrganizationsActivity;", "Lcom/wastemanagement/core/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/wastemanagement/ui/dashboard/donor/organization/listner/OrganizationClickListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "binding", "Lcom/wastemanagement/databinding/ActivityOrganizationsBinding;", "getBinding", "()Lcom/wastemanagement/databinding/ActivityOrganizationsBinding;", "setBinding", "(Lcom/wastemanagement/databinding/ActivityOrganizationsBinding;)V", "categoryId", "", "getCategoryId", "()I", "setCategoryId", "(I)V", "isListView", "", "()Z", "setListView", "(Z)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mOrganizationListAdapter", "Lcom/wastemanagement/ui/dashboard/donor/organization/adapter/OrganizationListAdapter;", "getMOrganizationListAdapter", "()Lcom/wastemanagement/ui/dashboard/donor/organization/adapter/OrganizationListAdapter;", "setMOrganizationListAdapter", "(Lcom/wastemanagement/ui/dashboard/donor/organization/adapter/OrganizationListAdapter;)V", "organizationList", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/donor/organization/model/OrganizationListModel$Result;", "getOrganizationList", "()Ljava/util/ArrayList;", "setOrganizationList", "(Ljava/util/ArrayList;)V", "organizationViewModel", "Lcom/wastemanagement/ui/dashboard/viewmodel/OrganizationViewModel;", "getOrganizationViewModel", "()Lcom/wastemanagement/ui/dashboard/viewmodel/OrganizationViewModel;", "organizationViewModel$delegate", "Lkotlin/Lazy;", "addMarkerToMap", "", "init", "loadData", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "onMarkerClick", "Lcom/google/android/gms/maps/model/Marker;", "onOrganizationClick", "position", "setAdapter", "setObserver", "app_debug"})
public final class OrganizationsActivity extends com.wastemanagement.core.BaseActivity implements android.view.View.OnClickListener, com.wastemanagement.ui.dashboard.donor.organization.listner.OrganizationClickListener, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    public com.wastemanagement.databinding.ActivityOrganizationsBinding binding;
    public com.wastemanagement.ui.dashboard.donor.organization.adapter.OrganizationListAdapter mOrganizationListAdapter;
    private int categoryId = 0;
    private final kotlin.Lazy organizationViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel.Result> organizationList;
    private boolean isListView = true;
    private com.google.android.gms.maps.GoogleMap mMap;
    
    public OrganizationsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.databinding.ActivityOrganizationsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.databinding.ActivityOrganizationsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.ui.dashboard.donor.organization.adapter.OrganizationListAdapter getMOrganizationListAdapter() {
        return null;
    }
    
    public final void setMOrganizationListAdapter(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.donor.organization.adapter.OrganizationListAdapter p0) {
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    public final void setCategoryId(int p0) {
    }
    
    private final com.wastemanagement.ui.dashboard.viewmodel.OrganizationViewModel getOrganizationViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel.Result> getOrganizationList() {
        return null;
    }
    
    public final void setOrganizationList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel.Result> p0) {
    }
    
    public final boolean isListView() {
        return false;
    }
    
    public final void setListView(boolean p0) {
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
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    /**
     * Method is used to set adapter
     */
    private final void setAdapter() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public final void loadData() {
    }
    
    /**
     * Set observer
     */
    private final void setObserver() {
    }
    
    /**
     * Method is used to add marker in map
     */
    private final void addMarkerToMap() {
    }
    
    @java.lang.Override()
    public void onOrganizationClick(int position) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
}