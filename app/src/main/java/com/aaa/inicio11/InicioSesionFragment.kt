package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class InicioSesionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_inicio_sesion, container, false)


        view.findViewById<View>(R.id.btnatras).setOnClickListener {
            Toast.makeText(context, "Back button clicked", Toast.LENGTH_SHORT).show()

        }

        view.findViewById<View>(R.id.btnIniciarSesion).setOnClickListener {
            Toast.makeText(context, "Login button clicked", Toast.LENGTH_SHORT).show()

        }

        view.findViewById<View>(R.id.btnRegistrarse).setOnClickListener {
            Toast.makeText(context, "Register button clicked", Toast.LENGTH_SHORT).show()

        }

        view.findViewById<View>(R.id.tvRecuperar).setOnClickListener {
            Toast.makeText(context, "Recover password clicked", Toast.LENGTH_SHORT).show()

        }

        return view
    }
}



