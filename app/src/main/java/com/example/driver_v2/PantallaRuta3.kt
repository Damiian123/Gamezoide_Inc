package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_ruta1.*
import kotlinx.android.synthetic.main.activity_pantalla_ruta3.*

class PantallaRuta3 : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_ruta3)

        botonComenzar3.setOnClickListener()
        {
            val intentComienzo3: Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentComienzo3)
            Toast.makeText(getApplicationContext(),"!Viaje realizado con Exito!", Toast.LENGTH_SHORT).show();
        }

        botonAbortar3.setOnClickListener()
        {
            val intentAbortando3: Intent = Intent(this, PantallaViajes::class.java)
            startActivity(intentAbortando3)
            Toast.makeText(getApplicationContext(),"..Viaje Cancelado..", Toast.LENGTH_SHORT).show();
        }

        botonConsultar3.setOnClickListener()
        {
            val intentIntentando3: Intent = Intent(this, Pantallamapa3::class.java)
            startActivity(intentIntentando3)
            Toast.makeText(getApplicationContext(),"...Creando Ruta...", Toast.LENGTH_SHORT).show();
        }
    }
}
