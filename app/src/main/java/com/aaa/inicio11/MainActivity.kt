package com.aaa.inicio11

import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Inicio11)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar_main))

        toggle = ActionBarDrawerToggle(
            this,
            findViewById(R.id.drawer_layout),
            findViewById(R.id.toolbar_main),
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        findViewById<DrawerLayout>(R.id.drawer_layout).addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        findViewById<NavigationView>(R.id.nav_view).setNavigationItemSelectedListener(this)

        // Cargar InicioFragment de forma predeterminada
        if (savedInstanceState == null) {
            loadFragment(InicioFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_item_one -> {
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
                loadFragment(InicioFragment())
            }
            R.id.nav_item_two -> {
                Toast.makeText(this, "Catálogo", Toast.LENGTH_SHORT).show()
                // loadFragment(CatalogoFragment()) // Reemplazar con el fragmento real
            }
            R.id.nav_item_three -> {
                Toast.makeText(this, "Categoría Mascotas", Toast.LENGTH_SHORT).show()
                // loadFragment(CategoriaMascotasFragment()) // Reemplazar con el fragmento real
            }
            R.id.nav_item_four -> {
                Toast.makeText(this, "Carrito Compras", Toast.LENGTH_SHORT).show()
                // loadFragment(CarritoComprasFragment()) // Reemplazar con el fragmento real
            }
            R.id.nav_item_five -> {
                Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show()
                loadFragment(NotificacionFragment()) // Cargar el fragmento de notificaciones
            }
            R.id.nav_item_six -> {
                Toast.makeText(this, "Ayuda PQR", Toast.LENGTH_SHORT).show()
                loadFragment(AyudapqrFragment()) // Reemplazar con el fragmento real
            }
            R.id.nav_item_seven -> {
                Toast.makeText(this, "Configuración Cuenta", Toast.LENGTH_SHORT).show()
                loadFragment(ConfigCuentaFragment())
            }
        }

        findViewById<DrawerLayout>(R.id.drawer_layout).closeDrawer(GravityCompat.START)
        return true
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null) // Añadir esta transacción a la pila
        transaction.commit()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}


