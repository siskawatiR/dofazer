package com.dofazer.cafe.app.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dofazer.cafe.*
import com.dofazer.cafe.app.main.fragment.ProduktifFragment
import com.dofazer.cafe.app.main.fragment.SayaFragment
import com.dofazer.cafe.app.main.fragment.ShiftFragment
import com.dofazer.cafe.app.main.fragment.BerandaFragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = MainPagerAdapter(supportFragmentManager).apply {
            addFragment(BerandaFragment.newInstance())
            addFragment(ShiftFragment.newInstance())
            addFragment(ProduktifFragment.newInstance())
            addFragment(SayaFragment.newInstance())
        }

        frame_main.adapter = pagerAdapter

        nav_main.add(MeowBottomNavigation.Model(0, R.drawable.ic_home))
        nav_main.add(MeowBottomNavigation.Model(1, R.drawable.ic_timer))
        nav_main.add(MeowBottomNavigation.Model(2, R.drawable.ic_lightbulb))
        nav_main.add(MeowBottomNavigation.Model(3, R.drawable.ic_circle_arrow_right)) //Sementara

        nav_main.setOnClickMenuListener { swapFragment(it.id) }

        nav_main.show(0)
        swapFragment(0)
    }

    private fun swapFragment(position: Int) {
        frame_main.setCurrentItem(position, false)
    }
}
