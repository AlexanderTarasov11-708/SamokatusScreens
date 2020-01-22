package com.example.samokatus.account

class EventItem(val title: String, val money: String) : ListItem() {
    override val type: Int
        get() = TYPE_EVENT
}
