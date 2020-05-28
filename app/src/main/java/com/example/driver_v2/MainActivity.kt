package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonIngresar.setOnClickListener()
        {
            if(Usuario.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(),"Debe ingresar el nombre del Usuario",Toast.LENGTH_SHORT).show();
            }

            if(Usuario.getText().toString() != "damian.charcas")
            {
                Toast.makeText(getApplicationContext(),"Usuario No Existente",Toast.LENGTH_SHORT).show();
            }

            if(Password.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(),"Debe ingresar contraseña del usuario",Toast.LENGTH_SHORT).show();
            }

            if(Password.getText().toString() != "12345")
            {
                Toast.makeText(getApplicationContext(),"Contraseña Incorrecta",Toast.LENGTH_SHORT).show();
            }

            if(Usuario.getText().toString() == "damian.charcas" && Password.getText().toString() == "12345")
            {
                val intent: Intent = Intent(this, PantallaMenu::class.java)
                startActivity(intent)
            }
        }
    }
}