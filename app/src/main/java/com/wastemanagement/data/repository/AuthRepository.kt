package com.wastemanagement.data.repository

import com.wastemanagement.data.api.ApiHelper
import retrofit2.http.FieldMap
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val apiHelper: ApiHelper
) {
    suspend fun login(
        params:Map<String,String>
    ) = apiHelper.login(
       params
    )

    suspend fun register(
        params:Map<String,String>
    ) = apiHelper.register(
       params
    )

    suspend fun forgotPassword(param:Map<String,String>
    ) = apiHelper.forgotPassword(param)



}
