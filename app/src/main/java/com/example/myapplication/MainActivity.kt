package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {rollDice()}

    }
    private fun rollDice() {
        val rollText:TextView =findViewById(R.id.roll_text)
        val randomInt = (1..6).random()
        rollText.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }


}
