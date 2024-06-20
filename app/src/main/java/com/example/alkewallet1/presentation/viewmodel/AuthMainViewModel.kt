package com.example.alkewallet1.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alkewallet1.data.model.User
import com.example.alkewallet1.data.response.LoginRequest
import com.example.alkewallet1.data.response.LoginResponse
import com.example.alkewallet1.data.response.UserResponse
import com.example.alkewallet1.domain.UserUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class AuthMainViewModel(private val useCase: UserUseCase): ViewModel() {
//    val userList = MutableLiveData<MutableList<User>>()
//    val userListLiveData: LiveData<out List<User>>
//    get() = userList
//    init {
//        fetchUsers()
//    }

    private val userLogin = MutableLiveData<Result<Response<LoginResponse>>>()

    val loginUserLV: LiveData<Result<Response<LoginResponse>>> = userLogin

    fun loginUserOnClick(userName: String, password: String){
        viewModelScope .launch {
            try {

                var response = useCase.loginUser(LoginRequest(userName, password))
                if (response.isSuccessful){
                    val result = Result.success(response)
                    userLogin.postValue(result)
                }else{
                    userLogin.postValue(Result.failure(Exception(response.errorBody().toString())))
                }
            }catch (e: Exception){
                userLogin.postValue(Result.failure(e))
            }
        }
    }

    fun saveUserInDB(userName: String, password: String, token: String){
        val user = User(username = userName, password = password, token = token)
        viewModelScope.launch {
            useCase.insertUser(user)
        }
    }


//    private fun fetchUsers() {
//        val users = mutableListOf(
//            User("admin", "admin"),
//            User("uno", "uno"),
//            User("dos", "dos")
//        )
//        userList.value = users
//    }
//    fun validateUser(username: String, password: String): Boolean {
////        val users = userList.value
////        if (users != null) {
////            for (user in users) {
////                if (user.username == username && user.password == password) {
////                    return true
////                    }
////            }
////        }
////        return false
//    }

}