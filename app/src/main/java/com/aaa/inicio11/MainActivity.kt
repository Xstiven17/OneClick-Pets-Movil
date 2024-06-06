package com.aaa.inicio11

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Inicio11)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate()")

        setSupportActionBar(findViewById(R.id.toolbar_main))

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

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, InicioFragment())
                .commit()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragment: Fragment = when (item.itemId) {
            R.id.nav_item_one -> InicioFragment()
          //  R.id.nav_item_two -> CatalogoFragment()
            else -> InicioFragment()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

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







