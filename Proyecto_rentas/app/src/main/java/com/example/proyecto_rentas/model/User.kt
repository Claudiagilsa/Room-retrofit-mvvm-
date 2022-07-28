package com.example.proyecto_rentas.model

import android.text.TextUtils
import android.util.Patterns

class User(private var email:String, private var password:String){

    fun isDataValid():Int{
        if(TextUtils.isEmpty(getEmail())){
            return 0
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 1
        }
        else if(getPassword().length<4){
            return 2
        }else{
            return -1
        }
    }

    fun getEmail():String{
        return email
    }

    fun getPassword():String{
        return password
    }

    fun setEmail(email: String){
        this.email=email
    }

    fun setPassword(password: String){
        this.password=password
    }


}