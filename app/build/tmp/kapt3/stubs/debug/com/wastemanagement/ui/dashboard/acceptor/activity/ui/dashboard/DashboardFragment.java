package com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0017H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00100\u001a\u00020%2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00066"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/DashboardFragment;", "Lcom/wastemanagement/core/BaseFragment;", "Lcom/wastemanagement/ui/dashboard/listner/ClickListener;", "()V", "adapter", "Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter;", "getAdapter", "()Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter;", "setAdapter", "(Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter;)V", "binding", "Lcom/wastemanagement/databinding/FragmentDashboardBinding;", "getBinding", "()Lcom/wastemanagement/databinding/FragmentDashboardBinding;", "setBinding", "(Lcom/wastemanagement/databinding/FragmentDashboardBinding;)V", "donationRequestViewModel", "Lcom/wastemanagement/ui/dashboard/viewmodel/DonationRequestViewModel;", "getDonationRequestViewModel", "()Lcom/wastemanagement/ui/dashboard/viewmodel/DonationRequestViewModel;", "donationRequestViewModel$delegate", "Lkotlin/Lazy;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "requestList", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result;", "Lkotlin/collections/ArrayList;", "getRequestList", "()Ljava/util/ArrayList;", "setRequestList", "(Ljava/util/ArrayList;)V", "initialize", "", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestUpdate", "id", "", "status", "setAdapterData", "setObserver", "app_debug"})
public final class DashboardFragment extends com.wastemanagement.core.BaseFragment implements com.wastemanagement.ui.dashboard.listner.ClickListener {
    public com.wastemanagement.databinding.FragmentDashboardBinding binding;
    public com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter adapter;
    public android.content.Context mContext;
    private final kotlin.Lazy donationRequestViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> requestList;
    
    public DashboardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.databinding.FragmentDashboardBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.databinding.FragmentDashboardBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    private final com.wastemanagement.ui.dashboard.viewmodel.DonationRequestViewModel getDonationRequestViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> getRequestList() {
        return null;
    }
    
    public final void setRequestList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Method is used to initialize data and views
     */
    private final void initialize() {
    }
    
    /**
     * Set observer
     */
    private final void setObserver() {
    }
    
    /**
     * Method is used to set adapter for request list
     */
    private final void setAdapterData() {
    }
    
    @java.lang.Override()
    public void onRequestUpdate(int id, int status) {
    }
    
    public void onCategoryClick(int position) {
    }
}