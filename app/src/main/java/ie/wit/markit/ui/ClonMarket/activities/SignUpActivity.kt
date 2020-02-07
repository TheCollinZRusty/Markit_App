package ie.wit.markit.ui.ClonMarket.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.login.models.UserModel
import ie.wit.markit.ui.ClonMarket.login.models.main.UserMain
import kotlinx.android.synthetic.main.activity_sign_up.view.*
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Email
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Forename
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Password
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Surname

class SignUpActivity : AppCompatActivity() {

    lateinit var app: UserMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)




        //        loginButton.setOnClickListener() {
//            val intent = Intent(this, UserMainActivity::class.java)
//            startActivity(intent)
//        }
//        SignUpButton.setOnClickListener() {
//            val intent = Intent(this, UserMainActivity::class.java)
//            startActivity(intent)
//        }
        fun setButtonListener(layout: View) {
            layout.AddSignUpButton.setOnClickListener {
                val Surname = layout.Surname.text.toString()
                val Forename = layout.Forename.text.toString()
                val Email = layout.Email.text.toString()
                val Password = layout.Password.text.toString()
//                val producetype =
//                    if (layout.produceType.checkedRadioButtonId == R.id.Direct) "Vegetables" else "Meats"
                app.userStore.create(UserModel(forename = Forename, surname = Surname, email = Email, password = Password))
            }
        }
    }
}
