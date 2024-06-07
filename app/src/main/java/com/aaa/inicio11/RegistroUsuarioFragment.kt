package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aaa.inicio11.databinding.FragmentRegistroUsuarioBinding

class RegistroUsuarioFragment : Fragment() {

    private var _binding: FragmentRegistroUsuarioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistroUsuarioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnatras.setOnClickListener {
            Toast.makeText(requireContext(), "Atras", Toast.LENGTH_SHORT).show()
            parentFragmentManager.popBackStack()
        }

        binding.boton1.setOnClickListener {
            Toast.makeText(requireContext(), "Registrar", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
