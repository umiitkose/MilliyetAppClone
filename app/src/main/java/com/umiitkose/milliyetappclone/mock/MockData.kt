package com.umiitkose.milliyetappclone.mock

import com.google.android.gms.ads.AdSize
import com.umiitkose.milliyetappclone.enums.NewsType
import com.umiitkose.milliyetappclone.model.FragmentModel
import com.umiitkose.milliyetappclone.model.NewsModel
import com.umiitkose.milliyetappclone.ui.NewsFragment
import live.codemy.milliyetapp.model.AdsModel
import live.codemy.milliyetapp.model.BaseNewsModel

object MockData {

    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getTitleList()[position],
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList
    }

    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")
        return titleList
    }

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()

        repeat(newsListSize) {
            val adsModel = AdsModel(
                AdSize.BANNER,
                "ca-app-pub-3940256099942544/6300978111",
                NewsType.ADS_BANNER.id
            )
            val bigNewsModel = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                true,
                NewsType.BIG_NEWS.id
            )
            val smallNewsModel1 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                false,
                NewsType.SMALL_NEWS.id
            )
            val smallNewsModel2 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                true,
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel3 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                false,
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel4 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                false,
                NewsType.SMALL_NEWS.id
            )

            newsList.add(adsModel)
            newsList.add(smallNewsModel1)
            newsList.add(smallNewsModel2)
            newsList.add(smallNewsModel3)
            newsList.add(smallNewsModel4)
            newsList.add(bigNewsModel)
        }

        return newsList
    }
}