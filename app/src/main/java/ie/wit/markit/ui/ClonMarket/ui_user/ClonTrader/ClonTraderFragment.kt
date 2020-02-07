package ie.wit.markit.ui.ClonMarket.ui_user.ClonTrader

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Main.ClonTraderApp
import ie.wit.markit.ui.ClonMarket.adapters.ClonTraderAdapter
import kotlinx.android.synthetic.main.fragment_clon_trader.view.*

class ClonTraderFragment : Fragment() {

    lateinit var app: ClonTraderApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as ClonTraderApp
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_clon_trader, container, false)

        root.recyclerView.setLayoutManager(LinearLayoutManager(activity))
        root.recyclerView.adapter = ClonTraderAdapter(app.clonTraderStore.findAll())

        return root
    }
}