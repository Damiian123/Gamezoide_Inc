package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_viajes.*

class PantallaViajes : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_viajes)

        botonTerminar.setOnClickListener()
        {
            val intentTerminar: Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intentTerminar)
        }

        botonViaje1.setOnClickListener()
        {
            val intentViaje1: Intent = Intent(this, PantallaRuta1::class.java)
            startActivity(intentViaje1)
        }

        botonViaje2.setOnClickListener()
        {
            val intentViaje2: Intent = Intent(this, PantallaRuta2::class.java)
            startActivity(intentViaje2)
        }

        botonViaje3.setOnClickListener()
        {
            val intentViaje3: Intent = Intent(this, PantallaRuta3::class.java)
            startActivity(intentViaje3)
        }
    }
}
