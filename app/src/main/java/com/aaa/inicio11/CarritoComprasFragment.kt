package com.aaa.inicio11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aaa.inicio11.adapter.ProductProvider
import com.aaa.inicio11.adapter.ProductoAdapter

class CarritoComprasFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productoAdapter: ProductoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_carrito_compras, container, false)

        recyclerView = view.findViewById(R.id.Recy_carrito)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        productoAdapter = ProductoAdapter { producto ->
            ProductProvider.removeProducto(producto)
            productoAdapter.setProductos(ProductProvider.getProductos())
        }
        recyclerView.adapter = productoAdapter

        val productos = ProductProvider.getProductos()
        productoAdapter.setProductos(productos)

        return view
    }
}
