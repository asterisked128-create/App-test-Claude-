package io.github.yourusername.aurora.core.common.dispatcher

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Abstraction over [kotlinx.coroutines.Dispatchers] so ViewModels and
 * repositories never reference `Dispatchers.IO` etc. directly — this is
 * what makes coroutine code testable with a fake/immediate dispatcher.
 */
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}
