package com.example.mytestingapp.adapter.recyclerview
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.datamodel.SingleStringmodel

import com.example.myapplication.interfaces.OnItemclickListner
import com.example.mytestingapp.R

class AdapterOneImage(var list: List<SingleStringmodel>, var context: Context, val onitemclickListner: OnItemclickListner) :
    RecyclerView.Adapter<AdapterOneImage.MyViewHolder>() {
    class MyViewHolder(view: View,onItemclickListner: OnItemclickListner):RecyclerView.ViewHolder(view)
    {
        var imageViews: ImageView = itemView.findViewById(R.id.testview)
        init {
            view.setOnClickListener {
                onItemclickListner.onclick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_data, parent, false)
        return MyViewHolder(view,onitemclickListner)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(list[position].img).into(holder.imageViews)
    }

    override fun getItemCount(): Int = list.size
}


