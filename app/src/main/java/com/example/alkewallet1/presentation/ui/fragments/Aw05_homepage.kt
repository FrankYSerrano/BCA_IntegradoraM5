package com.example.alkewallet1.presentation.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
import com.example.alkewallet1.databinding.FragmentAw04LoginBinding
import com.example.alkewallet1.databinding.FragmentAw05HomepageBinding

class aw05_homepage : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw05HomepageBinding

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
        binding = FragmentAw05HomepageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        /**
         * Navegación hacia signup_login
         */
        val textView_start = binding.textViewStart
        textView_start.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }

        /**
         * Navegación hacia profile
         */
        val imageView_profile = binding.imageViewProfile
        imageView_profile.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw08_profile)
        }

        /**
         * Navegación hacia request
         */
        val button_request = binding.buttonRequest
        button_request.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw06_request)
        }

        /**
         * Navegación hacia send
         */
        val button_send = binding.buttonSend
        button_send.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw07_send)
        }

        /**
         * Limpiar Transacciones
         */
        val button_limpia = binding.ImageViewNotifications
        button_limpia.setOnClickListener { v: View? ->
            if(binding.txNotEmpty.visibility == View.VISIBLE){
//                Log.i("FRANK1", binding.txNotEmpty.visibility.toString())
//                TO DO: Esto debería de borrar la data
                binding.txNotEmpty.visibility = View.GONE
                binding.txEmpty.visibility = View.VISIBLE
            } else {
//                Log.i("FRANK2", binding.txNotEmpty.visibility.toString())
                binding.txNotEmpty.visibility = View.VISIBLE
                binding.txEmpty.visibility = View.GONE
            }
        }

    }
}