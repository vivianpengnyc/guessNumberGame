package com.example.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var random =  (0..99).random()

        var gameContinue = true

        button.setOnClickListener {
            button.text = "Guess"

            if (vivianEditName.text.isNullOrEmpty()){
                if (gameContinue){
                    var vivianToast = Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT)
                    vivianToast.setGravity(Gravity.CENTER, 0,0)
                    vivianToast.show()
                }

            }
            else {
                gameContinue = true
                vivianEditName.text.clear()
                var value = vivianEditName.text.toString().toInt()
                vivianEditName.text.clear()

                if (random > value){
                    textView.text = "The required value is greater than input"
                }
                else if (random < value){
                    textView.text = "The required value is less than input"
                }
                else{
                    textView.text = "Congratulationsss!"
                    random = (0..99).random()
                    button.text = "Play again"

                    gameContinue = false

                }

            }

        }






    }
}