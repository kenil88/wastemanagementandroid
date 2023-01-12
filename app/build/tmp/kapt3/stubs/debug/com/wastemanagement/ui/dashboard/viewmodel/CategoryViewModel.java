package com.wastemanagement.ui.dashboard.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/wastemanagement/ui/dashboard/viewmodel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/wastemanagement/data/repository/FunctionalRepository;", "networkHelper", "Lcom/wastemanagement/network/NetworkHelper;", "(Lcom/wastemanagement/data/repository/FunctionalRepository;Lcom/wastemanagement/network/NetworkHelper;)V", "_categoryResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wastemanagement/network/Resource;", "Lcom/wastemanagement/ui/dashboard/donor/category/model/DonationCategoryModel;", "categoryResponse", "Landroidx/lifecycle/LiveData;", "getCategoryResponse", "()Landroidx/lifecycle/LiveData;", "categoryList", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.wastemanagement.data.repository.FunctionalRepository repository = null;
    private final com.wastemanagement.network.NetworkHelper networkHelper = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel>> _categoryResponse = null;
    
    @javax.inject.Inject()
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.data.repository.FunctionalRepository repository, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.network.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel>> getCategoryResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job categoryList() {
        return null;
    }
}