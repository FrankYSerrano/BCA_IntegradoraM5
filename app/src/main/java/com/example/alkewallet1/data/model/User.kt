package com.example.alkewallet1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val username: String,
    val password: String,
    val token: String
){
}
