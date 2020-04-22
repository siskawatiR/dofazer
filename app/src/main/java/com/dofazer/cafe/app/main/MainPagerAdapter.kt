package com.dofazer.cafe.app.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.dofazer.cafe.customview.SmartFragmentStatePagerAdapter

class MainPagerAdapter(fm: FragmentManager) : SmartFragmentStatePagerAdapter(fm) {
    private val fragments = ArrayList<Fragment>()

    fun addFragment(fragment: Fragment){
        fragments.add(fragment)
    }

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size
}