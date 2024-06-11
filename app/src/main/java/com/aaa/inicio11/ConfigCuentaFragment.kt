package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aaa.inicio11.databinding.FragmentConfigCuentaBinding

class ConfigCuentaFragment: Fragment() {

    private var _binding: FragmentConfigCuentaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfigCuentaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configuración del click listener para el ImageButton ivSecurity
        binding.ivSecurity.setOnClickListener {
            Toast.makeText(activity, "Seguridad clickeado", Toast.LENGTH_SHORT).show()
            // Aquí puedes agregar la navegación correspondiente si es necesario
        }

        // Configuración del click listener para el ImageButton ivCards
        binding.ivCards.setOnClickListener {
            Toast.makeText(activity, "Tarjetas clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageView ivAccountData
        binding.ivAccountData.setOnClickListener {
            Toast.makeText(activity, "Datos de cuenta clickeado", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.datosCuentaFragment)
        }

        // Configuración del click listener para el ImageView ivDeleteAccount
        binding.ivDeleteAccount.setOnClickListener {
            Toast.makeText(activity, "Eliminar cuenta clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageView ivProfile
        binding.ivProfile.setOnClickListener {
            Toast.makeText(activity, "Imagen de perfil clickeado", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}













