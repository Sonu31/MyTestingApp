package com.example.mytestingapp.adapter.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.datamodel.SingleStringmodel

class Adapterdatabind{
//    (val imglist: MutableList<SingleStringmodel>, var context: Context) :RecyclerView.Adapter<Adapterdatabind.MyViewHolder>() {
//
//
//
//    var lists= mutableListOf<SingleStringmodel>()
//
//    fun setConttentList(list:MutableList<SingleStringmodel>)
//    {
//        this.lists= list
//        notifyDataSetChanged()
//
//    }
//
//
//    class MyViewHolder(val viewDataBinding: ImgrowItemBinding):RecyclerView.ViewHolder(viewDataBinding.root)
//    {
////        fun bind(data:MyvModel)
////        {
////            viewDataBinding.adpterdata= data
////            viewDataBinding.executePendingBindings()
////        }
//    }
//
////    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
////
////        val binding = RowDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
////        return MyViewHolder(binding)
////    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
//        MyViewHolder (
//        DataBindingUtil.inflate(LayoutInflater.from(parent.context),
//            R.layout.imgrow_item ,
//            parent,
//            false)
//
//        )
//
//    override fun getItemCount(): Int {
//        return this.lists.size
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//
//        holder.viewDataBinding.rowdata= imglist[position]
//
//    }
//
//    companion object
//    {
//        @BindingAdapter("loadImage")
//        fun loadiMAGE(testview:ImageView,url:String,context: Context){
//            Glide.with(context).load(url)
//                .into(testview)
//
//        }
//
//    }
}