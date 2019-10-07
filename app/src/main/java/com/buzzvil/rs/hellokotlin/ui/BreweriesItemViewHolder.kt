package com.buzzvil.rs.hellokotlin.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.buzzvil.rs.hellokotlin.R
import com.buzzvil.rs.hellokotlin.presentation.model.Brewery

class BreweriesItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.breweries_item_view,
        parent,
        false
    )
) {

    private val name = itemView.findViewById<TextView>(R.id.name)
    private val type = itemView.findViewById<TextView>(R.id.type)
    private val street = itemView.findViewById<TextView>(R.id.street)

    fun onBind(brewery: Brewery) {
        name.text = brewery.name
        type.text = brewery.type
        street.text = brewery.street
    }
}