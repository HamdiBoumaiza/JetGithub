package com.hb.jetgithub.data

sealed class AppResult<out T> {
    data class Success<out T>(val data: T) : AppResult<T>()
    data class Error<T>(val exception: String) : AppResult<T>()
}

inline fun <T : Any> AppResult<T>.onSuccess(action: (T) -> Unit): AppResult<T> {
    if (this is AppResult.Success) action(data)
    return this
}

inline fun <T : Any> AppResult<T>.onError(action: (String) -> Unit): AppResult<T> {
    if (this is AppResult.Error) action(exception)
    return this
}