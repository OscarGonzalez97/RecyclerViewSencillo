package com.example.recyclerviewejemplo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewejemplo.R
import com.example.recyclerviewejemplo.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // esta clase provee una referencia a las vistas por cada item
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /*El administrador de diseño llama al método onCreateViewHolder()
    a fin de crear nuevas interfaces de vista para RecyclerView
    (cuando no hay contenedores de vistas existentes que puedan reutilizarse).
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // obtén una instancia de LayoutInflater a partir del contexto proporcionado (context de parent).
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false) // inflamos el layout de nuestros items

        return ItemViewHolder(adapterLayout)
    }

    // para saber cuantos elementos hay en total
    override fun getItemCount(): Int {
        return dataset.size
    }
    // reemplaza el contenido de la vista

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResource)
    }
}