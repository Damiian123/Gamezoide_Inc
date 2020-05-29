package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_ruta1.*

class PantallaRuta1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_ruta1)

        botonComenzar.setOnClickListener()
        {
            val intentComienzo1: Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentComienzo1)
            Toast.makeText(getApplicationContext(),"!Viaje realizado con Exito!", Toast.LENGTH_SHORT).show();
        }

        botonAbortar.setOnClickListener()
        {
            val intentAbortando1: Intent = Intent(this, PantallaViajes::class.java)
            startActivity(intentAbortando1)
            Toast.makeText(getApplicationContext(),"..Viaje Cancelado..", Toast.LENGTH_SHORT).show();
        }

        botonConsultar.setOnClickListener()
        {
            val intentIntentando1: Intent = Intent(this, Pantallamapa1::class.java)
            startActivity(intentIntentando1)
            Toast.makeText(getApplicationContext(),"...Creando Ruta...", Toast.LENGTH_SHORT).show();
        }
    }


}
