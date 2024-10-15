package com.example.fitness

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val nextButton = findViewById<Button>(R.id.button4)
        nextButton.setOnClickListener {
            // Start the new activity when the button is clicked
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}