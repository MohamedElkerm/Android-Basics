package com.example.myapplication

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMain7Binding
import java.net.URI

class MainActivity7 : AppCompatActivity() {

    lateinit var binding :ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        getSms()
    }


    private  fun getSms(){
        val uri = Uri.parse("content://sms//inbox")
        val projection = arrayOf(SMS_SENDER , SMS_BODY)
        val cursor :Cursor = contentResolver.query(uri , projection , null , null , null)!!
        while (cursor.moveToNext()){
            for (i in 0 until cursor.columnCount){
                Log.i(LOG_TAG, "$i - ${cursor.getColumnName(i)} - ${cursor.getString(i)}")
            }
        }
    }
    companion object {
        private  const val LOG_TAG = "Main_Activity_Elkerm"
        private  const val SMS_BODY = "body"
        private  const val SMS_SENDER = "address"
    }
}