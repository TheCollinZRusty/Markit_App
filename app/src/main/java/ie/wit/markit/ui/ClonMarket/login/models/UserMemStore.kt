package ie.wit.markit.ui.ClonMarket.login.models
import android.util.Log

var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

class UserMemStore : UserStore {

    val traders = ArrayList<UserModel>()

    override fun findAll(): List<UserModel> {
        return traders
    }

    override fun findById(id:Long) : UserModel? {
        val foundDonation: UserModel? = traders.find { it.id == id }
        return foundDonation
    }

    override fun create(donation: UserModel) {
        donation.id = getId()
        traders.add(donation)
        logAll()
    }

    fun logAll() {
        Log.v("Donate","** Donations List **")
        traders.forEach { Log.v("Donate","${it}") }
    }
}