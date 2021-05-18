package com.example.quotivator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quotivator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.quotivateButton.setOnClickListener {
            displayQuote()
        }
    }

    private fun displayQuote() {
        Toast.makeText(this, "Quotivate button clicked!", Toast.LENGTH_SHORT).show()
    }
}