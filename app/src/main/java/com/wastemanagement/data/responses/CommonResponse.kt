package com.wastemanagement.data.responses

import com.google.gson.annotations.SerializedName

open class CommonResponse(
    @field:SerializedName("status")
    open val status: Boolean = false,
    @field:SerializedName("message")
    open val message: String = "",
    @field:SerializedName("code")
    open val code: Int
)

