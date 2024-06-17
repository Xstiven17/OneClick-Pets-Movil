package com.aaa.inicio11.adaptercc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aaa.inicio11.R
import com.aaa.inicio11.model.Producto

class ProductoAdapter(
    private val onItemClicked: (Producto) -> Unit
) : RecyclerView.Adapter<ProductoViewHolder>() {

    private val productos = mutableListOf<Producto>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_carritocompras, parent, false)
        return ProductoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        holder.bind(productos[position], onItemClicked)
    }

    override fun getItemCount(): Int = productos.size

    fun setProductos(productosList: List<Producto>) {
        productos.clear()
        productos.addAll(productosList)
        notifyDataSetChanged()
    }
}
