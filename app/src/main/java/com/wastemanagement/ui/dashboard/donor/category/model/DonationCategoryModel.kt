package com.wastemanagement.ui.dashboard.donor.category.model

import java.io.Serializable
import com.google.gson.annotations.SerializedName


data class DonationCategoryModel(
    @SerializedName("data")
    var `data`: ArrayList<Data> = ArrayList(),
    @SerializedName("message")
    var message: String = "",
    @SerializedName("status")
    var status: Boolean = false
) {
    data class Data(
        @SerializedName("added_by")
        var addedBy: Any = Any(),
        @SerializedName("created_at")
        var createdAt: String = "",
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("slug")
        var slug: String = "",
        @SerializedName("status")
        var status: String = "",
        @SerializedName("title")
        var title: String = "",
        @SerializedName("updated_at")
        var updatedAt: String = ""
    )
    {
        override fun toString(): String {
            return title
        }
    }
}

