package com.aaa.inicio11


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class InicioFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnComprar = view.findViewById<Button>(R.id.button1)
        val btnPerfil = view.findViewById<ImageView>(R.id.btnperfil)

        btnComprar.setOnClickListener {

            btnComprar.setOnClickListener {
                Toast.makeText(requireContext(), "Comprar Ahora clickeado", Toast.LENGTH_SHORT)
                    .show()
            }

            btnPerfil.setOnClickListener {
                Toast.makeText(requireContext(), "Perfil clickeado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
