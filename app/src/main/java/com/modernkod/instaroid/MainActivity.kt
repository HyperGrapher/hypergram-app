package com.modernkod.instaroid

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.modernkod.instaroid.utils.animateIt
import com.modernkod.instaroid.utils.fadeIn
import com.modernkod.instaroid.utils.flipIt
import com.modernkod.instaroid.views.CurvedBottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.v1 -> v1.flipIt()
            R.id.v2 -> v2.flipIt()
            R.id.v3 -> v3.flipIt()
            R.id.v4 -> v4.flipIt()
        }
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        v1.setOnClickListener(this)
        v2.setOnClickListener(this)
        v3.setOnClickListener(this)
        v4.setOnClickListener(this)

        val curvedBottomNavigationView = findViewById<CurvedBottomNavigationView>(R.id.bottomNavBar)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu)

        fabMain.setOnClickListener {
            fabMain.animateIt(90)

            v1.fadeIn(120)
                .andThen(v2.fadeIn(120))
                .andThen(v3.fadeIn(120))
                .andThen(v4.fadeIn(120))
                .subscribe()
        }


    }
}
