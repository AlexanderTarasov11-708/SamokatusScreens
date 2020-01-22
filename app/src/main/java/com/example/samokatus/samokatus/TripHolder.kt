package com.example.samokatus.samokatus

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.story_trip_item.view.*

class TripHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(trip: Trip) {
        itemView.card_title.text = trip.name
        itemView.card_description.text = trip.desc
    }
}