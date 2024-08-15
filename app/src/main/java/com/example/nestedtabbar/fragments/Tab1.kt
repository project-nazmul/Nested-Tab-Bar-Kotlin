package com.example.nestedtabbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.nestedtabbar.R
import com.example.nestedtabbar.databinding.ActivityMainBinding
import com.example.nestedtabbar.databinding.FragmentTab1Binding
import com.example.nestedtabbar.tab1adapter.Tab1FragmentsAdapter
import com.google.android.material.tabs.TabLayout


class Tab1 : Fragment() {
    private  lateinit var binding: FragmentTab1Binding
    private lateinit var adapter: Tab1FragmentsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTab1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = Tab1FragmentsAdapter(parentFragmentManager,lifecycle)
        binding.viewPager1.adapter = adapter
        binding.tabLayout1.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.viewPager1.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
        binding.viewPager1.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout1.selectTab(binding.tabLayout1.getTabAt(position))
            }
        })
    }
}