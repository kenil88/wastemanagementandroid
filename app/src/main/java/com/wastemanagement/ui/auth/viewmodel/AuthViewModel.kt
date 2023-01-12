package com.wastemanagement.ui.auth.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wastemanagement.data.api.ApiErrorHandler
import com.wastemanagement.data.repository.AuthRepository
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.network.Resource
import com.wastemanagement.ui.auth.model.LoginResponse
import com.wastemanagement.ui.auth.model.RegisterResponse
import com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel
import com.wastemanagement.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONException
import retrofit2.http.FieldMap
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {

    private val _loginResponse: MutableLiveData<Resource<LoginResponse>> = MutableLiveData()
    val loginResponse: LiveData<Resource<LoginResponse>> get() = _loginResponse

    fun login(
        params:Map<String,String>
    ) = viewModelScope.launch {
        _loginResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.login(params).let {
                    if (it.isSuccessful) {
                        _loginResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _loginResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _loginResponse.postValue(
                                    errorResponse.let { it1 ->
                                        Resource.error(
                                            it1!!.message,
                                            it1.code,
                                            null
                                        )
                                    }
                                )
                            }
                        } catch (e: JSONException) {
                            _loginResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _loginResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _loginResponse.postValue(
            Resource.noInternet()
        )
    }


    private val _registerResponse: MutableLiveData<Resource<RegisterResponse>> = MutableLiveData()
    val registerResponse: LiveData<Resource<RegisterResponse>> get() = _registerResponse

    fun register(
        params:Map<String,String>
    ) = viewModelScope.launch {
        _loginResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.register(params).let {
                    if (it.isSuccessful) {
                        _registerResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _registerResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _registerResponse.postValue(
                                    errorResponse.let { it1 ->
                                        Resource.error(
                                            it1!!.message,
                                            it1.code,
                                            null
                                        )
                                    }
                                )
                            }
                        } catch (e: JSONException) {
                            _registerResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _registerResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _registerResponse.postValue(
            Resource.noInternet()
        )
    }


    private val _forgotPasswordResponse: MutableLiveData<Resource<DeactiviateAccountResponseModel>> = MutableLiveData()
    val forgotPasswordResponse: LiveData<Resource<DeactiviateAccountResponseModel>> get() = _forgotPasswordResponse

    fun forgotPassword(
        params:Map<String,String>
    ) = viewModelScope.launch {
        _forgotPasswordResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.forgotPassword(params).let {
                    if (it.isSuccessful) {
                        _forgotPasswordResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _forgotPasswordResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _forgotPasswordResponse.postValue(
                                    errorResponse.let { it1 ->
                                        Resource.error(
                                            it1!!.message,
                                            it1.code,
                                            null
                                        )
                                    }
                                )
                            }
                        } catch (e: JSONException) {
                            _forgotPasswordResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _forgotPasswordResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _forgotPasswordResponse.postValue(
            Resource.noInternet()
        )
    }



}
