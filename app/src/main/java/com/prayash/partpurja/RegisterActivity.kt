package com.prayash.partpurja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var btnregister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnregister = findViewById(R.id.btnRegister)

        btnregister.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}