package com.ercanpalta.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

//This activity allows the user to roll a dice and view the result on the screen.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice(1)
        val rollButton: Button = findViewById(R.id.button)
        val rollButton2: Button = findViewById(R.id.button2)

        rollButton.setOnClickListener {
            rollDice(1)
        }

        rollButton2.setOnClickListener {
            rollDice(2)
        }


    }


    //Roll the dice and update the screen with the result.
    private fun rollDice(diceNumber: Int) {
        val dice = Dice(6)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImageX1: ImageView = findViewById(R.id.imageViewX1)
        val diceImageX2: ImageView = findViewById(R.id.imageViewX2)

        if(diceNumber == 1){
            diceImage.visibility = View.VISIBLE
            diceImageX1.visibility = View.INVISIBLE
            diceImageX2.visibility = View.INVISIBLE

            diceImage.setImageResource(dice.roll())
        }else{
            diceImage.visibility = View.INVISIBLE
            diceImageX1.visibility = View.VISIBLE
            diceImageX2.visibility = View.VISIBLE

            diceImageX1.setImageResource(dice.roll())
            diceImageX2.setImageResource(dice.roll())
        }


    }
}

