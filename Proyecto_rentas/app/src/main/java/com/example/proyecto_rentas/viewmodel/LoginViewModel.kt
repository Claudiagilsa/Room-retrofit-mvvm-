package com.example.proyecto_rentas.viewmodel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.proyecto_rentas.Interface.LoginResult
import com.example.proyecto_rentas.model.User

class LoginViewModel (private val listener: LoginResult): ViewModel(){

    private val user:User
    init{
        this.user=User("","")
    }

    val emailTextWatcher:TextWatcher
    get()=object :TextWatcher{

        override fun afterTextChanged(s: Editable?) {
            user.setEmail(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            TODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            TODO("Not yet implemented")
        }
    }

    val passwordTextWatcher:TextWatcher
        get()=object :TextWatcher{

            override fun afterTextChanged(s: Editable?) {
                user.setPassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }
        }

    fun onLoginClicked(view: View){
       val errorCode:Int= user.isDataValid()

        if(errorCode==0){
            listener.onError("Correo no puede estar vacio")
        }else if(errorCode==1){
            listener.onError("Su correo es invalido")
        }else if(errorCode==2){
            listener.onError("contraseña debe ser mayor de 4 caracteres")
        }else{
            listener.onError("ingreso exitoso")
        }
    }
}