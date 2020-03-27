package com.example.nguyenxuansang98.recyclerviewpool.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nguyenxuansang98.recyclerviewpool.R
import com.example.nguyenxuansang98.recyclerviewpool.model.entity.Child
import kotlinx.android.synthetic.main.item_child.view.*

class ChildAdapter(private val listCast: ArrayList<Child>) :
    RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder =
        ChildViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_child,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = listCast.size

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.binData()
    }

    inner class ChildViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun binData() {
            Glide.with(itemView.context).load(listCast.get(adapterPosition).urlChild)
                .into(itemView.image_item_child)
            itemView.text_name_item_child.text = listCast.get(adapterPosition).nameChild
        }
    }
}