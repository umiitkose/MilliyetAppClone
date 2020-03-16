package com.umiitkose.milliyetappclone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.umiitkose.milliyetappclone.R
import com.umiitkose.milliyetappclone.adapter.NewsListAdapter
import com.umiitkose.milliyetappclone.mock.MockData
import com.umiitkose.milliyetappclone.util.extToast
import kotlinx.android.synthetic.main.fragment_news.*

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) { baseNewsModel ->

        }

        swipeLayout.setOnRefreshListener {
            requireActivity().extToast("Refresh")
            swipeLayout.isRefreshing = false
        }
    }

}
