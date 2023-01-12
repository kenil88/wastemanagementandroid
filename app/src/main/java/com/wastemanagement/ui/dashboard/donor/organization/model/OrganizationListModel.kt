package com.wastemanagement.ui.dashboard.donor.organization.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class OrganizationListModel(
    @SerializedName("message")
    var message: String = "",
    @SerializedName("result")
    var result: List<Result> = listOf(),
    @SerializedName("status")
    var status: Boolean = false
) {
    data class Result(
        @SerializedName("category_id")
        var categoryId: String = "",
        @SerializedName("created_at")
        var createdAt: String = "",
        @SerializedName("email")
        var email: String = "",
        @SerializedName("first_name")
        var firstName: String = "",
        @SerializedName("id")
        var id: Int = 0,
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
        @SerializedName("role")
        var role: String = "",
        @SerializedName("status")
        var status: String = "",
        @SerializedName("updated_at")
        var updatedAt: String = ""
    )
}