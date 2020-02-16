package ie.wit.markit.ui.ClonMarket.Admin.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.main.MainApp
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderModel
import kotlinx.android.synthetic.main.activity_admin_view.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivityForResult

class AdminTrader : AppCompatActivity(), ClickListener {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setSupportActionBar(toolbar)
        setContentView(R.layout.activity_admin_view)
        app = application as MainApp

        //layout and populate for display
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.adapter = TraderAdapter(app.traders.findAll(),this)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_add -> startActivityForResult<AdminAddTrader>(0)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun click(clonTrader: ClonTraderModel) {
        startActivityForResult(intentFor<AdminAddTrader>().putExtra("trader_edit", clonTrader), 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //recyclerView is a widget in activity_placemark_list.xml
        recyclerView.adapter?.notifyDataSetChanged()
        super.onActivityResult(requestCode, resultCode, data)
    }

}