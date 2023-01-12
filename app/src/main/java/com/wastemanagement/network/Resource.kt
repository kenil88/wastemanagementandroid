package com.wastemanagement.network

data class Resource<out T>(val status: Status, val data: T?, val message: String?, val code: Int?) {

    companion object {

        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null, null)
        }

        fun <T> error(msg: String, code: Int, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg, code)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null, null)
        }

        fun <T> noInternet(): Resource<T> {
            return Resource(Status.NO_INTERNET, null, null, null)
        }

        fun <T> reset(msg: String): Resource<T> {
            return Resource(Status.RESET, null, msg, null)
        }
    }
}