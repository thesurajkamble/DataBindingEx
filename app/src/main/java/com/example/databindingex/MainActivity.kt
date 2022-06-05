package com.example.databindingex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnSubmit.setOnClickListener{
            dispalyGreetings()
        }
    }

    private fun dispalyGreetings() {
        binding.apply {
            textview.setText("Hello "+ etName.text)
        }
    }
}