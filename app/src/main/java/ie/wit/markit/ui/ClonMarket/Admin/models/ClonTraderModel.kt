package ie.wit.markit.ui.ClonMarket.Admin.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClonTraderModel (var id: Long =0,
                            var title: String = "",
                            var description: String = "",
                            var email: String="",
                            var number: String="") : Parcelable {
}