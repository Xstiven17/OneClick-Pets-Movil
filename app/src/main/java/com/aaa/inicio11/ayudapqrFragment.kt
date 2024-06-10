package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AyudapqrFragment : Fragment() {

    private lateinit var btnAtras: ImageView
    private lateinit var boton1: Button
    private lateinit var boton2: Button
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var edit3: EditText
    private lateinit var etPQRS: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ayudapqr, container, false)

        btnAtras = view.findViewById(R.id.btnatras)
        boton1 = view.findViewById(R.id.boton1)
        boton2 = view.findViewById(R.id.boton2)
        edit1 = view.findViewById(R.id.edit1)
        edit2 = view.findViewById(R.id.edit2)
        edit3 = view.findViewById(R.id.edit3)
        etPQRS = view.findViewById(R.id.etPQRS)

        btnAtras.setOnClickListener {
            findNavController().popBackStack()
        }

        boton1.setOnClickListener {
            val name = edit1.text.toString()
            val documentNumber = edit2.text.toString()
            val phoneNumber = edit3.text.toString()
            val pqrs = etPQRS.text.toString()

            if (name.isEmpty() || documentNumber.isEmpty() || phoneNumber.isEmpty() || pqrs.isEmpty()) {
                Toast.makeText(requireContext(), "Por favor, llene todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Manejar la acción de "Entregar" aquí
                Toast.makeText(requireContext(), "Entregar clickeado", Toast.LENGTH_SHORT).show()
            }
        }

        boton2.setOnClickListener {
            // Manejar la acción de "Guardar" aquí
            Toast.makeText(requireContext(), "Guardar clickeado", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}