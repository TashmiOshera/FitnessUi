package com.example.fitness

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)


        val nxtButton = findViewById<Button>(R.id.btnLogout)
        nxtButton.setOnClickListener {
            // Start the new activity when the button is clicked
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}