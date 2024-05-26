package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.MyAdapter
import com.example.myapplication.adapter.MyRecyclerAdapter
import com.example.myapplication.data_class.Dogs

class MainActivity6 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList :ArrayList<Dogs>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
        )
        heading = arrayOf(
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",

            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",

            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
            "Hello, my name is mohamed elkerm and im SWE @ EELU as mobile developer using flutter framework",
        )

        newRecyclerView = findViewById(R.id.myRecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Dogs>()
        getDogData()

    }

    private  fun getDogData(){
        for (i in imageId.indices){
            val dogs = Dogs(imageId[i] , heading[i])
            newArrayList.add(dogs)
        }
        newRecyclerView.adapter = MyRecyclerAdapter(newArrayList)
    }
}