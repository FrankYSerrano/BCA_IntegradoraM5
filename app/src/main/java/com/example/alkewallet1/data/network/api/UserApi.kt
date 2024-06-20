package com.example.alkewallet1.data.network.api

import com.example.alkewallet1.data.response.LoginRequest
import com.example.alkewallet1.data.response.LoginResponse
import com.example.alkewallet1.data.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {


    @POST("users")
    suspend fun createUser(@Body user: UserResponse): Response<UserResponse>

    @POST("auth/login")
    suspend fun userlogin(@Body userRequest: LoginRequest): Response<LoginResponse>

}
