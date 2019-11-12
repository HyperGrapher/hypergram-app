package com.hypergraph.hypergram

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.hypergraph.hypergram.utils.moveIt
import com.hypergraph.hypergram.views.CurvedBottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

/**
 *  Checkout Github tag 'AnimatedBoxes' for box animation with rxJAVA and extension functions
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_main)

        val curvedBottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)

        var hidden = false
        btn.setOnClickListener {
            val height = bottomNavBar.height.toFloat()
            if (!hidden) {
                bottomNavBar.moveIt(height, hidden)
                hidden = true
            } else {
                bottomNavBar.moveIt(0f, hidden)
                hidden = false
            }
        }

        fabMain.setOnClickListener {
            println("btn")

        }

    }

}
