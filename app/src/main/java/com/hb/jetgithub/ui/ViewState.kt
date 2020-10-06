package com.hb.jetgithub.ui

sealed class ViewState {
  data class Success<T>(val data: T? = null) : ViewState()
  data class Error(val error: String? = null) : ViewState()
}
