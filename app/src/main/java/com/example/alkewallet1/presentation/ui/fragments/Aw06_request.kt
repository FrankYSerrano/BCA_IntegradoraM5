package com.example.alkewallet1.presentation.ui.fragments

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
import com.example.alkewallet1.databinding.FragmentAw06RequestBinding

class aw06_request : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw06RequestBinding

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
        binding = FragmentAw06RequestBinding.inflate(inflater, container, false)
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
        val button_request = binding.buttonRequest
        button_request.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }
    }
}