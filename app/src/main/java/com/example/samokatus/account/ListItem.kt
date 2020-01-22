package com.example.samokatus.account

abstract class ListItem {

    abstract val type: Int

    companion object {

        val TYPE_HEADER = 0
        val TYPE_EVENT = 1
    }
}
