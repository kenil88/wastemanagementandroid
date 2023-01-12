package com.wastemanagement.ui.dashboard.acceptor.model


import com.google.gson.annotations.SerializedName

data class RequestListModel(
    @SerializedName("message")
    var message: String = "",
    @SerializedName("result")
    var result: List<Result> = listOf(),
    @SerializedName("status")
    var status: Boolean = false
) {
    data class Result(
        @SerializedName("request_id")
        var requestId :Int=0,
        @SerializedName("acceptor_id")
        var acceptorId: String = "",
        @SerializedName("description")
        var description: String = "",
        @SerializedName("donor_contact")
        var donorContact: String = "",
        @SerializedName("donor_email")
        var donorEmail: String = "",
        @SerializedName("donor_location")
        var donorLocation: String = "",
        @SerializedName("donor_name")
        var donorName: String = "",
        @SerializedName("is_accepted")
        var isAccepted: String = "",
        @SerializedName("request_image")
        var requestImage: ArrayList<RequestImage> = ArrayList()
    ) {
        data class RequestImage(
            @SerializedName("image_name")
            var imageName: String = "",
            @SerializedName("path")
            var path: String = ""
        )
    }
}