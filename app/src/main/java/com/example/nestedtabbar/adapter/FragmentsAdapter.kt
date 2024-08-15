package com.example.nestedtabbar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nestedtabbar.fragments.Tab1
import com.example.nestedtabbar.fragments.Tab2
import com.example.nestedtabbar.fragments.Tab3

class FragmentsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0 -> {
                Tab1()
            }
            1 -> {
                Tab2()
            }
            else -> {
                Tab3()
            }
        }
    }

}