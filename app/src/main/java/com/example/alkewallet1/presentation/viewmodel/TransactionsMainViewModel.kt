package com.example.alkewallet1.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewallet1.R
import com.example.alkewallet1.data.model.Transactions

class TransactionsMainViewModel: ViewModel() {

    private val transactions = MutableLiveData<MutableList<Transactions>>()
    val transactionListLiveData: LiveData<MutableList<Transactions>>
        get() = transactions

    init {
        fetchTransactions()
    }

    private fun fetchTransactions() {
        val dataTransactions = mutableListOf(
            Transactions(
                R.mipmap.usu1,R.drawable.send_icon,"UsuA",
                "Oct 14 10:24 AM",'-','$',15.00),
            Transactions(
                R.mipmap.usu1,R.drawable.request_icon,"UsuB",
                "Oct 14 10:24 AM",'-','$',20.00),
            Transactions(
                R.mipmap.usu1,R.drawable.send_icon,"UsuC",
                "Oct 14 10:24 AM",'-','$',30.00),
            Transactions(
                R.mipmap.usu1,R.drawable.request_icon,"UsuD",
                "Oct 14 10:24 AM",'-','$',35.00),
            )
        transactions.value = dataTransactions
    }

}