package com.aaa.inicio11.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aaa.inicio11.databinding.ItemCarritocomprasBinding
import com.aaa.inicio11.model.Producto

class ProductoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemCarritocomprasBinding.bind(view)

    fun bind(producto: Producto, onItemClicked: (Producto) -> Unit) {
        binding.nomProduct.text = producto.nombre
        binding.precio.text = "Precio: ${producto.precio}"

        binding.imagbasura.setOnClickListener {
            onItemClicked(producto)
        }
    }
}

