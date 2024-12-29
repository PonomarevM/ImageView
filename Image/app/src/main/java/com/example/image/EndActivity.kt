package com.example.image

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EndActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)


        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener{
            finishAffinity()
        }
    }
}