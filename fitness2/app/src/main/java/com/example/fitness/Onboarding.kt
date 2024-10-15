package com.example.fitness

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording)


        val nextButton = findViewById<Button>(R.id.btnGetStarted)
        nextButton.setOnClickListener {
            // Start the new activity when the button is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
