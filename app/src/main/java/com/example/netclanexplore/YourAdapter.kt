package com.example.netclanexplore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class YourAdapter(private val context: Context, private val dataList: List<YourDataModel>) :
    RecyclerView.Adapter<YourAdapter.YourViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YourViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.box, parent, false)
        return YourViewHolder(view)
    }

    override fun onBindViewHolder(holder: YourViewHolder, position: Int) {
        val data = dataList[position]

        // Bind your data to views in thet ViewHolder
       holder.nameTextView.setText(data.name)
       holder.cityTextView.setText(data.city)
       holder.details.setText(data.detail)
       holder.typeTextview.setText(data.type)

        // Bind other views similarly...

        // You can also set click listeners or perform other operations here
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    // ViewHolder class to hold references to the views
    class YourViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var nameTextView: TextView = itemView.findViewById(R.id.name)
        var cityTextView: TextView = itemView.findViewById(R.id.city)
        var typeTextview: TextView = itemView.findViewById(R.id.type)
        var details: TextView = itemView.findViewById((R.id.detail))

    }
}
