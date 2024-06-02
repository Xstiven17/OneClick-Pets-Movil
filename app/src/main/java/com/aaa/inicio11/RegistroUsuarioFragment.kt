package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class RegistroUsuarioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registro_usuario, container, false)

        // Referenciar los elementos de la interfaz
        val btnAtras: ImageView = view.findViewById(R.id.btnatras)
        val botonRegistrar: Button = view.findViewById(R.id.boton1)
        val btnFacebook: ImageView = view.findViewById(R.id.btnfacebook)
        val btnGmail: ImageView = view.findViewById(R.id.btngmail)

        // Configurar los click listeners
        btnAtras.setOnClickListener {
            // Acción al hacer clic en el botón "atrás"
            activity?.onBackPressed()
        }

        botonRegistrar.setOnClickListener {
         
            Toast.makeText(activity, "Registro completado", Toast.LENGTH_SHORT).show()

        }

        btnFacebook.setOnClickListener {
            // Acción al hacer clic en la imagen de Facebook
            Toast.makeText(activity, "Iniciar sesión con Facebook", Toast.LENGTH_SHORT).show()
            // Aquí puedes agregar la lógica para iniciar sesión con Facebook
        }

        btnGmail.setOnClickListener {
            Toast.makeText(activity, "Iniciar sesión con Gmail", Toast.LENGTH_SHORT).show()

        }

        return view
    }
}
