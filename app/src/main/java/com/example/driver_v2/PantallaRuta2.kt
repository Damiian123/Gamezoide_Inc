package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_ruta1.*
import kotlinx.android.synthetic.main.activity_pantalla_ruta2.*

class PantallaRuta2 : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_ruta2)

        botonComenzar2.setOnClickListener()
        {
            val intentComienzo2: Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentComienzo2)
            Toast.makeText(getApplicationContext(),"!Viaje realizado con Exito!", Toast.LENGTH_SHORT).show();
        }

        botonAbortar2.setOnClickListener()
        {
            val intentAbortando2: Intent = Intent(this, PantallaViajes::class.java)
            startActivity(intentAbortando2)
            Toast.makeText(getApplicationContext(),"..Viaje Cancelado..", Toast.LENGTH_SHORT).show();
        }

        botonConsultar2.setOnClickListener()
        {
            val intentIntentando2: Intent = Intent(this, Pantallamapa2::class.java)
            startActivity(intentIntentando2)
            Toast.makeText(getApplicationContext(),"...Creando Ruta...", Toast.LENGTH_SHORT).show();
        }
    }
}
