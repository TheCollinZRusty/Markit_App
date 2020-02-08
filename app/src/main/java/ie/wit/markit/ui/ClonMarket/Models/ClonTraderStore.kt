package ie.wit.markit.ui.ClonMarket.Models

interface ClonTraderStore {
    fun findAll() : List<ClonTraderModel>
    fun findById(id: Long) : ClonTraderModel?
    fun create(trader: ClonTraderModel)
    //fun update(donation: DonationModel)
    //fun delete(donation: DonationModel)
}