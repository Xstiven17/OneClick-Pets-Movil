package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.aaa.inicio11.databinding.FragmentInicioSesionBinding

class InicioSesionFragment : Fragment() {

    private var _binding: FragmentInicioSesionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInicioSesionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnatras.setOnClickListener {
            Toast.makeText(requireContext(), "Atras", Toast.LENGTH_SHORT).show()
            parentFragmentManager.popBackStack()
        }

        binding.btnIniciarSesion.setOnClickListener {
            Toast.makeText(requireContext(), "Login", Toast.LENGTH_SHORT).show()
        }

        binding.btnRegistrarse.setOnClickListener {
            Toast.makeText(requireContext(), "Registrar", Toast.LENGTH_SHORT).show()
            navigateToRegistroFragment()
        }

        binding.tvRecuperar.setOnClickListener {
            Toast.makeText(requireContext(), "Recuperar", Toast.LENGTH_SHORT).show()
            navigateToVerificacionCuentaFragment()
        }
    }

    private fun navigateToRegistroFragment() {
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, RegistroUsuarioFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun navigateToVerificacionCuentaFragment() {
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, VerificacionCuentaFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}






