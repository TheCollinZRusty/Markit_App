package ie.wit.markit.ui.ClonMarket.ui_user.ClonTrader

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.activities.TraderAdapter
import ie.wit.markit.ui.ClonMarket.Admin.activities.TraderViewAdapter
import ie.wit.markit.ui.ClonMarket.Admin.main.MainApp
import kotlinx.android.synthetic.main.admin_clon_trader_view.view.*


class ClonTraderFragment : Fragment() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as MainApp
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_clon_trader, container, false)

        root.recyclerView.setLayoutManager(LinearLayoutManager(activity))
        root.recyclerView.adapter = TraderViewAdapter(app.traders.findAll())

        return root
    }

}