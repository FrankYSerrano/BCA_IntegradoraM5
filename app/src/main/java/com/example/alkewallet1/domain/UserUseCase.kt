package com.example.alkewallet1.domain

import com.example.alkewallet1.data.model.User
import com.example.alkewallet1.data.repository.UserRepository
import com.example.alkewallet1.data.response.LoginRequest
import com.example.alkewallet1.data.response.LoginResponse
import com.example.alkewallet1.data.response.UserResponse
import retrofit2.Response

class UserUseCase(private val userRepository: UserRepository) {
    suspend fun createUser(user: UserResponse): Response<UserResponse>{
        return userRepository.createUser(user)
    }
    suspend fun loginUser(userRequest: LoginRequest): Response<LoginResponse>{
        return userRepository.loginUser(userRequest)
    }

    suspend fun insertUser(user: User){
        return userRepository.insertUser(user)
    }
}