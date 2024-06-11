package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aaa.inicio11.databinding.FragmentDatosCuentaBinding // Corregir el nombre de la clase generada

class DatosCuentaFragment : Fragment() { // Corregir el nombre de la clase del fragmento
    private lateinit var binding: FragmentDatosCuentaBinding // Utilizar el nombre correcto de la clase generada

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDatosCuentaBinding.inflate(inflater, container, false)
        val view = binding.root

        // Asignar clic listeners a los botones
        binding.backButton.setOnClickListener {
            Toast.makeText(activity, "Atras clickeado", Toast.LENGTH_SHORT).show()
            // Aquí puedes agregar la acción que deseas realizar al hacer clic en el botón "Atras"
        }

        binding.guardarButton.setOnClickListener {
            Toast.makeText(activity, "Guardar clickeado", Toast.LENGTH_SHORT).show()
            // Aquí puedes agregar la acción que deseas realizar al hacer clic en el botón "Guardar"
        }

        return view
    }
}



