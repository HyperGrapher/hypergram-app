package com.modernkod.instaroid

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.modernkod.instaroid.views.CurvedBottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curvedBottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)


        Log.i("TAG", fabMain.customSize.toString())
        fabMain.setOnClickListener { view ->
            Log.i("TAG", "PressedR")
            fabMain.imageAlpha = 65
            fabMain.customSize = 210

            Handler().postDelayed({
                    // This method will be executed once the timer is over
                    fabMain.imageAlpha = 1000
                    fabMain.customSize = 223

                },185 )

        }




    }
}
