package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "On Create");
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "On resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "On pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "On destroy")
    }
}