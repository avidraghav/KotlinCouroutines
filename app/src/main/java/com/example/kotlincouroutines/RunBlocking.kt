package com.example.kotlincouroutines

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_run_blocking.*
import kotlinx.coroutines.*

class RunBlocking : AppCompatActivity() {
    val TAG="runBlocking"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_run_blocking)

        /** run blocking blocks the main thread
         *  A suspend function (delay()) can only be called from another suspend function
         *  but if delay() needs to be called from main then we use runBlocking()*/


        button.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
        }
        runBlocking { delay(5000) }
    }
}