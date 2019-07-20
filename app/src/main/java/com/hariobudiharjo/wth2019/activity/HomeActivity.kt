package com.hariobudiharjo.wth2019.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.hariobudiharjo.wth2019.R
import com.hariobudiharjo.wth2019.fragment.EndFragment
import com.hariobudiharjo.wth2019.fragment.HomeFragment
import com.hariobudiharjo.wth2019.fragment.MidFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    lateinit var currentFragment: Fragment

    lateinit var ft: FragmentTransaction
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                currentFragment = HomeFragment()
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.fl_main, currentFragment)
                ft.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_mid -> {
                currentFragment = MidFragment()
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.fl_main, currentFragment)
                ft.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_end -> {
                currentFragment = EndFragment()
                ft = supportFragmentManager.beginTransaction()
                ft.replace(R.id.fl_main, currentFragment)
                ft.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        currentFragment = HomeFragment()

        ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fl_main, currentFragment)
        ft.commit()

        nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
