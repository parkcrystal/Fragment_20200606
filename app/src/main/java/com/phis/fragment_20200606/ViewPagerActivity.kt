package com.phis.fragment_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phis.fragment_20200606.adapters.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : BaseActivity() {

    lateinit var myAdapter : MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }




}
