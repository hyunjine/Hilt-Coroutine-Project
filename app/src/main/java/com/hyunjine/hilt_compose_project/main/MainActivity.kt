package com.hyunjine.hilt_compose_project.main

import androidx.recyclerview.widget.LinearLayoutManager
import com.hyunjine.hilt_compose_project.common.base.BaseActivity
import com.hyunjine.hilt_compose_project.databinding.ActivityMainBinding
import com.hyunjine.hilt_compose_project.model.firestore.DiaryDTO

class MainActivity: BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it) }) {
    private val rcAdapter: MainDiaryListAdapter by lazy { MainDiaryListAdapter() }

    override fun initView() {
        setRecyclerViewAdapter()
        rcAdapter.submitList(listOf(DiaryDTO()))
    }


    private fun setRecyclerViewAdapter() = binding.rcDiaryList.apply {
        layoutManager = LinearLayoutManager(this@MainActivity)
        adapter = rcAdapter
    }

}