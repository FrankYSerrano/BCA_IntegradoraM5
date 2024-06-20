package com.example.alkewallet1.data.repository

import com.example.alkewallet1.data.local.dao.UserDAO
import com.example.alkewallet1.data.model.User
import com.example.alkewallet1.data.network.api.UserApi
import com.example.alkewallet1.data.response.LoginRequest
import com.example.alkewallet1.data.response.LoginResponse
import com.example.alkewallet1.data.response.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UserRepositoryImplementation(private val usersApi: UserApi,
                                   private val userDao: UserDAO): UserRepository {
    override suspend fun createUser(users: UserResponse): Response<UserResponse> {
        return withContext(Dispatchers.IO){
            usersApi.createUser(users)
        }
    }

    override suspend fun loginUser(userRequest: LoginRequest): Response<LoginResponse> {
        return withContext(Dispatchers.IO){
            usersApi.userlogin(userRequest)
        }
    }

    override suspend fun insertUser(user: User) {
        return withContext(Dispatchers.IO){
            userDao.insertUser(user)
        }

    }
}