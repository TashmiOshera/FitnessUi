package com.example.fitness

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)



        val imageView = findViewById<ImageView>(R.id.ppro)

        imageView.setOnClickListener {
            // Start the new activity when the ImageView is clicked
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
            }



    }
}