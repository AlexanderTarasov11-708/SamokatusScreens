package com.example.samokatus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import com.example.myapplication.R
import com.example.samokatus.account.AccountFragment
import com.example.samokatus.payment.PaymentFragment
import com.example.samokatus.samokatus.SamokatusFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_samokatus ->
                    supportFragmentManager.beginTransaction().replace(container.id,
                        SamokatusFragment()
                    ).commit()
                R.id.nav_account ->  supportFragmentManager.beginTransaction().replace(container.id,
                    AccountFragment()
                ).commit()
                R.id.nav_pay -> supportFragmentManager.beginTransaction().replace(container.id,
                    PaymentFragment()
                ).commit()
            }
            true
        }
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.container,
                SamokatusFragment()
            )
            .commit()
    }
}
