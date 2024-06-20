package com.example.alkewallet1.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.data.local.database.AppDatabase
import com.example.alkewallet1.data.network.api.UserApi
import com.example.alkewallet1.data.network.retrofit.RetrofitHelper
import com.example.alkewallet1.data.repository.UserRepository
import com.example.alkewallet1.data.repository.UserRepositoryImplementation
import com.example.alkewallet1.data.response.UserResponse
import com.example.alkewallet1.databinding.FragmentAw01SplashBinding
import com.example.alkewallet1.databinding.FragmentAw02SignupLoginBinding
import com.example.alkewallet1.databinding.FragmentAw03SignupBinding
import com.example.alkewallet1.domain.UserUseCase
import com.example.alkewallet1.presentation.viewmodel.SignUpMainViewModel
import com.example.alkewallet1.presentation.viewmodel.ViewModelFactory

class aw03_signup : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw03SignupBinding
    private lateinit var viewModel: SignUpMainViewModel


    private fun init() {
        val apiService = RetrofitHelper.getRetrofit().create(UserApi::class.java)
        val application = requireActivity().application
        val dataBase = AppDatabase.getDatabase(application)
        val repository = UserRepositoryImplementation(apiService, dataBase.userDao())
        val useCase = UserUseCase(repository)
        val viewModelFactory = ViewModelFactory(useCase)
        viewModel = ViewModelProvider(this, viewModelFactory).get(SignUpMainViewModel::class.java)
    }


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
        binding = FragmentAw03SignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        init()

        /**
         * Navegación hacia signup
         */
        val button_SignUp = binding.buttonSignup
        button_SignUp.setOnClickListener { v: View? ->

            val firstName = binding.TVUserName.text.toString()
            val lastName = binding.TVUserLastName.text.toString()
            val email = binding.TVUserEmail.text.toString()
            val password = binding.TVUserPassword.text.toString()

            val newUser = UserResponse(0, firstName, lastName, email, password,
                null, 1 , null, null)

            viewModel.createUserOnClick(newUser)

            viewModel.newUserLV.observe(viewLifecycleOwner) { results ->
                results.onSuccess {
                    navController.navigate(R.id.aw04_login)
                }
                results.onFailure {
                    // MOSTRAR TOAST CON ERROR
                }

            }

        }

        /**
         * Navegación hacia login
         */
        val button_login = binding.buttonLogin
        button_login.setOnClickListener { v: View? ->
            navController.navigate(R.id.aw04_login)
        }
    }
}