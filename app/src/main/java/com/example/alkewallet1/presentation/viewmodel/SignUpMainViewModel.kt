package com.example.alkewallet1.presentation.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alkewallet1.data.response.UserResponse
import com.example.alkewallet1.domain.UserUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class SignUpMainViewModel(private val useCase: UserUseCase): ViewModel() {
    private val newUser = MutableLiveData<Result<Response<UserResponse>>>()
    val newUserLV: LiveData<Result<Response<UserResponse>>> = newUser
    fun createUserOnClick(user: UserResponse){
        viewModelScope .launch {
            try {
                var response = useCase.createUser(user)
                if (response.isSuccessful){
                    newUser.postValue(Result.success(response))
                }else{
                    newUser.postValue(Result.failure(Exception(response.errorBody().toString())))
                }
            }catch (e: Exception){
                newUser.postValue(Result.failure(e))
            }
        }
    }
}