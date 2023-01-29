package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("Random Tag!", "SecondActivity : OnCreate")
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName, you will get free access to all content for one month"
        textView.text = message

    }

    override fun onStart() {
        super.onStart()
        Log.i("Random Tag!", "SecondActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Random Tag!", "SecondActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Random Tag!", "SecondActivity : OnStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Random Tag!", "SecondActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Random Tag!", "SecondActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Random Tag!", "SecondActivity : OnRestart")
    }
}