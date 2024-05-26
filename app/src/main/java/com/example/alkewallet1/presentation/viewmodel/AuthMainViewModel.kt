package com.example.alkewallet1.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewallet1.data.model.User

class AuthMainViewModel: ViewModel() {
    val userList = MutableLiveData<MutableList<User>>()

    val userListLiveData: LiveData<out List<User>>
    get() = userList
    init {
        fetchUsers()
    }
    private fun fetchUsers() {
        val users = mutableListOf(
            User("admin", "admin"),
            User("uno", "uno"),
            User("dos", "dos")
        )
        userList.value = users
    }
    fun validateUser(username: String, password: String): Boolean {
        val users = userList.value
        if (users != null) {
            for (user in users) {
                if (user.username == username && user.password == password) {
                    return true
                    }
            }
        }
        return false
    }

}