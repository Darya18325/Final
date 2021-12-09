package com.example.afinal

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class DeveloperViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
    private val developerNameTextView: TextView =itemView.findViewById(R.id.developer_name_text_view)


    fun bind(name:String){
        developerNameTextView.text=name

    }


}


