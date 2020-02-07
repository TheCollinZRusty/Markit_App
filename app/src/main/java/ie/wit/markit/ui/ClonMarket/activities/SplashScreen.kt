package ie.wit.markit.ui.ClonMarket.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import ie.wit.R
import kotlinx.android.synthetic.main.splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

//        splash_logo.setImageResource(R.drawable.markit_logo_background)

        val SPLASH_TIME_OUT = 2000
        val homeIntent = Intent(this@SplashScreen, InitialScreen::class.java)
        Handler().postDelayed({
            //Do some stuff here, like implement deep linking
            startActivity(homeIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

}