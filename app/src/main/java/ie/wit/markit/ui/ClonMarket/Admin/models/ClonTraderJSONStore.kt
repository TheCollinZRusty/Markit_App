package org.wit.placemark.models

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderModel
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderStore
import org.jetbrains.anko.AnkoLogger
import org.wit.placemark.helpers.exists
import org.wit.placemark.helpers.read
import org.wit.placemark.helpers.write
import java.nio.file.Files.exists
import java.util.*

val JSON_FILE = "placemarks.json"
val gsonBuilder = GsonBuilder().setPrettyPrinting().create()
val listType = object : TypeToken<java.util.ArrayList<ClonTraderModel>>() {}.type

fun generateRandomId(): Long {
    return Random().nextLong()
}

class ClonTraderJSONStore : ClonTraderStore, AnkoLogger {

    val context: Context
    var traders = mutableListOf<ClonTraderModel>()

    constructor (context: Context) {
        this.context = context
        if (exists(context, JSON_FILE)) {
            deserialize()
        }
    }

    override fun findAll(): MutableList<ClonTraderModel> {
        return traders
    }

    override fun create(clonTrader: ClonTraderModel) {
        clonTrader.id = generateRandomId()
        traders.add(clonTrader)
        serialize()
    }


    override fun update(trader: ClonTraderModel) {
        val traderList = findAll() as ArrayList<ClonTraderModel>
        var foundTrader: ClonTraderModel? = traderList.find { p -> p.id == trader.id }
        if (foundTrader != null) {
            foundTrader.title = trader.title
            foundTrader.description = trader.description
            foundTrader.email = trader.email
            foundTrader.number = trader.number
        }
        serialize()
    }

    private fun serialize() {
        val jsonString = gsonBuilder.toJson(traders, listType)
        write(context, JSON_FILE, jsonString)
    }
    override fun delete(clonTrader: ClonTraderModel) {
        traders.remove(clonTrader)
        serialize()
    }

    private fun deserialize() {
        val jsonString = read(context, JSON_FILE)
        traders = Gson().fromJson(jsonString, listType)
    }
}