package com.bootcamp.gamestore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bootcamp.gamestore.databinding.GamerecycleritemBinding

class gameImageListAdapter(private val images: List<GameImage>) : RecyclerView.Adapter<gameImageListAdapter.ViewHolder>() {
    class ViewHolder(val binding: GamerecycleritemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GamerecycleritemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imageViewGameItem.setImageResource(images[position].imageResourceId)
    }

    override fun getItemCount(): Int = images.size
}