package com.example.alkewallet1.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R

class aw04_login : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_aw04_login, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup
         */
        val button_signUp = view.findViewById<Button>(R.id.button_signup)

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
        val button_login = view.findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }

        /**
         * Navegación hacia signup
         */
        val button_signup = view.findViewById<Button>(R.id.button_signup)
        button_signup.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw03_signup)
        }
    }
}