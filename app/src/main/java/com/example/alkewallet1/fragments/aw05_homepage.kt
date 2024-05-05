package com.example.alkewallet1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R

class aw05_homepage : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    private val supportFragmentManager: FragmentManager?
        get() = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aw05_homepage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup_login
         */
        val textView_start = view.findViewById<TextView>(R.id.textView_start)
        textView_start.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }

        /**
         * Navegación hacia profile
         */
        val imageView_profile = view.findViewById<ImageView>(R.id.imageView_profile)
        imageView_profile.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw08_profile)
        }

        /**
         * Navegación hacia request
         */
        val button_request = view.findViewById<Button>(R.id.button_request)
        button_request.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw06_request)
        }

        /**
         * Navegación hacia send
         */
        val button_send = view.findViewById<Button>(R.id.button_send)
        button_send.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw07_send)
        }

        /**
         * Navegación hacia send
         */
        val button_limpia = view.findViewById<Button>(R.id.button_limpia)
        button_limpia.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw05_homepage_vacio)
        }
    }
}