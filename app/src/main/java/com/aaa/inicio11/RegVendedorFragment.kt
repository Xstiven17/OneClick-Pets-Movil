package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aaa.inicio11.databinding.FragmentRegVendedorBinding


class RegVendedorFragment : Fragment() {

    private var _binding: FragmentRegVendedorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegVendedorBinding.inflate(inflater, container, false)

        setupListeners()
        return binding.root

    }

    private fun setupListeners() {
        binding.btnatras.setOnClickListener {
            Toast.makeText(requireContext(), "Atras", Toast.LENGTH_SHORT).show()
        }

        binding.boton1.setOnClickListener {

            val email = binding.edit1.text.toString()
            val nit = binding.edit2.text.toString()
            val telefono = binding.edit3.text.toString()
            val contraseña = binding.edit4.text.toString()

            if (email.isNotEmpty() && nit.isNotEmpty() && telefono.isNotEmpty() && contraseña.isNotEmpty()) {
                Toast.makeText(context, "Datos guardados correctamente", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

