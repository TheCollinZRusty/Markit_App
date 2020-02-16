package ie.wit.markit.ui.ClonMarket.Admin.models


interface ClonTraderStore {
    fun findAll(): List<ClonTraderModel>
    fun create(clonTrader: ClonTraderModel)
    fun delete(clonTrader: ClonTraderModel)
    fun update(clonTrader: ClonTraderModel)
}
