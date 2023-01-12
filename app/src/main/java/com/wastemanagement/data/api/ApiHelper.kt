package com.wastemanagement.data.api

import com.wastemanagement.ui.auth.model.LoginResponse
import com.wastemanagement.ui.auth.model.RegisterResponse
import com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import okhttp3.MultipartBody
import retrofit2.Response


interface ApiHelper {

    /**
     * Call login api
     */
    suspend fun login(
        params:Map<String,String>
    ): Response<LoginResponse>

    /**
     * Call register api
     */
    suspend fun register(
    params:Map<String,String>
//        email: String,
//        password: String,
//        first_name: String,
//        last_name: String,
//        org_name: String,
//        org_location: String,
//        org_contact: String,
//        category_id: String
    ): Response<RegisterResponse>


    /**
     * Call donation Category api
     */
    suspend fun donationCategory(): Response<DonationCategoryModel>

    /**
     * Call organization list api
     */
    suspend fun organizationList(
        params:Map<String,String>
    ): Response<OrganizationListModel>

    /**
     * Call get profile api
     */
    suspend fun updateProfile(
        id:Int,
        params:Map<String,String>
    ): Response<LoginResponse>

    /**
     * Call get deactivate account api
     */
    suspend fun deactivateAccount(
        id:Int
    ): Response<DeactiviateAccountResponseModel>

    /**
     * Call forgot password api
     */
    suspend fun forgotPassword(
        params:Map<String,String>
    ): Response<DeactiviateAccountResponseModel>

    /**
     * Call add donation request
     */
    suspend fun addDonationRequest(
        body: MultipartBody
    ): Response<Any>

    /**
     * Call get donation request list
     */
    suspend fun getDonationRequestList(
        id:Int
    ): Response<RequestListModel>

    /**
     * Call get donation request update
     */
    suspend fun donationRequestUpdate(
        id:Int,status:Int
    ): Response<Any>

}
