package ie.wit.markit.ui.ClonMarket.Models

import android.util.Log

var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

class ClonTraderMemStore : ClonTraderStore {

    val donations = ArrayList<ClonTraderModel>()

    override fun findAll(): List<ClonTraderModel> {
        return donations
    }

    override fun findById(id:Long) : ClonTraderModel? {
        val foundDonation: ClonTraderModel? = donations.find { it.id == id }
        return foundDonation
    }

    override fun create(trader: ClonTraderModel) {
        trader.id = getId()
        donations.add(trader)
        logAll()
    }


    fun logAll() {
        Log.v("Donate","** Donations List **")
        donations.forEach { Log.v("Donate","${it}") }
    }
}