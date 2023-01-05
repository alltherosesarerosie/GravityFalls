package com.geektech.gravityfalls

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.gravityfalls.databinding.FragmentItemBinding

data class CharacterAdapter(
    val charList: ArrayList<Character>,
    val onClick: (position: Int)-> Unit
): RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: CharacterAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = charList.size
    inner  class ViewHolder(private  val binding: FragmentItemBinding):RecyclerView.ViewHolder(binding.root){
        fun  bind(){
            val item = charList[adapterPosition]
                Glide.with(binding.imgIv).load("https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg").into(binding.imgIv)
                binding.ageTv.text = item.age
                binding.nameTv.text = item.name

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }

    }

