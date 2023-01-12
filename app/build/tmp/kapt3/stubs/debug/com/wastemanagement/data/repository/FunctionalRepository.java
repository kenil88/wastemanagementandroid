package com.wastemanagement.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\u0006\u0010\f\u001a\u00020\r2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/wastemanagement/data/repository/FunctionalRepository;", "", "apiHelper", "Lcom/wastemanagement/data/api/ApiHelper;", "(Lcom/wastemanagement/data/api/ApiHelper;)V", "addDonationRequest", "Lretrofit2/Response;", "body", "Lokhttp3/MultipartBody;", "(Lokhttp3/MultipartBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateAccount", "Lcom/wastemanagement/ui/dashboard/acceptor/model/DeactiviateAccountResponseModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "donationCategory", "Lcom/wastemanagement/ui/dashboard/donor/category/model/DonationCategoryModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "donationRequestUpdate", "status", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDonationRequestList", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel;", "organizationList", "Lcom/wastemanagement/ui/dashboard/donor/organization/model/OrganizationListModel;", "param", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/wastemanagement/ui/auth/model/LoginResponse;", "params", "", "(ILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FunctionalRepository {
    private final com.wastemanagement.data.api.ApiHelper apiHelper = null;
    
    @javax.inject.Inject()
    public FunctionalRepository(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.data.api.ApiHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object donationCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object organizationList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProfile(int id, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.auth.model.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deactivateAccount(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addDonationRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDonationRequestList(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object donationRequestUpdate(int id, int status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> continuation) {
        return null;
    }
}