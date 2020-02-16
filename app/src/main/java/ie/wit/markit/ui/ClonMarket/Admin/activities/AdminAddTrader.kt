package ie.wit.markit.ui.ClonMarket.Admin.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.main.MainApp
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderModel
import kotlinx.android.synthetic.main.activity_admin_add.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class AdminAddTrader : AppCompatActivity(), AnkoLogger {

    var trader = ClonTraderModel()
    lateinit var app: MainApp
    var edit = false
    val IMAGE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_add)
//        setSupportActionBar(toolbar)
        app = application as MainApp

        if (intent.hasExtra("trader_edit"))
        {
            trader = intent.extras.getParcelable<ClonTraderModel>("trader_edit")
            traderTitle.setText(trader.title)
            traderDesc.setText(trader.description)
            traderEmail.setText(trader.email)
            traderNumber.setText(trader.number)
            btnAdd.setText(R.string.button_save)
            edit = true
        }

        btnAdd.setOnClickListener() {
            trader.title = traderTitle.text.toString()
            trader.description = traderDesc.text.toString()
            trader.email = traderEmail.text.toString()
            trader.number = traderNumber.text.toString()
            if (trader.title.isNotEmpty()) {
                if (edit){
                    app.traders.update(trader.copy())
                }
                else {
                    app.traders.create(trader.copy())
                }
                info("Add Button Pressed. name: ${trader.title}")
                setResult(AppCompatActivity.RESULT_OK)
                finish()
            }
            else {
                toast (R.string.message_enter_title)
            }
        }

//        chooseImage.setOnClickListener{
//            showImagePicker(this, IMAGE_REQUEST)
//        }

        //Add action bar and set title
//        toolbarAdd.title = title
//        setSupportActionBar(toolbarAdd)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_placemark, menu)
        return super.onCreateOptionsMenu(menu)    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_cancel -> finish()
            R.id.item_delete -> {
                app.traders.delete(trader)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode){
            IMAGE_REQUEST -> {
                if (data !=null){

                }
            }
        }
    }
}