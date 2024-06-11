package com.aaa.inicio11

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        // Configurar los listeners para los botones de Facebook y Gmail
        binding.btnfacebook.setOnClickListener {
            abrirPaginaFacebook()
        }

        binding.btngmail.setOnClickListener {
            mostrarDialogoInicioSesion()
        }
    }

    private fun abrirPaginaFacebook() {
        val facebookLoginUrl = "https://www.facebook.com/login.php"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookLoginUrl))
        startActivity(intent)
    }

    private fun mostrarDialogoInicioSesion() {
        val builder = AlertDialog.Builder(requireContext())
        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_login, null)
        builder.setView(dialogView)

        val dialog = builder.create()
        dialog.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


