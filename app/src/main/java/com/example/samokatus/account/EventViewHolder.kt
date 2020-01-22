package com.example.samokatus.account

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.transfer_item.view.*
import java.lang.Character.isDigit

class EventViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(eventItem: EventItem) {
        itemView.title.text = eventItem.title
        itemView.event_money.text = eventItem.money.toString()
        if (eventItem.money[0] == '+' || eventItem.money[0] == '-') {
            itemView.event_icon.setImageResource(R.drawable.income)
            itemView.event_money.setTextColor(Color.parseColor("#008577"))
        } else {
            itemView.event_icon.setImageResource(R.drawable.outcome)
            itemView.event_money.setTextColor(Color.BLACK)
        }
    }
}
