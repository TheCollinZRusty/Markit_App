package ie.wit.markit.ui.ClonMarket.ui_user.ClonLocation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Main.ClonTraderApp
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderModel
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.*

class ClonLocation : Fragment() {

    lateinit var app: ClonTraderApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as ClonTraderApp
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_clon_location, container, false)
        activity?.title = getString(R.string.action_add_trader)
        return root;
    }
}


