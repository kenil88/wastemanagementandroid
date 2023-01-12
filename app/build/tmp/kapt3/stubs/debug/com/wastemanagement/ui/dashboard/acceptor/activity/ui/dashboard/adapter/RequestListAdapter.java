package com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter;

import java.lang.System;

/**
 * Adapter class is used to display recent chat list
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "requestList", "Ljava/util/ArrayList;", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel$Result;", "Lkotlin/collections/ArrayList;", "listeners", "Lcom/wastemanagement/ui/dashboard/listner/ClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/wastemanagement/ui/dashboard/listner/ClickListener;)V", "getListeners", "()Lcom/wastemanagement/ui/dashboard/listner/ClickListener;", "setListeners", "(Lcom/wastemanagement/ui/dashboard/listner/ClickListener;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getRequestList", "()Ljava/util/ArrayList;", "setRequestList", "(Ljava/util/ArrayList;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RequestListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> requestList;
    @org.jetbrains.annotations.NotNull()
    private com.wastemanagement.ui.dashboard.listner.ClickListener listeners;
    
    public RequestListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> requestList, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.listner.ClickListener listeners) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> getRequestList() {
        return null;
    }
    
    public final void setRequestList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel.Result> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wastemanagement.ui.dashboard.listner.ClickListener getListeners() {
        return null;
    }
    
    public final void setListeners(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.listner.ClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter.ViewHolder holder, int position) {
    }
    
    /**
     * class used to bind layout
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/wastemanagement/databinding/ItemRequestListBinding;", "(Lcom/wastemanagement/ui/dashboard/acceptor/activity/ui/dashboard/adapter/RequestListAdapter;Lcom/wastemanagement/databinding/ItemRequestListBinding;)V", "getItemBinding", "()Lcom/wastemanagement/databinding/ItemRequestListBinding;", "setItemBinding", "(Lcom/wastemanagement/databinding/ItemRequestListBinding;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.wastemanagement.databinding.ItemRequestListBinding itemBinding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.wastemanagement.databinding.ItemRequestListBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.wastemanagement.databinding.ItemRequestListBinding getItemBinding() {
            return null;
        }
        
        public final void setItemBinding(@org.jetbrains.annotations.Nullable()
        com.wastemanagement.databinding.ItemRequestListBinding p0) {
        }
    }
}