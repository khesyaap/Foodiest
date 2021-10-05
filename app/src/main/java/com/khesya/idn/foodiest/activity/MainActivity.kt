package com.khesya.idn.foodiest.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.khesya.idn.foodiest.R
import com.khesya.idn.foodiest.databinding.ActivityMainBinding
import com.khesya.idn.foodiest.fragment.BreakfastFragment
import com.khesya.idn.foodiest.fragment.DessertFragment
import com.khesya.idn.foodiest.fragment.VegetarianFragment

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setCurrentFragment(BreakfastFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.Breakfast -> setCurrentFragment(BreakfastFragment())
                R.id.icVegetarian -> setCurrentFragment(VegetarianFragment())
                R.id.icDessert -> setCurrentFragment(DessertFragment())
            }
            true
        }
    }

    private fun setCurrentFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMain, fragment)
            commit()
        }
    }
}