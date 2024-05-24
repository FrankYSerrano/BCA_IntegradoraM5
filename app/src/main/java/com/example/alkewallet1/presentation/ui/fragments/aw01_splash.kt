package com.example.alkewallet1.presentation.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.ActivityMainBinding
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
//import com.example.alkewallet1.databinding.FragmentBlankBinding

class aw01_splash : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw01SplashBinding

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
        binding = FragmentAw01SplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Splash Screen se mantiene por N segundos
         */
        val SPLASH_TIME_OUT: Long = 2500
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.aw02_signup_login)
        }, SPLASH_TIME_OUT)
    }
}