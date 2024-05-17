package com.example.alkewallet1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.ActivityMainBinding

class aw01_splash : Fragment() {

    //Esto lo añadi
    private lateinit var binding: ActivityMainBinding

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
        return inflater.inflate(R.layout.fragment_aw01_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)


        /**
         * Al hacer click en el Logo el splash te lleva a siguiente pantalla
         * Mientras veo como hacerlo a través de un delay de N segundos
         */

        //Esto lo añadi
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        val imageView_logo = view.findViewById<ImageView>(R.id.ImageView_id_logo)
        imageView_logo.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw02_signup_login)
        }
    }
}