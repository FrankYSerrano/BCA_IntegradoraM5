package com.example.alkewallet1.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.alkewallet1.domain.UserUseCase

class ViewModelFactory (private val useCase: UserUseCase)
    : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return when {
            modelClass.isAssignableFrom(SignUpMainViewModel::class.java) -> {
                SignUpMainViewModel(useCase) as T
            }

            modelClass.isAssignableFrom(AuthMainViewModel::class.java) -> {
                AuthMainViewModel(useCase) as T
            }

            else -> {
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
    }
}