package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityArrendarFinBinding

class ArrendarFin : AppCompatActivity() {
    lateinit var binding: ActivityArrendarFinBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityArrendarFinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.salir.setOnClickListener{
            val lanzar= Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }

        binding.inicio.setOnClickListener{
            val lanzar= Intent(this, Search::class.java)
            startActivity(lanzar)
        }
    }
}