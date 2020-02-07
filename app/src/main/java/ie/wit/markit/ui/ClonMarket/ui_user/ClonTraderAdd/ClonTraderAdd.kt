package ie.wit.markit.ui.ClonMarket.ui_user.ClonTraderAdd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Main.ClonTraderApp
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderModel
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Email
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Forename
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Password
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.Surname
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.donateButton
import kotlinx.android.synthetic.main.fragment_clon_add_trader.view.produceType

class ClonTraderAdd : Fragment() {


    lateinit var app: ClonTraderApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as ClonTraderApp

//        JumploginButton.setOnClickListener() {
//            val intent = Intent(this, ClonTraderFragment::class.java)
//            startActivity(intent)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_clon_add_trader_ddmin, container, false)
        activity?.title = getString(R.string.action_donate)
        setButtonListener(root)
        return root;
    }

    fun setButtonListener( layout: View) {
        layout.donateButton.setOnClickListener {
            val Surname = layout.Surname.text.toString()
            val Forename = layout.Forename.text.toString()
            val Email = layout.Email.text.toString()
            val PhoneNumber = layout.Password.text.toString().toInt()
            val producetype = if(layout.produceType.checkedRadioButtonId == R.id.Direct) "Vegetables" else "Meats"
            app.clonTraderStore.create(ClonTraderModel(producetype = producetype,forename = Forename,surname = Surname,email = Email,number = PhoneNumber))
        }
    }
}