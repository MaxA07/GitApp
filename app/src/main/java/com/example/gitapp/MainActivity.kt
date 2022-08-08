package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import com.example.gitapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            buttonCount.setOnClickListener { count() }
            buttonToast.setOnClickListener { Toast.makeText(this@MainActivity,"$counter", Toast.LENGTH_SHORT).show() }
        }

        if (savedInstanceState == null) {
            counter = 0
        }
        else {
            counter = savedInstanceState.getInt(KEY_COUNTER)
        }
        renderState()
    }




    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNTER, counter)
    }


    private fun count() {
        counter++
        binding.number.text = counter.toString()
    }

    private fun renderState() {
        binding.number.text = counter.toString()
    }

    companion object {
        @JvmStatic private val KEY_COUNTER = "COUNTER"
    }

}