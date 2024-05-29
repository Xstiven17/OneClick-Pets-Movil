package com.aaa.inicio11
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Inicio11)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_inicio_sesion)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InicioSesionFragment())
                .commit()
        }
    }
}











