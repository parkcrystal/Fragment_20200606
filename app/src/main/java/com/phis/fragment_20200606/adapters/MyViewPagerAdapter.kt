package com.phis.fragment_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragment_20200606.fragments.FirstFragment
import com.phis.fragment_20200606.fragments.SencondFragment
import com.phis.fragment_20200606.fragments.ThirdFragment

class MyViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        }
        else if (position == 1) {
            return SencondFragment()
        }
        else {
            return ThirdFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}