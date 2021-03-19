package com.example.futbol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class FutbolistasAdapter (private val futbolistas : List<Futbolistas>)
    : RecyclerView.Adapter<FutbolistasAdapter.FutbolistasViewHolder>(){
    inner class FutbolistasViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.futbolistas)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FutbolistasAdapter.FutbolistasViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.futbolistas_layout,parent, false)
        return FutbolistasViewHolder(renglon_layout)
    }

    override fun onBindViewHolder(holder: FutbolistasViewHolder, position: Int) {
        val futbolista= futbolistas[position]
        holder.nombre.text = futbolista.name
        holder.foto.setImageResource(futbolista.picture)
        holder.itemView.setOnClickListener {
            val action = FutbolistasKFragmentDirections.actionFutbolistasKFragmentToFutbolistaFragment(futbolista)
            holder?.itemView.findNavController().navigate(action)
        }
    }
    override fun getItemCount(): Int {
        return futbolistas.size
    }
}