package ie.wit.markit.ui.ClonMarket.Admin.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderModel
import kotlinx.android.synthetic.main.card_trader.view.*

class TraderViewAdapter constructor(private var clonTraders: List<ClonTraderModel>): RecyclerView.Adapter<TraderViewAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_admin_trader, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val placemark = clonTraders[holder.adapterPosition]
        holder.bind(placemark)
    }

    override fun getItemCount(): Int = clonTraders.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(clonTrader: ClonTraderModel) {
            itemView.TitleList.text= clonTrader.title
            itemView.DescriptionList.text = clonTrader.description
            itemView.EmailList.text = clonTrader.email
            itemView.NumberList.text = clonTrader.number
             }
        }
    }
