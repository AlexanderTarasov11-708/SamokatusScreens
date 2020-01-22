package com.example.samokatus.samokatus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.samokatus.MainActivity
import com.example.myapplication.R
import com.example.samokatus.account.TransferAdapter
import kotlinx.android.synthetic.main.fragment_samokat.*
import kotlinx.android.synthetic.main.toolbar_samocat.*

class SamokatusFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_samokat, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).setSupportActionBar(tool_bar)
        rv_story_list.adapter = StoryAdapter()
        rv_trip_list.adapter = TripAdapter()
    }
}