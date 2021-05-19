package com.example.kotlincouroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Lesson2 : AppCompatActivity() {
    val TAG="Lesson2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2)
        /** delay function can only be called from a couroutine unlike the sleep function*/

        GlobalScope.launch {
            val call= networkCall()
            val call2 =networkCall2()
            Log.d(TAG,call)
            Log.d(TAG,call2)
        }
    }
    suspend fun networkCall(): String{
        delay(3000)
        return "Done1"
    }
    suspend fun networkCall2(): String{
        delay(3000)
        return "Done2"
    }
}