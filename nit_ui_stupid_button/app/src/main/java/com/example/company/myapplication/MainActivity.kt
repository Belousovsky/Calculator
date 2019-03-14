package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

        fun button_click_handler(v: View){
            (v as Button).text = "Button was pressed"
                    //Log.d("CHECKER", "")
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        var button = findViewById<Button>(R.id.button)
button.setOnClickListener(::button_click_handler)
    }
}
