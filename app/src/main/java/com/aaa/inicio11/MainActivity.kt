package com.aaa.inicio11

import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.aaa.inicio11.databinding.ActivityMainBinding
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
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_item_one -> Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
            R.id.nav_item_two -> Toast.makeText(this, "Catalogo", Toast.LENGTH_SHORT).show()
            R.id.nav_item_three -> Toast.makeText(this, "Categoria Mascotas", Toast.LENGTH_SHORT).show()
            R.id.nav_item_four -> Toast.makeText(this, "Carrito Compras", Toast.LENGTH_SHORT).show()
            R.id.nav_item_five -> Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show()
            R.id.nav_item_six -> Toast.makeText(this, "Ayuda Pqr", Toast.LENGTH_SHORT).show()
            R.id.nav_item_seven -> Toast.makeText(this, "Configuracion Cuenta", Toast.LENGTH_SHORT).show()
        }

        findViewById<DrawerLayout>(R.id.drawer_layout).closeDrawer(GravityCompat.START)
        return true
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










