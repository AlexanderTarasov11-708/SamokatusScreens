package com.example.samokatus.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class StoryAdapter : RecyclerView.Adapter<StoryHolder>() {
    var stories: List<String> = arrayListOf("Подписки","Авиабилеты","Туры","Отели","Флекс","Мемы")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_list_item, parent, false)
        return StoryHolder(v)
    }

    override fun getItemCount(): Int = stories.size

    override fun onBindViewHolder(holder: StoryHolder, position: Int) = holder.bind(stories[position])
}
