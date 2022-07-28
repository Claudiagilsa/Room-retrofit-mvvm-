package com.example.proyecto_rentas.view


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyecto_rentas.R
import com.example.proyecto_rentas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding


        Thread.sleep(2000)
        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIniciarSesion.setOnClickListener {

            if (binding.edUser.text.toString().equals("admin") and binding.edPass.text.toString()
                    .equals("Admin")
            ) {
                val lanzar = Intent(this, Search::class.java)
                startActivity(lanzar)
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_LONG).show()
            }
        }

        binding.textView7.setOnClickListener {
            val lanzar = Intent(this, FormRegister::class.java)
            startActivity(lanzar)
        }

        binding.textView8.setOnClickListener {
            val lanzar = Intent(this, Search::class.java)
            startActivity(lanzar)
        }
    }
}