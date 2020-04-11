package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
//    We are promising android that this two variables will be used even later on
    lateinit var rollDice : ImageView
    lateinit var rollDicess : ImageView
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
        rollDice = findViewById(R.id.image_view)
        rollDicess = findViewById(R.id.dice_view)
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

        rollDice.setImageResource(drawableResource)
    }
    private fun rollDice() {
//         assign val to a textview and then infalte it by findviewbyid
        val randomNum = Random().nextInt(6) + 1

        val drawableImage = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        rollDicess.setImageResource(drawableImage)
    }
}
