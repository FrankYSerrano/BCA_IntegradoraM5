package com.example.alkewallet1.domain

class Validator () {

    companion object {
        fun validador(userName: String, password: String): Boolean {
            val authorizedUser: String = "admin"
            val authorizedPassword: String = "admin"


            if (userName == authorizedUser && password == authorizedPassword)
                return true
            else
                return false
        }
    }
}