package com.example.samokatus.samokatus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class TripAdapter: RecyclerView.Adapter<TripHolder>() {
    var trips: List<Trip> = arrayListOf(
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        ),
        Trip(
            "Круиз с безвиззовой Англией – 259€",
            "7 дней в апреле 2019 года - vandrouki"
        )
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_trip_item, parent, false)
        return TripHolder(v)
    }

    override fun getItemCount(): Int = trips.size

    override fun onBindViewHolder(holder: TripHolder, position: Int) = holder.bind(trips[position])
}