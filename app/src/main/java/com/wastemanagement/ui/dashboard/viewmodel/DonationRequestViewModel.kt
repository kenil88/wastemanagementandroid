package com.wastemanagement.ui.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wastemanagement.data.api.ApiErrorHandler
import com.wastemanagement.data.repository.FunctionalRepository
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.network.Resource
import com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import org.json.JSONException
import javax.inject.Inject


@HiltViewModel
class DonationRequestViewModel @Inject constructor(
    private val repository: FunctionalRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {

    private val _addRequestResponse: MutableLiveData<Resource<Any>> = MutableLiveData()
    val addRequestResponse: LiveData<Resource<Any>> get() = _addRequestResponse

    fun adddDonationRequest(
        body: MultipartBody
    ) = viewModelScope.launch {
        _addRequestResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.addDonationRequest(body).let {
                    if (it.isSuccessful) {
                        _addRequestResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _addRequestResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _addRequestResponse.postValue(
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
                            _addRequestResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _addRequestResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _addRequestResponse.postValue(
            Resource.noInternet()
        )
    }


    private val _getDonationRequestResponse: MutableLiveData<Resource<RequestListModel>> = MutableLiveData()
    val getDonationRequestResponse: LiveData<Resource<RequestListModel>> get() = _getDonationRequestResponse

    fun getDonationRequestList(
        id:Int
    ) = viewModelScope.launch {
        _getDonationRequestResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.getDonationRequestList(id).let {
                    if (it.isSuccessful) {
                        _getDonationRequestResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _getDonationRequestResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _getDonationRequestResponse.postValue(
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
                            _getDonationRequestResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _getDonationRequestResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _getDonationRequestResponse.postValue(
            Resource.noInternet()
        )
    }



    private val _getDonationRequestUpdateResponse: MutableLiveData<Resource<Any>> = MutableLiveData()
    val getDonationRequestUpdateResponse: LiveData<Resource<Any>> get() = _getDonationRequestUpdateResponse

    fun getDonationRequestUpdate(
        id:Int,status:Int
    ) = viewModelScope.launch {
        _getDonationRequestUpdateResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.donationRequestUpdate(id,status).let {
                    if (it.isSuccessful) {
                        _getDonationRequestUpdateResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _getDonationRequestUpdateResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _getDonationRequestUpdateResponse.postValue(
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
                            _getDonationRequestUpdateResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _getDonationRequestUpdateResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _getDonationRequestUpdateResponse.postValue(
            Resource.noInternet()
        )
    }



}
