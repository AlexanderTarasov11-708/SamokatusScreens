package com.example.samokatus.account

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class TransferAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var trips: List<ListItem> = arrayListOf(
        HeaderItem("ВЧЕРА"),
        EventItem(
            "Зарплата",
            "+ 22 578,81 \u20BD"
        ),
        EventItem("Вывод денег", "- 1 050 \u20BD"),
        HeaderItem("29 СЕНТЯБРЯ, ПН"),
        EventItem("Вывод денег", "- 1 750 \u20BD"),
        EventItem("Бонусы", "+ 54,10 \u20BD"),
        HeaderItem("25 СЕНТЯБРЯ, ПН"),
        EventItem("Аванс", "+ 20 000 \u20BD")
    )

    override fun getItemViewType(position: Int): Int {
        return trips[position].type
    }

    override fun getItemCount(): Int = trips.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == ListItem.TYPE_HEADER) {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.header_item, parent, false)
            return HeaderViewHolder(itemView)
        } else {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.transfer_item, parent, false)
            return EventViewHolder(itemView)
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val type = getItemViewType(position)
        if (type == ListItem.TYPE_HEADER) {
            val header = trips[position] as HeaderItem
            val holder = viewHolder as HeaderViewHolder
            holder.bind(header)
        } else {
            val event = trips[position] as EventItem
            val holder = viewHolder as EventViewHolder
            holder.bind(event)
        }
    }
}
