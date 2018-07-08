package com.prongbang.archmvvm.vo

import okhttp3.HttpUrl

data class Config(
        val httpUrl: HttpUrl,
        val languageKey: String,
        val accessToken: AccessToken
)