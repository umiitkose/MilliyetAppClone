package com.umiitkose.milliyetappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.umiitkose.milliyetappclone.R
import com.umiitkose.milliyetappclone.model.BigNewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*

class BigNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_big_news,
        parent,
        false
    )
) {

    fun bind(
        bigNewsModel: BigNewsModel,
        onItemClickListener: (BigNewsModel) -> Unit
    ) {
        itemView.txtNewsTitle.text = bigNewsModel.newsTitle
        Glide.with(itemView.context)
            .load(bigNewsModel.newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }

    }


}