package com.umiitkose.milliyetappclone.mock

import com.umiitkose.milliyetappclone.model.FragmentModel
import com.umiitkose.milliyetappclone.ui.NewsFragment

object mockData {

    fun getNewsCategoryFragment(fragmentSıze: Int): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()
        repeat(fragmentSıze) { position ->
            val newsFragment = NewsFragment()
            val fragmentModel = FragmentModel(
                getFragmentTitle(position),
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList

    }

    private fun getFragmentTitle(postion: Int): String {
        return when (postion) {
            0 -> {
                "ANASAYFA"
            }
            1 -> {
                "YAZARLAR"
            }
            2 -> {
                "GÜNDEM"
            }
            3 -> {
                "EKONOMİ"
            }
            4 -> {
                "SPOR"
            }
            5 -> {
                "CADDE"
            }
            6 -> {
                "EĞİTİM"
            }
            7 -> {
                "SİYASET"
            }
            else -> ""
        }
    }

}