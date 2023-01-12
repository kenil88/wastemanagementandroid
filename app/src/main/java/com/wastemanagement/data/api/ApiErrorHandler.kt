package com.wastemanagement.data.api

import com.wastemanagement.data.responses.CommonResponse
import com.wastemanagement.utils.Logger
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.ResponseBody

object ApiErrorHandler {

    /**
     * Handle api errors
     */

    fun checkErrorCode(
        response: ResponseBody?
    ): CommonResponse? {
        val type = object : TypeToken<CommonResponse>() {}.type
        val objResponse: CommonResponse? =
            Gson().fromJson(response!!.charStream(), type)
        Logger.e("SSS error ", objResponse?.message.toString())
        return objResponse
    }
}
