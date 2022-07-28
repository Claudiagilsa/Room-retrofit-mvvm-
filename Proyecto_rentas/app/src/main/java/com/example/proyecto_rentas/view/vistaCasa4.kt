package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityVistaCasa4Binding

class vistaCasa4 : AppCompatActivity() {
    lateinit var binding: ActivityVistaCasa4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVistaCasa4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.salir.setOnClickListener{
            val lanzar = Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.arrendar.setOnClickListener{
            val lanzar= Intent(this, Arrendar::class.java)
            startActivity(lanzar)
        }
    }
}