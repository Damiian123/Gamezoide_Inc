package com.example.driver_v2
//mysql-connector-java-5.1.31-bin.jar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() /*extends Activity*/
{
    /*
    private EditText Servidor, Puerto, Usuario, Password;
    private String baseDatos = "Driver";
    if(!conexionMySQL.isClosed())
    {
        estadoConexion = true;
    }
    catch(SQLException ex)
    {
        Log.d("No ha sido posible conectar con la base de datos", ex.getMessage());
    }

    finally
    {
        try
        {
            conexionMySQL.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    return estadoConexion;
    */

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonIngresar.setOnClickListener()
        {
            if(Usuario.getText().toString().isEmpty() or Password.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(),"Favor de llenar los espacios solicitados",Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(Usuario.getText().toString() != "damian.charcas" && Password.getText().toString() != "12345")
                {
                    Toast.makeText(getApplicationContext(),"Hay un dato incorrecto o inexistente",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    val intent: Intent = Intent(this, PantallaMenu::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}