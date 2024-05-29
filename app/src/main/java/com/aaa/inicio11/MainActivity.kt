package com.aaa.inicio11
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Inicio11)

        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.fragment_inicio_sesion)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InicioSesionFragment())
                .commit()
        }
=======
        setContentView(R.layout.fragment_config_cuenta)
>>>>>>> 456032729d1b665df0eae0b6b2e63a1ee4856bd0
    }
}











