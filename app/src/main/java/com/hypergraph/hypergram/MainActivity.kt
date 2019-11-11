package com.hypergraph.hypergram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hypergraph.hypergram.utils.animateIt
import com.hypergraph.hypergram.views.CurvedBottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

/**
 *  Checkout Github tag 'AnimatedBoxes' for box animation with rxJAVA and extension functions
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curvedBottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)

        fabMain.setOnClickListener {
            fabMain.animateIt(90)
        }

    }

}
