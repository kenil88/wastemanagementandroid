package com.wastemanagement.data.repository

import com.wastemanagement.data.api.ApiHelper
import okhttp3.MultipartBody
import javax.inject.Inject

class FunctionalRepository @Inject constructor(
    private val apiHelper: ApiHelper
) {
    suspend fun donationCategory(
    ) = apiHelper.donationCategory()

    suspend fun organizationList(
        param: HashMap<String, String>
    ) = apiHelper.organizationList(param)

    suspend fun updateProfile(
        id: Int,
        params: Map<String, String>
    ) = apiHelper.updateProfile(
        id,
        params
    )

    suspend fun deactivateAccount(
        id: Int
    ) = apiHelper.deactivateAccount(id)


    suspend fun addDonationRequest(
        body: MultipartBody
    ) = apiHelper.addDonationRequest(
        body
    )
    suspend fun getDonationRequestList(
        id:Int
    ) = apiHelper.getDonationRequestList(
        id
    )
    suspend fun donationRequestUpdate(
        id:Int,status:Int
    ) = apiHelper.donationRequestUpdate(
        id,status
    )

}
