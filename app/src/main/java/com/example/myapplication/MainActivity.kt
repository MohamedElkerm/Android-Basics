package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ELKERM", "onCreate: ")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonGoToNextPage()
//        makeCall()
//        cacheThePhoneNumber()
        initSpinner()
        loadImage()
//        getTheCachingPhoneNumber()


        addListener()

    }


    private  fun addListener(){
        binding.saveData.setOnClickListener {
            val text = binding.editTextPhone.text.toString()
            saveTextToFile(text)
            Toast.makeText(this , "data saved correctly" , Toast.LENGTH_SHORT).show()
        }

    }


    private  fun saveTextToFile(text :String){
        val path = applicationInfo.dataDir
        val fileName = "sample.txt"
        val file = File("$path/$fileName")
        file.writeText(text)
    }



























//    private  fun cacheThePhoneNumber(){
//        binding.makeCall.setOnClickListener {
//            val sharedPreferences :SharedPreferences = getSharedPreferences("myData" , Context.MODE_PRIVATE)
//            val editor = sharedPreferences.edit()
//
//            editor.putString("phoneNumber" , binding.editTextPhone.text.toString())
//            editor.apply()
//            Toast.makeText(this , "cached successfully" , Toast.LENGTH_SHORT).show()
//        }
//    }

//    private  fun getTheCachingPhoneNumber(){
//        binding.saveData.setOnClickListener {
//            val sharedPreferences :SharedPreferences = getSharedPreferences("myData" , Context.MODE_PRIVATE)
//            val cachedPhoneNumber = sharedPreferences.getString("phoneNumber" , "")
//            Toast.makeText(this , cachedPhoneNumber , Toast.LENGTH_SHORT).show()
//        }
//    }





























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


    private fun loadImage() {
        val url: String = "https://wallpapers.com/images/high/yellow-light-on-the-batman-b67beech97idnbjk.webp"

        Glide.with(this).load(url).placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground).into(binding.imgViewNetwork)
    }

    private fun buttonGoToNextPage(){
        binding.navigateToNextPage.setOnClickListener {

            // explicit Intent
            val intent=Intent(this,MainActivity6::class.java)


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