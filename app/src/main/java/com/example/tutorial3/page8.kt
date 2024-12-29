package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page8)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imageViewhundred= findViewById<ImageView>(R.id.imageView100)
        imageViewhundred.setOnClickListener{
            val intent1 = Intent (this, page7::class.java )
            startActivity(intent1)

        }

        var imageViewseventysix= findViewById<ImageView>(R.id.imageView76)
        imageViewseventysix.setOnClickListener {
            val intent1 = Intent(this, page10::class.java)
            startActivity(intent1)
        }
    }
}