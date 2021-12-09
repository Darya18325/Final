package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
import java.text.DecimalFormat

@Suppress("SpellCheckingInspection")
class MainActivity : AppCompatActivity() {


    lateinit var bottomNavigationMenu: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.calculator -> {
                    fragment = calculator()

                }
                R.id.info -> {
                    fragment = InfoFragment()
                }
            }
            replaceFragment(fragment!!)
            true

        }








    }


    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container , fragment)
            .addToBackStack(fragment.tag)
            .commit()

    }

}
