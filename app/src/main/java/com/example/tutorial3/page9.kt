package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page9)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imageViewfortynine= findViewById<ImageView>(R.id.imageView49)
        imageViewfortynine.setOnClickListener{
            val intent1 = Intent (this, page7::class.java )
            startActivity(intent1)

        }

        var imageViewseventyseven= findViewById<ImageView>(R.id.imageView77)
        imageViewseventyseven.setOnClickListener{
            val intent1 = Intent (this, page10::class.java )
            startActivity(intent1)

        }
    }
}