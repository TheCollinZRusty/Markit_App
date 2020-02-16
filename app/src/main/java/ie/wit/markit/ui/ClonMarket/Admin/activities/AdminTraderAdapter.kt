package ie.wit.markit.ui.ClonMarket.Admin.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Admin.models.ClonTraderModel
import kotlinx.android.synthetic.main.card_trader.view.*

interface ClickListener {
    fun click(clonTrader: ClonTraderModel)
}

class TraderAdapter constructor(private var clonTraders: List<ClonTraderModel>,
                                private val listener: ClickListener) : RecyclerView.Adapter<TraderAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_trader, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val placemark = clonTraders[holder.adapterPosition]
        holder.bind(placemark, listener)
    }

    override fun getItemCount(): Int = clonTraders.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(clonTrader: ClonTraderModel, listener : ClickListener) {
            itemView.TitleList.text= clonTrader.title
            itemView.DescriptionList.text = clonTrader.description
            itemView.EmailList.text = clonTrader.email
            itemView.NumberList.text = clonTrader.number
            itemView.setOnClickListener { listener.click(clonTrader) }
        }
    }
}