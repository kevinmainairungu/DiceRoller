package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//findviewbyid
        val roll_button : Button = findViewById(R.id.roll_button)
        val roll_royce : Button = findViewById(R.id.royce_button)

        roll_button.setOnClickListener {
            Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show()
        }

        roll_royce.setOnClickListener {
            Toast.makeText(this, "royce get out", Toast.LENGTH_SHORT).show()
        }
    }
}
