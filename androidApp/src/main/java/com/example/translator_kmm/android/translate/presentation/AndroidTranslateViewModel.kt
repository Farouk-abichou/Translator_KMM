package com.example.translator_kmm.android.translate.presentation

import TranslateViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.translator_kmm.translate.domain.history.HistoryDataSource
import com.example.translator_kmm.translate.domain.translate.Translate
import com.example.translator_kmm.translate.presentation.TranslateEvent
import javax.inject.Inject

class AndroidTranslateViewModel @Inject constructor(
    private val translate: Translate,
    private val historyDataSource: HistoryDataSource
) : ViewModel(){

    private val viewModel by lazy {
        TranslateViewModel(
            translate = translate,
            historyDataSource = historyDataSource,
            coroutineScope = viewModelScope
        )
    }

    val state = viewModel.state

    fun onEvent(event: TranslateEvent){
        viewModel.onEvent(event)
    }
}