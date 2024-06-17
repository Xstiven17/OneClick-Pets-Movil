package com.aaa.inicio11

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContenedorCatalogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contenedor_catalogo)

        // Inicializar el RecyclerView
        initRecyclerCatalogo()

        // Configurar el botón de retroceso
        val backButton = findViewById<ImageView>(R.id.iv_back)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initRecyclerCatalogo() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = com.aaa.inicio11.adaptercata.ProductoAdapter(
            ListaProductos.productosList,
            onCarritoClick = { catalogoModel ->
                // Acción a realizar cuando se haga clic en el botón del carrito
                Toast.makeText(this, "Comprar: ${catalogoModel.producto}", Toast.LENGTH_SHORT)
                    .show()
            },
            onComprarClick = { catalogoModel ->
                // Acción a realizar cuando se haga clic en el botón comprar
                Toast.makeText(
                    this,
                    "Añadido al carrito: ${catalogoModel.producto}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )

        recyclerView.adapter = adapter
    }
}
