package com.umiitkose.milliyetappclone.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umiitkose.milliyetappclone.enums.NewsType
import live.codemy.milliyetapp.model.BaseNewsModel

class NewsListAdapter(
    private val newsList: List<BaseNewsModel>,
    private val onItemClickListener: (BaseNewsModel) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            NewsType.SMALL_NEWS.id -> {
                SmallNewsViewHolder(parent)
            }
            NewsType.BIG_NEWS.id -> {
                BigNewsViewHolder(parent)
            }
            NewsType.ADS_BANNER.id -> {
                AdsBannerViewHolder(parent)
            }
            else -> BigNewsViewHolder(parent)
        }


    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (newsList[position].itemViewType) {
            NewsType.SMALL_NEWS.id -> {
                (holder as SmallNewsViewHolder).bind(newsList[position], onItemClickListener)
            }
            NewsType.BIG_NEWS.id -> {
                (holder as BigNewsViewHolder).bind(newsList[position], onItemClickListener)
            }
            NewsType.ADS_BANNER.id -> {
                (holder as AdsBannerViewHolder).bind(newsList[position], onItemClickListener)
            }
            else -> {
                (holder as BigNewsViewHolder).bind(newsList[position], onItemClickListener)
            }
        }
    }

    override fun getItemViewType(position: Int): Int = newsList[position].itemViewType

}