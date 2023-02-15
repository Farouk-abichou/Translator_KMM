package com.example.translator_kmm.core.domain.history

data class HistoryItem(
    val id: Long?,
    val fromLanguageCode:String,
    val fromText:String,
    val toLanguageCode:String,
    val toText: String,
)
