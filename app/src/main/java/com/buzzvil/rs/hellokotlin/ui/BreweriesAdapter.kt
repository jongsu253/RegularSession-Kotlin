package com.buzzvil.rs.hellokotlin.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzvil.rs.hellokotlin.presentation.model.Brewery

class BreweriesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var breweries: List<Brewery> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        BreweriesItemViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as BreweriesItemViewHolder).onBind(breweries[position])
    }

    override fun getItemCount(): Int = breweries.size
}