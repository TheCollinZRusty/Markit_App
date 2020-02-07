package ie.wit.markit.ui.ClonMarket.login.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(var id: Long = 0,
                           val forename: String = "",
                           val surname:  String = "",
                           val email: String = "",
                           val password: String = "") : Parcelable