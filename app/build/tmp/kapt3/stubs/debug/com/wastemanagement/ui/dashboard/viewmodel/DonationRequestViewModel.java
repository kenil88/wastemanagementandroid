package com.wastemanagement.ui.dashboard.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/wastemanagement/ui/dashboard/viewmodel/DonationRequestViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/wastemanagement/data/repository/FunctionalRepository;", "networkHelper", "Lcom/wastemanagement/network/NetworkHelper;", "(Lcom/wastemanagement/data/repository/FunctionalRepository;Lcom/wastemanagement/network/NetworkHelper;)V", "_addRequestResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wastemanagement/network/Resource;", "", "_getDonationRequestResponse", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel;", "_getDonationRequestUpdateResponse", "addRequestResponse", "Landroidx/lifecycle/LiveData;", "getAddRequestResponse", "()Landroidx/lifecycle/LiveData;", "getDonationRequestResponse", "getGetDonationRequestResponse", "getDonationRequestUpdateResponse", "getGetDonationRequestUpdateResponse", "adddDonationRequest", "Lkotlinx/coroutines/Job;", "body", "Lokhttp3/MultipartBody;", "getDonationRequestList", "id", "", "getDonationRequestUpdate", "status", "app_debug"})
public final class DonationRequestViewModel extends androidx.lifecycle.ViewModel {
    private final com.wastemanagement.data.repository.FunctionalRepository repository = null;
    private final com.wastemanagement.network.NetworkHelper networkHelper = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<java.lang.Object>> _addRequestResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel>> _getDonationRequestResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<java.lang.Object>> _getDonationRequestUpdateResponse = null;
    
    @javax.inject.Inject()
    public DonationRequestViewModel(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.data.repository.FunctionalRepository repository, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.network.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<java.lang.Object>> getAddRequestResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job adddDonationRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel>> getGetDonationRequestResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDonationRequestList(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<java.lang.Object>> getGetDonationRequestUpdateResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDonationRequestUpdate(int id, int status) {
        return null;
    }
}