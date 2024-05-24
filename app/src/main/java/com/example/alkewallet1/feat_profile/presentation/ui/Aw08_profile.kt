package com.example.alkewallet1.feat_profile.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
import com.example.alkewallet1.databinding.FragmentAw08ProfileBinding

class aw08_profile : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw08ProfileBinding

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
        binding = FragmentAw08ProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia homepage
         */
        val imageView_back = binding.ImageViewBack
        imageView_back.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }

        /**
         * Navegación hacia Información (Mientras al Splash!)
         */
        val button_information = binding.buttonInformation
        button_information.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Cards (Mientras al Splash!)
         */
        val button_cards = binding.buttonCards
        button_cards.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Opciones (Mientras al Splash!)
         */
        val button_options = binding.buttonOptions
        button_options.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Help (Mientras al Splash!)
         */
        val button_help = binding.buttonHelp
        button_help.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }
    }
}