package com.wastemanagement.ui.auth.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("message")
    var message: String = "",
    @SerializedName("result")
    var result: Result = Result(),
    @SerializedName("status")
    var status: Boolean = false
) {
    data class Result(
        @SerializedName("category_id")
        var categoryId: Int = 0,
        @SerializedName("category_name")
        var categoryName: String = "",
        @SerializedName("email")
        var email: String = "",
        @SerializedName("first_name")
        var firstName: String = "",
        @SerializedName("last_name")
        var lastName: String = "",
        @SerializedName("latitude")
        var latitude: String = "",
        @SerializedName("longitude")
        var longitude: String = "",
        @SerializedName("org_contact")
        var orgContact: String = "",
        @SerializedName("org_location")
        var orgLocation: String = "",
        @SerializedName("org_name")
        var orgName: String = "",
        @SerializedName("token")
        var token: String = "",
        @SerializedName("user_id")
        var userId: Int = 0
    )
}