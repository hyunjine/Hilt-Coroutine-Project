package com.hyunjine.hilt_compose_project.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hyunjine.hilt_compose_project.databinding.ItemMainDiaryListBinding
import com.hyunjine.hilt_compose_project.model.firestore.DiaryDTO

class MainDiaryListAdapter: ListAdapter<DiaryDTO, MainDiaryListAdapter.MainDiaryListViewHolder>(MainDiaryListDiff()) {
    private lateinit var listener: () -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainDiaryListViewHolder =
        MainDiaryListViewHolder(
            ItemMainDiaryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: MainDiaryListViewHolder, position: Int) {
        holder.bind()
    }

    class MainDiaryListDiff : DiffUtil.ItemCallback<DiaryDTO>() {
        override fun areItemsTheSame(oldItem: DiaryDTO, newItem: DiaryDTO) =
            oldItem.dateTimestamp == newItem.dateTimestamp

        override fun areContentsTheSame(oldItem: DiaryDTO, newItem: DiaryDTO) =
            oldItem == newItem
    }

    inner class MainDiaryListViewHolder(private val binding: ItemMainDiaryListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {

        }
    }
}