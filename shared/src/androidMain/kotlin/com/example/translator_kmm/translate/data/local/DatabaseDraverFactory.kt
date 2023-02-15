package com.example.translator_kmm.translate.data.local

import android.content.Context
import com.example.translator_kmm.database.TranslateDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDraverFactory(
    private val context: Context
){
    actual fun create():SqlDriver{
        return AndroidSqliteDriver(TranslateDatabase.Schema,context,"translate.db")
    }
}