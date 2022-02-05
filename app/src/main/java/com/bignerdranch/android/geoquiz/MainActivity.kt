package com.bignerdranch.android.geoquiz

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var trueToast:Toast
    private lateinit var falseToast:Toast


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            trueToast = Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
            trueToast.setGravity(Gravity.TOP, 0, 0)
            trueToast.show()
        }

        falseButton.setOnClickListener {
            falseToast = Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
            falseToast.setGravity(Gravity.TOP, 0, 0)
            falseToast.show()
        }
    }
}