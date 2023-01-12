package com.wastemanagement.ui.auth.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001a\u0010\u001d\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/wastemanagement/ui/auth/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/wastemanagement/data/repository/AuthRepository;", "networkHelper", "Lcom/wastemanagement/network/NetworkHelper;", "(Lcom/wastemanagement/data/repository/AuthRepository;Lcom/wastemanagement/network/NetworkHelper;)V", "_forgotPasswordResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wastemanagement/network/Resource;", "Lcom/wastemanagement/ui/dashboard/acceptor/model/DeactiviateAccountResponseModel;", "_loginResponse", "Lcom/wastemanagement/ui/auth/model/LoginResponse;", "_registerResponse", "Lcom/wastemanagement/ui/auth/model/RegisterResponse;", "forgotPasswordResponse", "Landroidx/lifecycle/LiveData;", "getForgotPasswordResponse", "()Landroidx/lifecycle/LiveData;", "loginResponse", "getLoginResponse", "registerResponse", "getRegisterResponse", "forgotPassword", "Lkotlinx/coroutines/Job;", "params", "", "", "login", "register", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.wastemanagement.data.repository.AuthRepository repository = null;
    private final com.wastemanagement.network.NetworkHelper networkHelper = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.auth.model.LoginResponse>> _loginResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.auth.model.RegisterResponse>> _registerResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel>> _forgotPasswordResponse = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.data.repository.AuthRepository repository, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.network.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.auth.model.LoginResponse>> getLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job login(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.auth.model.RegisterResponse>> getRegisterResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job register(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wastemanagement.network.Resource<com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel>> getForgotPasswordResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job forgotPassword(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
}