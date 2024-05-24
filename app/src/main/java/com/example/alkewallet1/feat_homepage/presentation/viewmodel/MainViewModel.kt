package com.example.alkewallet1.feat_homepage.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewallet1.feat_homepage.data.model.Transactions

class MainViewModel: ViewModel() {

    private val transactions = MutableLiveData<MutableList<Transactions>>()
    val transactionListLiveData: LiveData<MutableList<Transactions>>
        get() = transactions

    init {
        fetchTransactions()
    }

    private fun fetchTransactions() {
        val dataTransactions = mutableListOf(
            Transactions("UsuA_IMG","Egreso","UsuA",
                "Oct 14 10:24 AM",'-','$',15.00),
            Transactions("UsuB_IMG","Egreso","UsuB",
                "Oct 14 10:24 AM",'-','$',10.00),
            Transactions("UsuA_IMG","Egreso","UsuA",
                "Oct 14 10:24 AM",'-','$',5.00),
            Transactions("UsuA_IMG","Ingreso","UsuA",
                "Oct 14 10:24 AM",'-','$',20.30),
            Transactions("UsuA_IMG","Egreso","UsuB",
                "Oct 14 10:24 AM",'-','$',15.80),
            Transactions("UsuA_IMG","Ingreso","UsuA",
                "Oct 14 10:24 AM",'-','$',35.00),
            Transactions("UsuA_IMG","Egreso","UsuA",
                "Oct 14 10:24 AM",'-','$',1.90),
            Transactions("UsuA_IMG","Ingreso","UsuC",
                "Oct 14 10:24 AM",'-','$',10.00),
            Transactions("UsuA_IMG","Ingreso","UsuD",
                "Oct 14 10:24 AM",'-','$',150.00),
            Transactions("UsuA_IMG","Ingreso","UsuA",
                "Oct 14 10:24 AM",'-','$',75.00),
            )
        transactions.value = dataTransactions
    }

}