package ie.wit.markit.ui.ClonMarket.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.activities.AdminTrader
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        loginButton.setOnClickListener() {
            val intent = Intent(this, AdminTrader::class.java)
            startActivity(intent)
        }
        SignUpButton.setOnClickListener() {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}