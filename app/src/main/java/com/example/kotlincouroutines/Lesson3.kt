package com.example.kotlincouroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_lesson3.*
import kotlinx.coroutines.*

class Lesson3 : AppCompatActivity() {
    val TAG="ContextSwitching"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson3)
        /**Context switching in Couroutines*/

//        Dispatchers.IO is used when network calls, operation on databases are made
        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG,"Starting from thread ${Thread.currentThread().name}")
            val value = networkCall()

            // Context switching
            withContext(Dispatchers.Main){
                textView.text=value
                Log.d(TAG,"Printing from thread ${Thread.currentThread().name}")
            }
        }
    }

    suspend fun networkCall(): String{
        delay(3000)
        return "Done1"
    }
}