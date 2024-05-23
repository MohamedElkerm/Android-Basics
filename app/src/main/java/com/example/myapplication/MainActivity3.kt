package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    
    lateinit var  binding :ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        fabCallBack()
    }

    private  fun fabCallBack (){
        binding.FAB.setOnClickListener {
            Toast.makeText(this , "Hello Mohamed Elkerm" , Toast.LENGTH_SHORT)
        }
    }
}