package com.hyunjine.hilt_compose_project.main

import com.hyunjine.hilt_compose_project.R
import com.hyunjine.hilt_compose_project.common.base.BaseActivity
import com.hyunjine.hilt_compose_project.databinding.ActivityMainBinding

class MainActivity(override val layoutId: Int = R.layout.activity_main): BaseActivity<ActivityMainBinding>() {

    override fun initView() {
        setRecyclerViewAdapter()
    }

    private fun setRecyclerViewAdapter() = binding.rcDiaryList.apply {

    }
}