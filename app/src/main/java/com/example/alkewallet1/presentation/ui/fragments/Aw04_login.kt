package com.example.alkewallet1.presentation.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import com.example.alkewallet1.R
import com.example.alkewallet1.data.local.database.AppDatabase
import com.example.alkewallet1.data.network.api.UserApi
import com.example.alkewallet1.data.network.retrofit.RetrofitHelper
import com.example.alkewallet1.data.repository.UserRepositoryImplementation
import com.example.alkewallet1.databinding.FragmentAw04LoginBinding
import com.example.alkewallet1.domain.UserUseCase
import com.example.alkewallet1.presentation.viewmodel.AuthMainViewModel
import com.example.alkewallet1.presentation.viewmodel.SignUpMainViewModel
import com.example.alkewallet1.presentation.viewmodel.ViewModelFactory

class aw04_login : Fragment() {

    //Declaración de Binding
    private lateinit var binding: FragmentAw04LoginBinding

    private lateinit var viewModel: AuthMainViewModel

    private fun init() {
        val apiService = RetrofitHelper.getRetrofit().create(UserApi::class.java)
        val application = requireActivity().application
        val dataBase = AppDatabase.getDatabase(application)
        val repository = UserRepositoryImplementation(apiService, dataBase.userDao())
        val useCase = UserUseCase(repository)
        val viewModelFactory = ViewModelFactory(useCase)
        viewModel = ViewModelProvider(this, viewModelFactory).get(AuthMainViewModel::class.java)
    }


//    private val validator: AuthMainViewModel by viewModels()

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
        binding = FragmentAw04LoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController(view)

        init()

        /**
         * Navegación hacia signup
         */
        val button_signUp = binding.buttonSignup
        button_signUp?.setOnClickListener { // handle your click here
            navController.navigate(R.id.aw03_signup)
        }
            ?: Log.e("LoginFragment", "Button not found in the layout")

        //        button_signUp.setOnClickListener(v->{
//            navController.navigate(R.id.aw03_signup);
//        });
        /**
         * Navegación hacia login
         */
//        TextView textView_login = view.findViewById(R.id.textView_login);
        /**
         * if (textView_login != null) {
         * textView_login.setOnClickListener(new View.OnClickListener() {
         * @Override
         * public void onClick(View v) {
         * // handle your click here
         * navController.navigate(R.id.aw04_login);
         * }
         * });
         * } else {
         * Log.e("LoginFragment", "TextView not found in the layout");
         * }
         */
        /**
         * Navegación hacia homepage
         */
        val button_login = binding.buttonLogin
        button_login.setOnClickListener { v: View? ->

            var valida: Boolean = false

            val userName = binding.textInputEmail.text.toString()
            val password = binding.textInputPassword.text.toString()

            viewModel.loginUserOnClick(userName, password)

            viewModel.loginUserLV.observe(viewLifecycleOwner) { results ->
                results.onSuccess { response ->
                    val token = response.body()?.accessToken.toString()
                    viewModel.saveUserInDB(userName, password, token)
                    navController.navigate(R.id.aw05_homepage)
                }
                results.onFailure {
                    // MOSTRAR TOAST CON ERROR
                }

            }


//            valida = validator.validateUser(binding.textInputEmail.text.toString(),
                binding.textInputPassword.text.toString()

//            if (valida) {
//                navController.navigate(R.id.aw05_homepage)
//            } else {
//                Toast.makeText(context, "Datos incorrectos", Toast.LENGTH_SHORT).show()
//            }
        }
    }
}