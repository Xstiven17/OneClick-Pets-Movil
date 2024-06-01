package com.aaa.inicio11

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.aaa.inicio11.databinding.FragmentConfigCuentaBinding


@Suppress("UNREACHABLE_CODE")
class ConfigCuentaFragment : Fragment() {

    private var _binding: FragmentConfigCuentaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfigCuentaBinding.inflate(inflater, container, false)
        return binding.root


        binding.ivSecurity.bringToFront()
        binding.ivCards.bringToFront()
        binding.ivAccountData.bringToFront()
        binding.ivDeleteAccount.bringToFront()
        binding.ivProfile.bringToFront()




        // Configuración del click listener para el ImageButton ivSecurity
        binding.ivSecurity.setOnClickListener {
            Toast.makeText(activity, "Seguridad clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageButton ivCards
        binding.ivCards.setOnClickListener {
            Toast.makeText(activity, "Tarjetas clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageView ivAccountData
        binding.ivAccountData.setOnClickListener {
            Toast.makeText(activity, "Datos de cuenta clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageView ivDeleteAccount
        binding.ivDeleteAccount.setOnClickListener {
            Toast.makeText(activity, "Eliminar cuenta clickeado", Toast.LENGTH_SHORT).show()
        }

        // Configuración del click listener para el ImageView ivProfilePicture
        binding.ivProfile.setOnClickListener {
            Toast.makeText(activity, "Imagen de perfil clickeado", Toast.LENGTH_SHORT).show()
        }


}
}











