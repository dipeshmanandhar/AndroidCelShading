package com.peshbros.AndroidCelShading

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Window

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var textView = TextView(this)
        textView.setText("Hello world")
        setContentView(textView)
    }
}