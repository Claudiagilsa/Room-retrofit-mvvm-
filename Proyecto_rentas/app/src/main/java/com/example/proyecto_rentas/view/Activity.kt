package com.example.proyecto_rentas.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.proyecto_rentas.Interface.LoginResult
import com.example.proyecto_rentas.R
import com.example.proyecto_rentas.databinding.ActivityBinding
import com.example.proyecto_rentas.databinding.ActivityMainBinding
import com.example.proyecto_rentas.viewmodel.LoginViewModel
import com.example.proyecto_rentas.viewmodel.LoginViewModelFactory


class Activity : AppCompatActivity(), LoginResult {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        var activityBinding = DataBindingUtil.setContentView<ActivityBinding>(this, R.layout.activity)
        activityBinding.viewModel = ViewModelProvider(this,
            LoginViewModelFactory(this)
        ).get(LoginViewModel::class.java)
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}