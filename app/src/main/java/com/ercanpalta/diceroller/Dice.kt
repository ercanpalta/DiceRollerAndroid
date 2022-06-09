package com.ercanpalta.diceroller

class Dice(val numSides: Int) {

    fun roll(): Int {

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when ((1..numSides).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }
}