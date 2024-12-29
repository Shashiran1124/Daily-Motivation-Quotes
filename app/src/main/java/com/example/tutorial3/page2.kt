package com.example.tutorial3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var buttonthree = findViewById<Button>(R.id.button3)
        buttonthree.setOnClickListener{
            val intent1 = Intent (this, page3::class.java )
            startActivity(intent1)

        }

        var buttontwo = findViewById<Button>(R.id.button2)
        buttontwo.setOnClickListener{
            val intent1 = Intent (this, page4::class.java )
            startActivity(intent1)

        }
    }
}