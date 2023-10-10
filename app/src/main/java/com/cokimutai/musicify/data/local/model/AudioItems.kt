package com.cokimutai.musicify.data.local.model

import android.icu.text.CaseMap.Title
import android.net.Uri

data class AudioItems(
    val uri: Uri,
    val displayName: String,
    val id: Long,
    val artist: String,
    val data: String,
    val duration: Int,
    val title: String
)
