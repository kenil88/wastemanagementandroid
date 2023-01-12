package com.wastemanagement.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/wastemanagement/data/api/ApiHelper;", "", "addDonationRequest", "Lretrofit2/Response;", "body", "Lokhttp3/MultipartBody;", "(Lokhttp3/MultipartBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateAccount", "Lcom/wastemanagement/ui/dashboard/acceptor/model/DeactiviateAccountResponseModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "donationCategory", "Lcom/wastemanagement/ui/dashboard/donor/category/model/DonationCategoryModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "donationRequestUpdate", "status", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgotPassword", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDonationRequestList", "Lcom/wastemanagement/ui/dashboard/acceptor/model/RequestListModel;", "login", "Lcom/wastemanagement/ui/auth/model/LoginResponse;", "organizationList", "Lcom/wastemanagement/ui/dashboard/donor/organization/model/OrganizationListModel;", "register", "Lcom/wastemanagement/ui/auth/model/RegisterResponse;", "updateProfile", "(ILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiHelper {
    
    /**
     * Call login api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.auth.model.LoginResponse>> continuation);
    
    /**
     * Call register api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.auth.model.RegisterResponse>> continuation);
    
    /**
     * Call donation Category api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object donationCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel>> continuation);
    
    /**
     * Call organization list api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object organizationList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel>> continuation);
    
    /**
     * Call get profile api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfile(int id, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.auth.model.LoginResponse>> continuation);
    
    /**
     * Call get deactivate account api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateAccount(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel>> continuation);
    
    /**
     * Call forgot password api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object forgotPassword(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel>> continuation);
    
    /**
     * Call add donation request
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addDonationRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> continuation);
    
    /**
     * Call get donation request list
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDonationRequestList(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel>> continuation);
    
    /**
     * Call get donation request update
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object donationRequestUpdate(int id, int status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> continuation);
}