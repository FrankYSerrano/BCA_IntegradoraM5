package com.example.alkewallet1.data.model

data class Transactions(
    val whoTx: String,
    val typeTx: String,
    val nameTx: String,
    val timestamp: String,
    val symbolTx: Char,
    val currencyTx: Char,
    val ammountTx: Double = 0.0
){
}
