package com.example.recyclerviewejemplo.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewejemplo.R
import com.example.recyclerviewejemplo.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }
}