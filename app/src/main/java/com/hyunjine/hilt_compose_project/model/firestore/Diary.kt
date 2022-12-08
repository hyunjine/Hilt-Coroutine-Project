package com.hyunjine.hilt_compose_project.model.firestore

data class Diary(
    val title: String,
    val dateTimestamp: Long,
    val content: String
)
