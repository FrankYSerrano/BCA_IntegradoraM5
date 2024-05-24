package com.example.alkewallet1.feat_login.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewallet1.feat_login.data.model.User

class MainViewModel: ViewModel() {
    val userList = MutableLiveData<List<User>>()

    val userListLiveData: LiveData<out List<User>>
    get() = userList
    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        val users = mutableListOf(
            User("admin", "admin")
        )
        userList.value = users
    }

}