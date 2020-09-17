package com.example.avramescu.codechallenges.week8.bottomnavigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.TokenWatcher
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.MenuItem
import android.widget.Toast
import com.example.avramescu.codechallenges.R
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        initFragment()
        initBottomNavListener()
    }

    private fun initFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragment1 = Tab1Fragment()
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment1).commit()
    }

    private fun initBottomNavListener() {
        bottom_nav_view.setOnNavigationItemSelectedListener(object : NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                val selectedFragment: Fragment
                when(p0.itemId) {
                    R.id.navItem1 -> {
//                        Toast.makeText(applicationContext, "Nav item 1", Toast.LENGTH_SHORT).show()
                        selectedFragment = Tab1Fragment()
                    }
                    R.id.navItem2 -> {
//                        Toast.makeText(applicationContext, "Nav item 2", Toast.LENGTH_SHORT).show()
                        selectedFragment = Tab2Fragment()
                    }
                    R.id.navItem3 -> {
//                        Toast.makeText(applicationContext, "Nav item 3", Toast.LENGTH_SHORT).show()
                        selectedFragment = Tab3Fragment()
                    }
                    else -> {
                        return false
                    }
                }
                val fragmentManager = supportFragmentManager
                fragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()
                return true
            }

        })

        bottom_nav_view.setOnNavigationItemReselectedListener(object : BottomNavigationView.OnNavigationItemReselectedListener{
            override fun onNavigationItemReselected(p0: MenuItem) {
                when(p0.itemId) {
                    R.id.navItem1 -> {
                        Toast.makeText(applicationContext, "Nav item 1 reselected", Toast.LENGTH_SHORT).show()
                    }
                    R.id.navItem2 -> {
                        Toast.makeText(applicationContext, "Nav item 2", Toast.LENGTH_SHORT).show()
                    }
                    R.id.navItem3 -> {
                        Toast.makeText(applicationContext, "Nav item 3", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }

}