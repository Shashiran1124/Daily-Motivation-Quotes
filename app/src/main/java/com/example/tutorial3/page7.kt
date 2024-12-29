package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imageVieweightynine= findViewById<ImageView>(R.id.imageView89)
        imageVieweightynine.setOnClickListener{
            val intent1 = Intent (this, page8::class.java )
            startActivity(intent1)

        }

        var imageViewsixty= findViewById<ImageView>(R.id.imageView60)
        imageViewsixty.setOnClickListener{
            val intent1 = Intent (this, page9::class.java )
            startActivity(intent1)

        }

        var imageViewfourtyseven= findViewById<ImageView>(R.id.imageView47)
        imageViewfourtyseven.setOnClickListener{
            val intent1 = Intent (this, page10::class.java )
            startActivity(intent1)

        }


    }
}