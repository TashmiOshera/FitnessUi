package com.example.fitness

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val nextButton = findViewById<Button>(R.id.button10)
        nextButton.setOnClickListener {
            // Start the new activity when the button is clicked
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val nxtButton = findViewById<Button>(R.id.button11)
        nxtButton.setOnClickListener {
            // Start the new activity when the button is clicked
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}