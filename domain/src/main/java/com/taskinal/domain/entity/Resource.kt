package com.taskinal.domain.entity

/**
 * @project CleanLottery
 * @author alitaskin on 13.08.2021
 */

data class Resource<out T>(val status: Status,
                           val data: T?,
                           val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING,
    }

    companion object {
        fun <T> success(data: T): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(message: String, data: T? = null): Resource<T> {
            return Resource(Status.ERROR, data, message)
        }

        fun <T> loading(data: T? = null): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }
}