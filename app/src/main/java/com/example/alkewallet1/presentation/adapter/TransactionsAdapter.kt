package com.example.alkewallet1.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alkewallet1.R
import com.example.alkewallet1.data.model.Transactions

class TransactionsAdapter() : RecyclerView.Adapter<TransactionsAdapter.TransactionViewHolder>() {

    /**
     * transactions: Variable que almacenará la lista de transacciones
     */
    var transactions = mutableListOf<Transactions>()
        @SuppressLint("NotifyDataSetChanged")
        set(value){
            field = value
            this.notifyDataSetChanged()
        }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): TransactionViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_aw09_transactions, parent, false)
            return TransactionViewHolder(view)
        }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction: Transactions = transactions[position]
        holder.userPhoto.setImageResource(transaction.whoTx)
        holder.txType.setImageResource(transaction.typeTx)
        holder.nombre.text = transaction.nameTx
        holder.fecha.text = transaction.timestamp
        holder.symbol.text = transaction.symbolTx.toString()
        holder.currency.text = transaction.currencyTx.toString()
        holder.monto.text = transaction.ammountTx.toString()
    }
    override fun getItemCount(): Int {
        return transactions.size
    }

    inner class TransactionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userPhoto: ImageView = view.findViewById(R.id.iv_foto)
        val txType: ImageView = view.findViewById(R.id.iv_type)
        val nombre: TextView = view.findViewById(R.id.tx_user)
        val fecha: TextView = view.findViewById(R.id.tx_timestamp)
        val symbol: TextView = view.findViewById(R.id.tx_symbol)
        val currency: TextView = view.findViewById(R.id.tx_currency)
        val monto: TextView = view.findViewById(R.id.tx_ammount)
    }
}

