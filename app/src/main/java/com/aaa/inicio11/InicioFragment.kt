package com.aaa.inicio11


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

<<<<<<< HEAD
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InicioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InicioFragment : Fragment() {
=======
class InicioFragment: Fragment() {
>>>>>>> 0165b8bea16d31af58508df8d598ceba53f2eed6

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnComprar = view.findViewById<Button>(R.id.button1)
        val btnPerfil = view.findViewById<ImageView>(R.id.btnperfil)

        btnComprar.setOnClickListener {

            btnComprar.setOnClickListener {
                Toast.makeText(requireContext(), "Comprar Ahora clickeado", Toast.LENGTH_SHORT)
                    .show()
            }

            btnPerfil.setOnClickListener {
                Toast.makeText(requireContext(), "Perfil clickeado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
