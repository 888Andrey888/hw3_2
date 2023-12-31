package com.example.hw3_2a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3_2a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.fl_container, FirstFragment()).commit()
    }
}