package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private val trans = supportFragmentManager.beginTransaction()

    private val myFirstFragment = OneFrag()
    private val mySecondFragment = TwoFrag()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initSubView()
        initButton()
    }

    private fun  initSubView(){
        addFragment( myFirstFragment)
    }

    private fun initButton(){
        binding.changeFragments.setOnClickListener {
            trans.remove(mySecondFragment)
            trans.commit()

        }
    }

    private fun addFragment(myFrag:Fragment){
        trans.add(R.id.fragment_container,myFrag)
        trans.commit()

    }





}






