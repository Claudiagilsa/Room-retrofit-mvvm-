package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityArrendarBinding

class Arrendar : AppCompatActivity() {
    lateinit var binding: ActivityArrendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityArrendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancl.setOnClickListener{
            val lanzar= Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.sig.setOnClickListener{
            val lanzar= Intent(this, Arrendar2::class.java)
            startActivity(lanzar)
        }
    }
}