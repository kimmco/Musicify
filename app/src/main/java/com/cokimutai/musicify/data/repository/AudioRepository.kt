package com.cokimutai.musicify.data.repository

import com.cokimutai.musicify.data.local.ContentResolverHelper
import com.cokimutai.musicify.data.local.model.AudioItems
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AudioRepository @Inject constructor(
    private val contentResolverHelper: ContentResolverHelper
) {
    suspend fun getAudioData(): List<AudioItems> = withContext(Dispatchers.IO) {
        contentResolverHelper.getAudioData()
    }

}