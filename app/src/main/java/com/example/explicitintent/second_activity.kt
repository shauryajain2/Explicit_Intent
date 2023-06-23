package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.explicitintent.R.id.back

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnback = findViewById<Button>(R.id.back)

        btnback.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}