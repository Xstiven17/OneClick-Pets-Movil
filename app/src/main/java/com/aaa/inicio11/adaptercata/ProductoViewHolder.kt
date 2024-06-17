package com.aaa.inicio11.adaptercata

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aaa.inicio11.R
import com.aaa.inicio11.model.Catalogo
import com.bumptech.glide.Glide

class ProductoViewHolder (view: View):RecyclerView.ViewHolder(view){
    val producto = view.findViewById<TextView>(R.id.tvProductoName)
    val precio = view.findViewById<TextView>(R.id.tvPrecioProducto)
    val photo = view.findViewById<ImageView>(R.id.ivProducto)
    val btnCarritoComprar = view.findViewById<ImageButton>(R.id.ibCarritoProducto)
    val btnComprar = view.findViewById<Button>(R.id.btnComprar)

    fun render(catalogoModel: Catalogo, onCarritoClick: (Catalogo) -> Unit, onComprarClick: (Catalogo) -> Unit) {
        producto.text = catalogoModel.producto
        precio.text = catalogoModel.precio
        Glide.with(photo.context).load(catalogoModel.photo).into(photo)

        btnCarritoComprar.setOnClickListener {
            onCarritoClick(catalogoModel)
        }

        btnComprar.setOnClickListener {
            onComprarClick(catalogoModel)
        }
    }

}