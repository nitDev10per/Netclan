package com.example.netclanexplore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class personal : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: YourAdapter
    var dataList = ArrayList<YourDataModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_personal, container, false)

        recyclerView = view.findViewById(R.id.recycle1)

        // Create and set up the adapter with your data
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))
        dataList.add(YourDataModel(R.drawable.ic_launcher_foreground,"Ketan Swarnkar","Indor | Production Team Lead","100-200 m","Coffee | Business | Friedship","Hi community! I am open to new connections "))

        adapter = YourAdapter(requireContext(), dataList)

        // Set the adapter to the RecyclerView
        recyclerView.adapter = adapter

        // You may also set a layout manager if needed, e.g., LinearLayoutManager
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return view
    }
}

