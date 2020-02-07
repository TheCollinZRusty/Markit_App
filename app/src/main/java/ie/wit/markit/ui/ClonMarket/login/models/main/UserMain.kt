package ie.wit.markit.ui.ClonMarket.login.models.main

import android.app.Application
import android.util.Log
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderMemStore
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderStore
import ie.wit.markit.ui.ClonMarket.login.models.UserMemStore
import ie.wit.markit.ui.ClonMarket.login.models.UserStore

class UserMain : Application() {

    lateinit var userStore: UserStore

    override fun onCreate() {
        super.onCreate()
        userStore = UserMemStore()
        Log.v("Donate","Donation App started")
    }
}