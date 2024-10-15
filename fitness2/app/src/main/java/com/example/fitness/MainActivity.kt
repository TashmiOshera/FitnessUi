package com.example.fitness

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        // Redirect to LoginActivity after 200ms using Coroutine
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            val intent = Intent(this@MainActivity, Onboarding::class.java)
            startActivity(intent)
            finish() // Optional: finish MainActivity if you don't want to return to it
        }
    }
}
