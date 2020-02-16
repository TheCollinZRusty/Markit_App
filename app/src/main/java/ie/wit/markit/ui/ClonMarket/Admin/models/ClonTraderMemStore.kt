package ie.wit.markit.ui.ClonMarket.Admin.models

//import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderStore
//import org.jetbrains.anko.AnkoLogger
//import org.jetbrains.anko.info
//
//var lastId = 0L
//
//internal fun getId(): Long {
//    return lastId++
//}
//
//class ClonTraderMemStore : ClonTraderStore, AnkoLogger {
//
//    val traders = ArrayList<ClonTraderModel>()
//
//    override fun findAll(): List<ClonTraderModel> {
//        return traders
//    }
//
//    override fun create(clonTrader: ClonTraderModel) {
//        clonTrader.id = getId()
//        traders.add(clonTrader)
//        logAll()
//    }
//
//    override fun update(clonTrader: ClonTraderModel) {
//        var foundClonTrader: ClonTraderModel? = traders.find { p -> p.id == clonTrader.id }
//        if (foundClonTrader != null) {
//            foundClonTrader.title = clonTrader.title
//            foundClonTrader.description = clonTrader.description
//            logAll()
//        }
//    }
//
//    fun logAll() {
//        traders.forEach { info("${it}") }
//    }
//}