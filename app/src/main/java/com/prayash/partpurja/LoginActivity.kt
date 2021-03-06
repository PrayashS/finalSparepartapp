package com.prayash.partpurja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var btnlogin: Button
    private lateinit var tvregister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin = findViewById(R.id.btnLogIn)

        btnlogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            Toast.makeText(applicationContext, "Welcome to PartPurja", Toast.LENGTH_SHORT).show()

        }

        tvregister = findViewById(R.id.tvRegister)

        tvregister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}