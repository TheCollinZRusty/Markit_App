package ie.wit.markit.ui.ClonMarket.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClonTraderModel(var id: Long = 0,
                           val producetype: String = "N/A",
                           val forename: String = "",
                           val surname: String = "",
                           val email: String = "",
                           val number: Int = 0) : Parcelable
