package com.hb.jetgithub.ui

sealed class MainActivityViewState {
  data class Success<T>(val data: T? = null) : MainActivityViewState()
  data class Error(val error: String? = null) : MainActivityViewState()
}
