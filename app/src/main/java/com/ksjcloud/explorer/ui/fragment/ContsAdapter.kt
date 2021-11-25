package com.ksjcloud.explorer.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ksjcloud.explorer.ui.base.baseFragment

open class ContsAdapter(fragmentActivity: FragmentActivity, baseFragments: ArrayList<baseFragment>) :
    FragmentStateAdapter(fragmentActivity) {

    private var fragments:ArrayList<baseFragment> = baseFragments

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemCount(): Int {
        return fragments.size
    }


}