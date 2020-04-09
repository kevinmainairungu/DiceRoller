package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        roll_button.setOnClickListener {
            rollDice()
        }
        roll_royce.setOnClickListener {
            rollice()
        }
    }
    private fun rollice() {
//        assign val to a textview and then infalte it by findviewbyid
        val randomInt = Random().nextInt(6) + 1
        val drawableResource =  when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val imageView : ImageView = findViewById(R.id.image_view)
        imageView.setImageResource(drawableResource)
    }
    private fun rollDice() {
//         assign val to a textview and then infalte it by findviewbyid
        val diceView : ImageView = findViewById(R.id.dice_view)
        val randomNum = Random().nextInt(6) + 1

        val drawableImage = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceView.setImageResource(drawableImage)
    }
}
