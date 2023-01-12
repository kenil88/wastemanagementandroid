package com.wastemanagement.ui.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wastemanagement.data.api.ApiErrorHandler
import com.wastemanagement.data.repository.FunctionalRepository
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.network.Resource
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import com.wastemanagement.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONException
import javax.inject.Inject


@HiltViewModel
class OrganizationViewModel @Inject constructor(
    private val repository: FunctionalRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {

    private val _organizationResponse: MutableLiveData<Resource<OrganizationListModel>> = MutableLiveData()
    val organizationResponse: LiveData<Resource<OrganizationListModel>> get() = _organizationResponse

    fun organizationList(
        param:HashMap<String,String>
    ) = viewModelScope.launch {
        _organizationResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.organizationList(param).let {
                    if (it.isSuccessful) {
                        _organizationResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _organizationResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _organizationResponse.postValue(
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
                            _organizationResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _organizationResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _organizationResponse.postValue(
            Resource.noInternet()
        )
    }
}
