package com.example.demonstrationcoursandroid

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.demonstrationcoursandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val amb :ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)
        amb.user =User("Alicia","Llaves",40)

        amb.textViewHW.text = "gkdfjglkdfj"
        amb.textViewHW.textSize = 25.0f
        amb.textViewHW.setBackgroundColor(0x79ffbb00)
        amb.textViewHW.setTextColor(
            Color.parseColor("#ff32aa32"))
        amb.buttonModifyHW.setOnClickListener { amb.textViewHW.text = "Bravo tu as appuyé sur un bouton 😃"
        }
    }
}








