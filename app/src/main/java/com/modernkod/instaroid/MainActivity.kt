package com.modernkod.instaroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.modernkod.instaroid.views.CurvedBottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curvedBottomNavigationView =
            findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)
    }
}
