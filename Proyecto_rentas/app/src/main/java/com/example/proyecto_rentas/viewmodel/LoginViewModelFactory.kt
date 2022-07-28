package com.example.proyecto_rentas.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.proyecto_rentas.Interface.LoginResult

class LoginViewModelFactory(private val listener: LoginResult): ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}