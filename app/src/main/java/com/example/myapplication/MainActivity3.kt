package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    
    lateinit var  binding :ActivityMain3Binding

    private val trans = supportFragmentManager.beginTransaction()
    val fragOne = OneFrag()
    val fragTwo = TwoFrag()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        fabCallBack()
        initFrag()
        addNavAction()
    }

    private  fun initFrag(){
        trans.add(R.id.fragId , fragTwo)
        trans.commit()
    }


    private fun addNavAction(){
        binding.bottomNavBar.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.pageHome -> {
                    trans.remove(fragTwo)
                    trans.add(R.id.fragId , fragOne)
                    trans.commit()
                    true
                }

                R.id.pageMusic -> {
                    trans.remove(fragOne)
                    trans.add(R.id.fragId , fragTwo)
                    trans.commit()
                    true
                }

                R.id.pageProfile -> {
                    trans.remove(fragTwo)
                    trans.add(R.id.fragId , fragOne)
                    trans.commit()
                    true
                }
                else -> false
            }

        }
    }
    private  fun fabCallBack (){
        binding.FAB.setOnClickListener {
            Toast.makeText(this , "Hello Mohamed Elkerm" , Toast.LENGTH_SHORT).show()
        }
    }
}