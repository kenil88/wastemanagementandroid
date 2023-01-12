package com.wastemanagement.ui.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wastemanagement.data.api.ApiErrorHandler
import com.wastemanagement.data.repository.FunctionalRepository
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.network.Resource
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONException
import javax.inject.Inject


@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val repository: FunctionalRepository,
    private val networkHelper: NetworkHelper,
) : ViewModel() {

    private val _categoryResponse: MutableLiveData<Resource<DonationCategoryModel>> = MutableLiveData()
    val categoryResponse: LiveData<Resource<DonationCategoryModel>> get() = _categoryResponse

    fun categoryList(

    ) = viewModelScope.launch {
        _categoryResponse.value = Resource.loading(null)
        if (networkHelper.isNetworkConnected()) {
            try {
                repository.donationCategory().let {
                    if (it.isSuccessful) {
                        _categoryResponse.postValue(Resource.success(it.body()))
                    } else {
                        try {
                            if (it.raw().code == Constants.InternalServerError) {
                                _categoryResponse.postValue(
                                    Resource.error(
                                        it.raw().message,
                                        it.raw().code,
                                        null
                                    )
                                )
                            } else {
                                val errorResponse = ApiErrorHandler.checkErrorCode(it.errorBody())
                                _categoryResponse.postValue(
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
                            _categoryResponse.postValue(
                                Resource.error(
                                    Constants.MSG_SOMETHING_WENT_WRONG, 0,
                                    null
                                )
                            )
                        }
                    }
                }
            } catch (e: JSONException) {
                _categoryResponse.postValue(
                    Resource.error(
                        Constants.MSG_SOMETHING_WENT_WRONG, 0,
                        null
                    )
                )
            }
        } else _categoryResponse.postValue(
            Resource.noInternet()
        )
    }
}
