package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
val result = findViewById(R.id.rez) as TextView
        val button_add = findViewById(R.id.button_add) as Button
        val button_minus = findViewById(R.id.button_minus) as Button
        val button_multiply = findViewById(R.id.button_multiply) as Button
        val button_devide = findViewById(R.id.button_devide) as Button




        button_add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() + getNum2()).toString()
        })

        button_minus.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() - getNum2()).toString()
        })

        button_multiply.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum2()).toString()
        })

        button_devide.setOnClickListener(View.OnClickListener {
            view ->    if (getNum2() == 0) result.text = ("На 0 делить нельзя")
                   else  result.text = (getNum1() / getNum2()).toString()


        })


    }

    fun getNum1() :Int {
        val input_num1 = findViewById(R.id.ch1) as EditText
            return Integer.parseInt(input_num1.text.toString())

    }

       fun getNum2() :Int {
            val input_num2 = findViewById(R.id.ch2) as EditText
                return Integer.parseInt(input_num2.text.toString())

            }}


