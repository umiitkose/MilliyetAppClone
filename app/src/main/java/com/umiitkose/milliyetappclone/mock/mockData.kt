package com.umiitkose.milliyetappclone.mock

import com.umiitkose.milliyetappclone.model.BigNewsModel
import com.umiitkose.milliyetappclone.model.FragmentModel
import com.umiitkose.milliyetappclone.ui.NewsFragment

object mockData {

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

    fun getNewsList(newsListSize: Int): List<BigNewsModel> {
        val bigNewsList = ArrayList<BigNewsModel>()

        repeat(newsListSize) {

            val bigNewsModel = BigNewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi, Kolay Alınmış Bir Karar Değil."
            )
            bigNewsList.add(bigNewsModel)

        }
        return bigNewsList
    }

}