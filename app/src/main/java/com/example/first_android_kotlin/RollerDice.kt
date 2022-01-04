package com.example.first_android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RollerDice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roller_dice)
        title = "Dice Roller"
        val button: Button = findViewById(R.id.btn_roll)
        button.setOnClickListener { rollDice() }

        val secondDice = Dice(20)
        println(secondDice.rolling())
        val randomNumber = (1..6).random()
        println(randomNumber)
        val firstCoin = Coin()
        if (firstCoin.flip() == 0) {
            println("cara")
        } else {
            println("coroa")
        }
    }

    private fun rollDice() {
        val firstDice = Dice(6)
        val rollResult = firstDice.rolling()

        val diceImage: ImageView = findViewById(R.id.img_dice)
        val drawableResource = when (rollResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = rollResult.toString()

        val luckyNumber = 4

        when (rollResult) {
            luckyNumber -> println("You win!")
            else -> println("You didn't win, try again!")
        }
    }
}

class Dice(private val sides: Int) {
    fun rolling(): Int {
        return (1..sides).random()
    }
}

class Coin {
    fun flip(): Int {
        return (0..1).random()
    }
}