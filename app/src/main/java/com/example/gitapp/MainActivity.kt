package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.gitapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            buttonCount.setOnClickListener { count() }
            buttonToast.setOnClickListener { Toast.makeText(this@MainActivity,"$counter", Toast.LENGTH_SHORT).show() }
        }
    }


    private fun count() {
        counter++
        binding.number.text = counter.toString()
    }

}