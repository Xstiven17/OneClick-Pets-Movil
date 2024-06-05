package com.aaa.inicio11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}






