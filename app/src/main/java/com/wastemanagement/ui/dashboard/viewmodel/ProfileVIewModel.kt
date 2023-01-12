package com.wastemanagement.ui.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wastemanagement.data.api.ApiErrorHandler
import com.wastemanagement.data.repository.FunctionalRepository
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.network.Resource
import com.wastemanagement.ui.auth.model.LoginResponse
import com.wastemanagement.ui.auth.model.RegisterResponse
import com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel
import com.wastemanagement.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONException
import javax.inject.Inject


@HiltViewModel
class ProfileVIewModel @Inject constructor(
    private val repository: FunctionalRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {


    private val _registerResponse: MutableLiveData<Resource<RegisterResponse>> = MutableLiveData()
    val registerResponse: LiveData<Resource<RegisterResponse>> get() = _registerResponse

    private val _profileResponse: MutableLiveData<Resource<LoginResponse>> = MutableLiveData()
    val profileResponse: LiveData<Resource<LoginResponse>> get() = _profileResponse

    private val _deactiviateAccountResponse: MutableLiveData<Resource<DeactiviateAccountResponseModel>> =
        MutableLiveData()
    val deactiviateAccountResponse: LiveData<Resource<DeactiviateAccountResponseModel>> get()
    = _deactiviateAccountResponse


    fun updateProfile(
        id: Int,
        params: Map<String, String>
    ) = viewModelScope.launch {
        _profileResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.updateProfile(id, params).let {
                    if (it.isSuccessful) {
                        _profileResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _profileResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _profileResponse.postValue(
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
                            _profileResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _profileResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _profileResponse.postValue(
            Resource.noInternet()
        )
    }

    fun deactivateAccount(
        id: Int
    ) = viewModelScope.launch {
        _deactiviateAccountResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.deactivateAccount(id).let {
                    if (it.isSuccessful) {
                        _deactiviateAccountResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _deactiviateAccountResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _deactiviateAccountResponse.postValue(
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
                            _deactiviateAccountResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _deactiviateAccountResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _deactiviateAccountResponse.postValue(
            Resource.noInternet()
        )
    }


}
