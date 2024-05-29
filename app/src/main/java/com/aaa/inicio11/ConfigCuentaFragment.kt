package com.aaa.inicio11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.aaa.inicio11.databinding.FragmentConfigCuentaBinding


class ConfigCuentaFragment : Fragment() {

    private var _binding: FragmentConfigCuentaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfigCuentaBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.rectan2Config.setOnClickListener {
            Toast.makeText(requireContext(), "Rectan1 clicked", Toast.LENGTH_SHORT).show()
        }

        binding.PerfilConfig.setOnClickListener {
            Toast.makeText(requireContext(), "Profile picture clicked", Toast.LENGTH_SHORT).show()
        }

        binding.DatoCuenta.setOnClickListener {
            Toast.makeText(requireContext(), "Account data clicked", Toast.LENGTH_SHORT).show()
        }

        binding.TarjetConfig.setOnClickListener {
            Toast.makeText(requireContext(), "Cards clicked", Toast.LENGTH_SHORT).show()
        }

        binding.SeguridadConfig.setOnClickListener {
            Toast.makeText(requireContext(), "Security clicked", Toast.LENGTH_SHORT).show()
        }

        binding.DeleteConfig.setOnClickListener {
            Toast.makeText(requireContext(), "Delete account clicked", Toast.LENGTH_SHORT).show()
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



