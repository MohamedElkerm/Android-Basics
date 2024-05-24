package com.example.myapplication.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.OneFrag
import com.example.myapplication.TwoFrag

internal class MyAdapter(
    var context: Context,
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