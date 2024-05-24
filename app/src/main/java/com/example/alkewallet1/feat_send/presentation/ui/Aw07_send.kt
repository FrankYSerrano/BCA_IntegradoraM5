package com.example.alkewallet1.feat_send.presentation.ui

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
import com.example.alkewallet1.databinding.FragmentAw07SendBinding

class aw07_send : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw07SendBinding

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
        binding = FragmentAw07SendBinding.inflate(inflater, container, false)
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
         * Navegación hacia homepage
         */
        val button_send = binding.buttonSend
        button_send.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }
    }
}