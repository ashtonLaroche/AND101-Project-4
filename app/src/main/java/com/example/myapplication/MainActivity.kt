package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cbutton = findViewById<Button>(R.id.celcius)
        val fbutton = findViewById<Button>(R.id.farenheit)

        val userInput = findViewById<EditText>(R.id.editTextNumberSigned)
        val output = findViewById<TextView>(R.id.textView2)

        cbutton.setOnClickListener{
            val finalTemp: Double = ((userInput.text).toString().toInt() - 32) * (5.0/9.0)
            output.text = "${finalTemp.roundToInt()} C"
        }

        fbutton.setOnClickListener{
            val finalTemp: Double = ((userInput.text).toString().toInt() * (9.0/5.0)) + 32
            output.text = "${finalTemp.roundToInt()} F"
        }

    }

}