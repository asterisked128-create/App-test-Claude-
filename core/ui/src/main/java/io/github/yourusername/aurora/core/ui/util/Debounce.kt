package io.github.yourusername.aurora.core.ui.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

/**
 * Returns a debounced copy of [value] that only updates [delayMillis]
 * after [value] stops changing. Generic, reusable by any future search
 * field or rapidly-changing input — no feature-specific logic here.
 */
@Composable
fun <T> rememberDebounced(value: T, delayMillis: Long = 300L): T {
    var debounced by remember { mutableStateOf(value) }
    LaunchedEffect(value) {
        delay(delayMillis)
        debounced = value
    }
    return debounced
}
