package com.aaa.inicio11.adapter

import com.aaa.inicio11.model.Producto

object ProductProvider {

    private val productosList = mutableListOf(
        Producto("Cama para Perro", 100.0),
        Producto("Dispensador de Alimento", 150.0),
        Producto("Frisbee", 80.0),
        Producto("Alimento para ave", 80.0),
        Producto("Raton Juguete", 80.0),
    )

    // Método para obtener la lista de productos
    fun getProductos(): List<Producto> {
        return productosList
    }

    // Método para agregar un producto
    fun addProducto(producto: Producto) {
        productosList.add(producto)
    }

    // Método para eliminar un producto
    fun removeProducto(producto: Producto) {
        productosList.remove(producto)
    }
}
