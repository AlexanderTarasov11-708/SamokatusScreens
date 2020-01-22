package com.example.samokatus.samokatus

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.story_list_item.view.*

class StoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(name: String) {
        itemView.card_name.text = name
    }
}
