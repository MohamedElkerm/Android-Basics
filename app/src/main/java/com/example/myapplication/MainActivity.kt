package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.d("ELKERM", "onCreate: ")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonGoToNextPage()
        makeCall()

        initSpinner()

    }


    private fun initSpinner(){
        val items = listOf("A" , "B" , "C" , "D" , "E")
        val myAdapter = ArrayAdapter(this , R.layout.spinner_items , items)
        binding.sppinner.apply {
            adapter = myAdapter
            onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    Toast.makeText(this@MainActivity , items[p2] , Toast.LENGTH_SHORT ).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }


    }






















    private fun buttonGoToNextPage(){
        binding.navigateToNextPage.setOnClickListener {

            // explicit Intent
            val intent=Intent(this,MainActivity2::class.java)


            // implicit Intent
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://developer.android.com/guide/components/activities/activity-lifecycle")

            startActivity(intent)

        }
    }



    private fun makeCall(){
        var phoneNumber = binding.editTextPhone.text
        binding.makeCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${phoneNumber}")
            startActivity(intent)
        }
    }









    override fun onStart() {
        super.onStart()
        Log.d("ELKERM", "onStart: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ELKERM", "onPause: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ELKERM", "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ELKERM", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ELKERM", "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ELKERM", "onDestroy: ")
    }

}