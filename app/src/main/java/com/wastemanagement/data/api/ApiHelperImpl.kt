package com.wastemanagement.data.api

import com.wastemanagement.ui.auth.model.LoginResponse
import com.wastemanagement.ui.auth.model.RegisterResponse
import com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.FieldMap
import retrofit2.http.Multipart
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun login(
        params:Map<String,String>
    ): Response<LoginResponse> = apiService.login(
       params
    )


    override suspend fun register(
        params:Map<String,String>
    ): Response<RegisterResponse> = apiService.register(
        params
    )

    override suspend fun donationCategory(): Response<DonationCategoryModel> = apiService.categoryList()
    override suspend fun organizationList(params: Map<String, String>): Response<OrganizationListModel> =
        apiService.organizationLis(params)

    override suspend fun updateProfile(id:Int,params: Map<String, String>): Response<LoginResponse>
    = apiService.updateProfile(id,params)

    override suspend fun deactivateAccount(id: Int): Response<DeactiviateAccountResponseModel>
    = apiService.deactivateAccount(id)

    override suspend fun forgotPassword(params: Map<String, String>): Response<DeactiviateAccountResponseModel>
    = apiService.forgotPassword(params)

    override suspend fun addDonationRequest(body: MultipartBody): Response<Any>
            = apiService.addDonationRequest(body)

    override suspend fun getDonationRequestList(id: Int): Response<RequestListModel>
            = apiService.getDonationRequestList(id)

    override suspend fun donationRequestUpdate(id: Int, status: Int): Response<Any>
            = apiService.updateRequestStatus(id,status)

}
