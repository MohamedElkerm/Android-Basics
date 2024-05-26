package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.OneFrag
import com.example.myapplication.TwoFrag
import com.example.myapplication.data_class.Dogs

internal class MyAdapter(
    var context: ArrayList<Dogs>,
    fm: FragmentManager,
    var totalTabs: Int) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return  totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return  when(position){
            0 -> {
                OneFrag()
            }
            1 -> {
                TwoFrag()
            }
            else -> getItem(position)
        }
    }

}