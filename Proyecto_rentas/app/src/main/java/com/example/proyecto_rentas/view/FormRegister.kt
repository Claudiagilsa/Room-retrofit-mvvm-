package com.example.proyecto_rentas.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_rentas.databinding.ActivityFormBinding


class FormRegister: AppCompatActivity() {

    lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BottomAcept.setOnClickListener{
            val lanzar = Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.reverse.setOnClickListener{
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }
    }
}