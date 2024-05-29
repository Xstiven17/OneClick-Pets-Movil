package com.aaa.inicio11

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class VerificacionCuentaFragment : Fragment() {

    private lateinit var digit1: EditText
    private lateinit var digit2: EditText
    private lateinit var digit3: EditText
    private lateinit var digit4: EditText
    private lateinit var btnReenviar: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_verificacion_cuenta, container, false)

        digit1 = view.findViewById(R.id.edit1_1)
        digit2 = view.findViewById(R.id.edit2_2)
        digit3 = view.findViewById(R.id.edit3_3)
        digit4 = view.findViewById(R.id.edit4_4)
        btnReenviar = view.findViewById(R.id.btn_reenviar)

        val textWatcher = VerificationTextWatcher()
        digit1.addTextChangedListener(textWatcher)
        digit2.addTextChangedListener(textWatcher)
        digit3.addTextChangedListener(textWatcher)
        digit4.addTextChangedListener(textWatcher)

        btnReenviar.setOnClickListener {
            Toast.makeText(activity, "Correo de verificación reenviado", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    private inner class VerificationTextWatcher : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(editable: Editable?) {
            editable?.let {
                when {
                    digit1.hasFocus() && it.length == 1 -> digit2.requestFocus()
                    digit2.hasFocus() && it.length == 1 -> digit3.requestFocus()
                    digit2.hasFocus() && it.isEmpty() -> digit1.requestFocus()
                    digit3.hasFocus() && it.length == 1 -> digit4.requestFocus()
                    digit3.hasFocus() && it.isEmpty() -> digit2.requestFocus()
                    digit4.hasFocus() && it.isEmpty() -> digit3.requestFocus()
                    else -> {}
                }
            }
        }
    }
}



