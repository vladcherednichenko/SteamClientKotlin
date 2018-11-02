package com.steamclientkotlin.trykotlin.steamclientkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var button: Button? = null
    private var buttonNull: Button? = null
    private var textView: TextView? = null
    private val text: String = "kotlin application!"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
        setListeners()

    }

    private fun initialize(){

        button = findViewById(R.id.button2)
        buttonNull = findViewById(R.id.buttonNull)
        textView = findViewById(R.id.txt)

    }

    private fun setListeners(){

        button?.setOnClickListener({ displayTextInTextView(text)})
        buttonNull?.setOnClickListener({ displayTextInTextView(null)})

    }


    private fun displayTextInTextView(txt: String?){

        textView?.setText(txt)

    }
}
