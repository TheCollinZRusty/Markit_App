package ie.wit.markit.ui.ClonMarket.login.models

import ie.wit.markit.ui.ClonMarket.Models.ClonTraderModel

interface UserStore {
    fun findAll() : List<UserModel>
    fun findById(id: Long) : UserModel?
    fun create(donation: UserModel)
    //fun update(donation: DonationModel)
    //fun delete(donation: DonationModel)
}