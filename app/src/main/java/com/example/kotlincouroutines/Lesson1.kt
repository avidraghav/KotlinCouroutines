package com.example.kotlincouroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Lesson1 : AppCompatActivity() {
    val TAG:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            delay(5000L)
            /**delay stops the execution just like sleep in Thread.
             * Delay pauses the execution of couroutine unlike sleep which blocks the exection of thread*/

            Log.d(TAG,"Couroutine says from thread ${Thread.currentThread().name}")
        }
        Log.d(TAG,"Hello from Thread ${Thread.currentThread().name}")
    }
}