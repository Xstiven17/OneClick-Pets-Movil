package com.aaa.inicio11.adaptercc

import com.aaa.inicio11.model.Producto

object ProductProvider {

    private val productosList = mutableListOf(
        Producto("Cama para Perro", 86.000),
        Producto("Dispensador de Alimento", 56.000),
        Producto("Frisbee", 20.800),
        Producto("Alimento para gato 1Kg", 34.000),
        Producto("Raton Juguete ", 8.500),
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
