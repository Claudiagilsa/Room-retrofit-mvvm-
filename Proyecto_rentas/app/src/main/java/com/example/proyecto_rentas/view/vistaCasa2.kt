package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityVistaCasa2Binding

class vistaCasa2 : AppCompatActivity() {
    lateinit var binding: ActivityVistaCasa2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVistaCasa2Binding.inflate(layoutInflater)
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