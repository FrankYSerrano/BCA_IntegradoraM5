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

class aw06_request : Fragment() {
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
        return inflater.inflate(R.layout.fragment_aw07_send, container, false)
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
         * Navegación hacia homepage
         */
        val button_request = view.findViewById<Button>(R.id.button_request)
        button_request.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage)
        }
    }
}