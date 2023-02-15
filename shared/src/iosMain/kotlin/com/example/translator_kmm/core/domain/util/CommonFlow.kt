package com.example.translator_kmm.core.domain.util

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow

actual open class CommonFlow<T> actual constructor(
    private val flow: Flow<T>
) : Flow<T> by flow {

    fun subscribe(
        coroutineScope : CoroutineScope,
        dispatcher: CoroutineDispatcher,
        onCollect : (T) -> Unit
    ) : DisposableHandle {

            val job = coroutineScope.launch(dispatcher) {
               flow.collect(onCollect)
            }
            return DisposableHandle { job.cancel() }

    }

}