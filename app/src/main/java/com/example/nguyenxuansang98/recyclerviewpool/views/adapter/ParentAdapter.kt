package com.example.nguyenxuansang98.recyclerviewpool.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nguyenxuansang98.recyclerviewpool.R
import com.example.nguyenxuansang98.recyclerviewpool.model.entity.Parent
import kotlinx.android.synthetic.main.item_parent.view.*

class ParentAdapter(val listParent: ArrayList<Parent>) :
    RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    private var viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder =
        ParentViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_parent,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = listParent.size

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.binData()
    }

    inner class ParentViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun binData() {
            itemView.text_tittle_parent.text = listParent.get(adapterPosition).nameParent
            itemView.recycler_item_parent.apply {
                layoutManager = LinearLayoutManager(
                    itemView.recycler_item_parent.context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
                adapter = ChildAdapter(listParent.get(adapterPosition).child)
                setRecycledViewPool(viewPool)
            }
        }
    }
}