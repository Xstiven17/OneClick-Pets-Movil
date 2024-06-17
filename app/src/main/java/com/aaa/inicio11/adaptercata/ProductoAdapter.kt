package com.aaa.inicio11.adaptercata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aaa.inicio11.model.Catalogo
import com.aaa.inicio11.R

class ProductoAdapter (
    private val ListaProductos:List<Catalogo>,
    private val onCarritoClick: (Catalogo) -> Unit,
    private val onComprarClick: (Catalogo) -> Unit

)

    : RecyclerView.Adapter<ProductoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val LayoutInflater = LayoutInflater.from(parent.context)
        return ProductoViewHolder(LayoutInflater.inflate(R.layout.item_producto, parent, false))
    }

    override fun getItemCount(): Int = ListaProductos.size

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val item = ListaProductos[position]
        holder.render(item,onComprarClick,onCarritoClick)
    }


}