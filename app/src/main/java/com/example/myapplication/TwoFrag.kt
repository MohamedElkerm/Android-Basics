package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragTwoBinding

class TwoFrag:Fragment() {

    lateinit var binding :FragTwoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragTwoBinding.inflate(inflater , container , false)
        return binding.root


    }
}