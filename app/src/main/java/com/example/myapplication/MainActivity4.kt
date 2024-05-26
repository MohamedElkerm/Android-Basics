package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.adapter.MyAdapter
import com.example.myapplication.databinding.ActivityMain4Binding
import com.google.android.material.tabs.TabLayout

class MainActivity4 : AppCompatActivity() {


    private  lateinit var tabLayOut:TabLayout
    private  lateinit var viewPager: ViewPager

    private lateinit var binding: ActivityMain4Binding

    val fragOne = OneFrag()
    val fragTwo = TwoFrag()
    val trans:FragmentTransaction = supportFragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        tabLayOut = binding.tabLayout
        viewPager = binding.viewPager

        tabLayOut.addTab(tabLayOut.newTab().setText("Home"))
        tabLayOut.addTab(tabLayOut.newTab().setText("settings"))

        tabLayOut.tabGravity = TabLayout.GRAVITY_FILL

//        val adapter = MyAdapter(this , supportFragmentManager , tabLayOut.tabCount)
//        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayOut))
        tabLayOut.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })


    }
}