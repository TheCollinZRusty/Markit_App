package ie.wit.markit.ui.ClonMarket.Main

import android.app.Application
import android.util.Log
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderMemStore
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderStore

class ClonTraderApp : Application() {

    lateinit var clonTraderStore: ClonTraderStore

    override fun onCreate() {
        super.onCreate()
        clonTraderStore = ClonTraderMemStore()
        Log.v("Donate","Donation App started")
    }
}