package com.example.hw_53

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class OnBordFragment() : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    private val adapter = onBoardAdapter( this::onStartClick)
    private lateinit var pref: Pref


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOnBoardBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pref=Pref(requireContext())
        binding.viewPager.adapter=adapter
        setIndicator()
    }

    private fun setIndicator() {
        val indicator: CircleIndicator3=binding.indicator
        val viewPager = binding.viewPager
        indicator.setViewPager(viewPager)
    }

    private fun onStartClick(){
        pref.saveSeen()
        findNavController().navigateUp()
    }

}