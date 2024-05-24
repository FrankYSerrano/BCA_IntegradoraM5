package com.example.alkewallet1.feat_signup.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
import com.example.alkewallet1.databinding.FragmentAw02SignupLoginBinding
import com.example.alkewallet1.databinding.FragmentAw03SignupBinding

class aw03_signup : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw03SignupBinding

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
        binding = FragmentAw03SignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup
         */
        val button_SignUp = binding.buttonSignup
        button_SignUp.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }

        /**
         * Navegación hacia login
         */
        val button_login = binding.buttonLogin
        button_login.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }
    }
}