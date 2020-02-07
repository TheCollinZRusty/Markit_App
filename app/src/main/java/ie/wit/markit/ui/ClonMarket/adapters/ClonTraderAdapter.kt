package ie.wit.markit.ui.ClonMarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.wit.R
import ie.wit.markit.ui.ClonMarket.Models.ClonTraderModel
import kotlinx.android.synthetic.main.card_trader.view.*



class ClonTraderAdapter constructor(private var donations: List<ClonTraderModel>)
    : RecyclerView.Adapter<ClonTraderAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card_trader,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val donation = donations[holder.adapterPosition]
        holder.bind(donation)
    }

    override fun getItemCount(): Int = donations.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(clontrader: ClonTraderModel) {
            itemView.Forename.text = clontrader.forename
            itemView.Surname.text = clontrader.surname
            itemView.producetype.text = clontrader.producetype
            itemView.imageIcon.setImageResource(R.mipmap.ic_launcher_round)
        }
    }
}