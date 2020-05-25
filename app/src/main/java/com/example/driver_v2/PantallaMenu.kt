
package com.example.driver_v2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.driver_v2.R.layout.activity_pantalla_menu
import kotlinx.android.synthetic.main.activity_pantalla_menu.*

class PantallaMenu : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(activity_pantalla_menu)

        botonMaps.setOnClickListener()
        {
            val intentMaps:Intent = Intent(this, MapsGM::class.java)
            startActivity(intentMaps)
        }

        boton_historialviajes.setOnClickListener()
        {
            val intentHistorial:Intent = Intent(this, PantallaHistorial::class.java)
            startActivity(intentHistorial)
        }

        boton_seleccionarviajes.setOnClickListener()
        {
            val intentViajes:Intent = Intent(this, PantallaViajes::class.java)
            startActivity(intentViajes)
        }

        botonCerrarSesion.setOnClickListener()
        {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Cerrar Sesion")
            builder.setMessage("¿Esta seguro de cerrar la sesion?")
            builder.setPositiveButton("Si")
            {
                dialog, which ->
                val intentRegresar: Intent = Intent(this, MainActivity::class.java)
                startActivity(intentRegresar)
            }
            builder.setNegativeButton("No")
            {
                dialog, which ->
                builder.show()
            }
        }
    }
}
