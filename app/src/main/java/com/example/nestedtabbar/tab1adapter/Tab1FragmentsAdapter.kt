package com.example.nestedtabbar.tab1adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nestedtabbar.tab1fragments.Home
import com.example.nestedtabbar.tab1fragments.Profile
import com.example.nestedtabbar.tab1fragments.Setting

class Tab1FragmentsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0 -> {
                Home()
            }
            1 -> {
                Profile()
            }
            else -> {
                Setting()
            }
        }
    }

}