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
        ItemMainDiaryListBinding.inflate(LayoutInflater.from(parent.context), parent, false).let {
            onClickLayout(it)
            MainDiaryListViewHolder(it)
        }

    private fun onClickLayout(binding: ItemMainDiaryListBinding) = binding.run {
        layout.setOnClickListener {
            if (::listener.isInitialized) listener()
        }
    }
    override fun onBindViewHolder(holder: MainDiaryListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun setOnItemClickListener(listener: () -> Unit) {
        this.listener = listener
    }

    class MainDiaryListViewHolder(private val binding: ItemMainDiaryListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(diary: DiaryDTO) {
            binding.run {

            }
        }
    }

    class MainDiaryListDiff : DiffUtil.ItemCallback<DiaryDTO>() {
        override fun areItemsTheSame(oldItem: DiaryDTO, newItem: DiaryDTO) =
            oldItem.dateTimestamp == newItem.dateTimestamp

        override fun areContentsTheSame(oldItem: DiaryDTO, newItem: DiaryDTO) =
            oldItem == newItem
    }
}