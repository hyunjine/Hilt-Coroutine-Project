package com.hyunjine.hilt_compose_project.model.firestore

import com.hyunjine.hilt_compose_project.common.DEFAULT_LONG
import com.hyunjine.hilt_compose_project.common.DEFAULT_STRING

data class DiaryDTO(
    var title: String = DEFAULT_STRING,
    var date: String = DEFAULT_STRING,
    var dateTimestamp: Long = DEFAULT_LONG,
    var content: String = DEFAULT_STRING,
    var tag: String = DEFAULT_STRING,
)
