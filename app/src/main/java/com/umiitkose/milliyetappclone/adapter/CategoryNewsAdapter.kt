package com.umiitkose.milliyetappclone.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.umiitkose.milliyetappclone.model.FragmentModel

class CategoryNewsAdapter(
    fm: FragmentManager,
    private val newFragmentList: List<FragmentModel>
) : FragmentStatePagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    override fun getItem(position: Int): Fragment = newFragmentList[position].fragment

    override fun getCount(): Int = newFragmentList.size

    override fun getPageTitle(position: Int): CharSequence? =
        newFragmentList[position].fragmentTitle

}