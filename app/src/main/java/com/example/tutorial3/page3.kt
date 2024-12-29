package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var buttontwenty= findViewById<Button>(R.id.button20)
        buttontwenty.setOnClickListener{
            val intent1 = Intent (this, page4::class.java )
            startActivity(intent1)

        }
        var buttonfive= findViewById<Button>(R.id.button5)
        buttonfive.setOnClickListener{
            val intent1 = Intent (this, page4::class.java )
            startActivity(intent1)

        }
    }
}