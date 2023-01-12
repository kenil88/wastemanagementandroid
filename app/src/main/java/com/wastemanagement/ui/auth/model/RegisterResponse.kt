package com.wastemanagement.ui.auth.model


import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("message")
    var message: String = "",
    @SerializedName("result")
    var result: String = "",
    @SerializedName("status")
    var status: Boolean = false
)