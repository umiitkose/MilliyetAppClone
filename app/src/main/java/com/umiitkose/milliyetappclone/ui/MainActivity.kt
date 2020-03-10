package com.umiitkose.milliyetappclone.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.umiitkose.milliyetappclone.R
import com.umiitkose.milliyetappclone.adapter.CategoryNewsAdapter
import com.umiitkose.milliyetappclone.mock.mockData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        vpNewCategory.adapter =
            CategoryNewsAdapter(supportFragmentManager, mockData.getNewsCategoryFragment(7))
        tabLayNewCategory.setupWithViewPager(vpNewCategory)
    }
}
