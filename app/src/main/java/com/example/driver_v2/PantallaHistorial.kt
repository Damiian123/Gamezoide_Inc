package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_historial.*

class PantallaHistorial : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_historial)

        botonRegresar.setOnClickListener()
        {
            val intentRegresar: Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentRegresar)

        }

        botonHistorial1.setOnClickListener()
        {
            Toast.makeText(getApplicationContext(),"-Cliente: Armando Gamez\n-De: Dalias 1810, Industrias\n-A: Sendero\n-Monto:$80\n-Diamantes: 4\n-Inicio: 27/Abril/2019 14:39 hrs\n-Fin: 27/Abril/2019 14:56 hrs", Toast.LENGTH_SHORT).show();
        }

        botonHistorial2.setOnClickListener()
        {
            Toast.makeText(getApplicationContext(),"-Cliente: Frank Martinez\n-De: UPSLP\n-A: Plaza Fundadores\n-Monto:$35\n-Diamantes: 3.5\n-Inicio: 28/Abril/2019 15:18 hrs\n-Fin: 28/Abril/2019 15:29 hrs", Toast.LENGTH_SHORT).show();
        }

        botonHistorial3.setOnClickListener()
        {
            Toast.makeText(getApplicationContext(),"-Cliente: Uriel Avila\n-De: Alameda\n-A: Plaza el Paseo\n-Monto:$78\n-Diamantes: 3\n-Inicio: 29/Abril/2019 17:28 hrs\n-Fin: 29/Abril/2019 17:55 hrs", Toast.LENGTH_SHORT).show();
        }
    }
}
