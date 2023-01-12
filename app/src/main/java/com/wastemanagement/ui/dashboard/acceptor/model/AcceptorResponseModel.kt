package com.wastemanagement.ui.dashboard.acceptor.model


import com.google.gson.annotations.SerializedName

data class DeactiviateAccountResponseModel(
    @SerializedName("message")
    var message: String = "",
    @SerializedName("status")
    var status: Boolean = false
)