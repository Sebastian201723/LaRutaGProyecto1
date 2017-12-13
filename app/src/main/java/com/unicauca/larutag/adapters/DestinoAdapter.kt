package com.unicauca.larutag.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.unicauca.larutag.R
import com.unicauca.larutag.databinding.TemplateDestinoBinding
import com.unicauca.larutag.models.destino
import com.unicauca.larutag.util.inflate

/**
 * Created by Sebastian on 09/12/2017.
 */
class DestinoAdapter:RecyclerView.Adapter<DestinoViewHolder>(){

    var data:List<destino> = emptyList()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: DestinoViewHolder, position: Int) {
            holder.binding.destino = data[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinoViewHolder
    = DestinoViewHolder(parent.inflate(R.layout.template_destino))

    override fun getItemCount(): Int = data.size
}

class DestinoViewHolder(view:View): RecyclerView.ViewHolder(view){
    val binding:TemplateDestinoBinding = DataBindingUtil.bind(view)
}