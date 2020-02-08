package ie.wit.markit.ui.ClonMarket.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Main.ClonTraderApp
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderModel
import ie.wit.markit.ui.ClonMarket.adapters.ClonTraderAdapter
import kotlinx.android.synthetic.main.fragment_clon_add_trader_ddmin.*
import kotlinx.android.synthetic.main.fragment_clon_trader.*

class AdminAddTrader : AppCompatActivity() {
    lateinit var app: ClonTraderApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_clon_add_trader)
        app = this.application as ClonTraderApp

        donateButton.setOnClickListener {
            val Surname = Surname.text.toString()
            val Forename = Forename.text.toString()
            val Email = Email.text.toString()
            val PhoneNumber = Password.text.toString().toInt()
            val producetype = if(produceType.checkedRadioButtonId == R.id.Direct) "Vegetables" else "Meats"
            app.clonTraderStore.create(ClonTraderModel(producetype = producetype,forename = Forename,surname = Surname,email = Email,number = PhoneNumber))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_admin, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_add_trader -> {
                startActivity(Intent(this, AdminTraderView::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}