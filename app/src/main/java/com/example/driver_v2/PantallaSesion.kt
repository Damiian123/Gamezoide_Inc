package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_sesion.*

class PantallaSesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_sesion)

        botonCerrar.setOnClickListener()
        {
            val intentTerminar: Intent = Intent(this, MainActivity::class.java)
            startActivity(intentTerminar)
        }

        botonCancelar.setOnClickListener()
        {
            val intentCancelar:Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentCancelar)
        }
    }
}
