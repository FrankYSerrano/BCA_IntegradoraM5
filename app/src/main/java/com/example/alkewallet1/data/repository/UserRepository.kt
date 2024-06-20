package com.example.alkewallet1.data.repository

import com.example.alkewallet1.data.model.User
import com.example.alkewallet1.data.response.LoginRequest
import com.example.alkewallet1.data.response.LoginResponse
import com.example.alkewallet1.data.response.UserResponse
import retrofit2.Response

interface UserRepository {

    suspend fun createUser(users: UserResponse): Response<UserResponse>

    suspend fun loginUser(userRequest: LoginRequest): Response<LoginResponse>

    // Funciones de ROOM
    suspend fun insertUser(user: User)

}