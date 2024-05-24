package com.example.alkewallet1.feat_login.presentation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
import com.example.alkewallet1.databinding.FragmentAw04LoginBinding
import com.example.alkewallet1.feat_login.domain.Validator

class aw04_login : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw04LoginBinding

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
        binding = FragmentAw04LoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup
         */
        val button_signUp = binding.buttonSignup
        button_signUp?.setOnClickListener { // handle your click here
            navController.navigate(R.id.aw03_signup)
        }
            ?: Log.e("LoginFragment", "Button not found in the layout")

        //        button_signUp.setOnClickListener(v->{
//            navController.navigate(R.id.aw03_signup);
//        });
        /**
         * Navegación hacia login
         */
//        TextView textView_login = view.findViewById(R.id.textView_login);
        /**
         * if (textView_login != null) {
         * textView_login.setOnClickListener(new View.OnClickListener() {
         * @Override
         * public void onClick(View v) {
         * // handle your click here
         * navController.navigate(R.id.aw04_login);
         * }
         * });
         * } else {
         * Log.e("LoginFragment", "TextView not found in the layout");
         * }
         */
        /**
         * Navegación hacia homepage
         */
        val button_login = binding.buttonLogin
        button_login.setOnClickListener { v: View? ->
            val verifica: Boolean = Validator.validador(
                binding.textInputEmail.text.toString(),
                binding.textInputPassword.text.toString())
            if (verifica) navController.navigate(R.id.aw05_homepage)
            else Toast.makeText(context, "Datos incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}