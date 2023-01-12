package com.wastemanagement.data.api

import com.wastemanagement.ui.auth.model.LoginResponse
import com.wastemanagement.ui.auth.model.RegisterResponse
import com.wastemanagement.ui.dashboard.acceptor.model.DeactiviateAccountResponseModel
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*


interface ApiService {
    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @FieldMap params:Map<String,String>
    ): Response<LoginResponse>


    @FormUrlEncoded
    @POST("register")
    suspend fun register(
        @FieldMap params:Map<String,String>
    ): Response<RegisterResponse>


    @GET("category-list")
    suspend fun categoryList(): Response<DonationCategoryModel>

    @FormUrlEncoded
    @POST("acceptor-list")
    suspend fun organizationLis(
        @FieldMap params:Map<String,String>
    ): Response<OrganizationListModel>

    @FormUrlEncoded
    @POST("update-profile/{id}")
    suspend fun updateProfile(
       @Path("id") id:Int,
       @FieldMap params:Map<String,String>
    ): Response<LoginResponse>

    @POST("account-deactivate/{id}")
    suspend fun deactivateAccount(
        @Path("id") id:Int
    ): Response<DeactiviateAccountResponseModel>

    @FormUrlEncoded
    @POST("account-deactivate")
    suspend fun forgotPassword(
        @FieldMap params:Map<String,String>
    ): Response<DeactiviateAccountResponseModel>

    @POST("request-store")
    suspend fun addDonationRequest(
        @Body body: MultipartBody
    ): Response<Any>


    @GET("get-donor-request-list/{id}")
    suspend fun getDonationRequestList(
        @Path("id") id:Int
    ): Response<RequestListModel>

    @GET("donor-request/update/{id}/{status}")
    suspend fun updateRequestStatus(
        @Path("id") id:Int,
        @Path("status") status:Int
    ): Response<Any>
}
