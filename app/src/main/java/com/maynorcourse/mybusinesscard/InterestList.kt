package com.maynorcourse.mybusinesscard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class InterestList : RecyclerView.Adapter<InterestList.ViewHolder> {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val inflater: LayoutInflater
    private val data: List<Interest>
    constructor(context: Context, data: List<Interest>) {
        this.data = data
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(inflater.inflate(R.layout.interest_item, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.descr).text = data[position].description
        holder.itemView.findViewById<ImageView>(R.id.icon).setImageResource( data[position].iconId)
    }
}