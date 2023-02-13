package com.example.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark) // buttonDark is assigned a view icon of button type whose id is btnDark
        val buttonRead= findViewById<Button>(R.id.btnLight)
        val layout =findViewById<LinearLayout>(R.id.linearLayout)
        //giving the button names which wont be ever changed further hence using val


        buttonRead.setOnClickListener {
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)

        }//all the code written inside that button will executed if we click on it
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)

        }
    }
}