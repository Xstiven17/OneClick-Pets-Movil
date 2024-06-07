package com.aaa.inicio11

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.aaa.inicio11.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {

    private var _binding: FragmentInicioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        Log.d("InicioFragment", "onCreateView()")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            Toast.makeText(requireContext(), "Comprar Ahora", Toast.LENGTH_SHORT).show()
        }

        binding.btnperfil.setOnClickListener {
            Toast.makeText(requireContext(), "InicioUsuario", Toast.LENGTH_SHORT).show()
            navigateToInicioSesionFragment()
        }
    }

    private fun navigateToInicioSesionFragment() {
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, InicioSesionFragment())
        transaction.addToBackStack(null) // Add this transaction to the back stack
        transaction.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

