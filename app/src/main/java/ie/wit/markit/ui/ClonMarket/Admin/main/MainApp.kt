package ie.wit.markit.ui.ClonMarket.Admin.main

import android.app.Application
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderStore
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.placemark.models.ClonTraderJSONStore

class MainApp: Application(), AnkoLogger {

    lateinit var traders : ClonTraderStore

    override fun onCreate() {
        super.onCreate()
        traders = ClonTraderJSONStore(applicationContext)
        info("Markit Started")
    }
}