package com.example.appirfan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag)

        val fragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if(fragment !is HomeFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.container,homeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}