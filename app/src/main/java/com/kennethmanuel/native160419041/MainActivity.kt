package com.kennethmanuel.native160419041

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "I am a Toast message", Toast.LENGTH_SHORT).show()
    }
    fun callMe() {
        println("Printing from callMe() function.")
        println("This is cool (still printing from inside).")
    }
    fun printABC(){
        println("ABC")
    }
}