package com.umiitkose.milliyetappclone.model

import live.codemy.milliyetapp.model.BaseNewsModel

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    var isSaved: Boolean,
    override val itemViewType: Int
) : BaseNewsModel()