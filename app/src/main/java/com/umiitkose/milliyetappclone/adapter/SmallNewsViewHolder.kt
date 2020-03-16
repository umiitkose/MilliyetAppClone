package com.umiitkose.milliyetappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.umiitkose.milliyetappclone.R
import com.umiitkose.milliyetappclone.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*
import live.codemy.milliyetapp.model.BaseNewsModel

class SmallNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_small_news,
        parent,
        false
    )
) {

    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {
        itemView.txtNewsTitle.text = (newsModel as NewsModel).newsTitle
        Glide.with(itemView.context)
            .load(newsModel.newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)

        itemView.setOnClickListener {
            onItemClickListener(newsModel)
        }

    }


}