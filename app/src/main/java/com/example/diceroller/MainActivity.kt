package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//findviewbyid
        val roll_button : Button = findViewById(R.id.roll_button)
        val roll_royce : Button = findViewById(R.id.royce_button)
        var random_text : String

        roll_button.setOnClickListener {
            rollDice()
        }

        roll_royce.setOnClickListener {
            rollice()
        }

    }

    private fun rollice() {
        val rollmice : TextView = findViewById(R.id.roll_mice)
        rollmice.text = "learning something new"
    }

    private fun rollDice() {
//         assign val to a textview and then infalte it by findviewbyid
        val resultText : TextView = findViewById(R.id.random_text)
        resultText.text = "Dice Rolled"
    }
}
