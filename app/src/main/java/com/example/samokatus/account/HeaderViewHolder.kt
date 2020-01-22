package com.example.samokatus.account

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.header_item.view.*

class HeaderViewHolder(override val containerView: View) :
    RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bind(headerItem: HeaderItem) {
        itemView.title.text = headerItem.date
    }
}
