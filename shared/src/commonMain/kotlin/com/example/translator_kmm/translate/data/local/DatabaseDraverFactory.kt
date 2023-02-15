package com.example.translator_kmm.translate.data.local

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDraverFactory {
    fun create(): SqlDriver
}