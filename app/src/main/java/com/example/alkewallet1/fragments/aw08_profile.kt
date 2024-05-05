package com.example.alkewallet1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R

class aw08_profile : Fragment() {
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
        return inflater.inflate(R.layout.fragment_aw08_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia homepage
         */
        val imageView_back = view.findViewById<ImageView>(R.id.ImageView_back)
        imageView_back.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }

        /**
         * Navegación hacia Información (Mientras al Splash!)
         */
        val button_information = view.findViewById<Button>(R.id.button_information)
        button_information.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Cards (Mientras al Splash!)
         */
        val button_cards = view.findViewById<Button>(R.id.button_cards)
        button_cards.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Opciones (Mientras al Splash!)
         */
        val button_options = view.findViewById<Button>(R.id.button_options)
        button_options.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }

        /**
         * Navegación hacia Help (Mientras al Splash!)
         */
        val button_help = view.findViewById<Button>(R.id.button_help)
        button_help.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw01_splash)
        }
    }
}