package com.hb.jetgithub.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hb.jetgithub.data.onError
import com.hb.jetgithub.data.onSuccess
import com.hb.jetgithub.domain.usecases.GetListUsersUseCase
import kotlinx.coroutines.launch


class MainActivityViewModel @ViewModelInject constructor(
    private val getListUsersUseCase: GetListUsersUseCase
) : ViewModel() {

    private val _viewState = MutableLiveData<ViewState>()
    val viewState: LiveData<ViewState> = _viewState

    fun getListUsers() {
        viewModelScope.launch {
            getListUsersUseCase().
                onSuccess {
                _viewState.postValue(ViewState.Success(it))
                }.onError {
                _viewState.postValue(ViewState.Error(it))
            }
        }
    }

}