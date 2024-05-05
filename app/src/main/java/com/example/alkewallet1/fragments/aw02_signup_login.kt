package com.example.alkewallet1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R

class aw02_signup_login : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aw02_signup_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup
         */
        val button_SignUp = view.findViewById<Button>(R.id.button_signup)
        button_SignUp.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw03_signup)
        }

        /**
         * Navegación hacia login
         */
        val button_login = view.findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }
    }
}