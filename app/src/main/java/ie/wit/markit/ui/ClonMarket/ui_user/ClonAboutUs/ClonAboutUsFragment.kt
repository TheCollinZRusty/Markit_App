package ie.wit.markit.ui.ClonMarket.ui_user.ClonAboutUs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


//import ie.wit.markit.ui.ClonMarket.Main.MainApp

class ClonLocation : Fragment() {

//    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        app = activity?.application as MainApp
//        (activity as AppCompatActivity).supportActionBar!!.hide()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(ie.wit.R.layout.fragment_market_bio, container, false)
        activity?.title = getString(ie.wit.R.string.action_add_trader)
        return root;
    }
}