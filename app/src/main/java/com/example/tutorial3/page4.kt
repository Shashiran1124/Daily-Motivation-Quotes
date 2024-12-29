package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var buttontwentyone= findViewById<Button>(R.id.button21)
        buttontwentyone.setOnClickListener{
            val intent1 = Intent (this, page5::class.java )
            startActivity(intent1)

        }
        var buttontwentythree= findViewById<Button>(R.id.button23)
        buttontwentythree.setOnClickListener{
            val intent1 = Intent (this, page3::class.java )
            startActivity(intent1)

        }
    }
}