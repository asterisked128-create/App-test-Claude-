package io.github.yourusername.aurora.feature.novel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * Placeholder only — no content, no ViewModel, no business logic.
 * Real Novel content lands once the Content Engine and this feature's
 * own task are implemented.
 */
@Composable
fun NovelScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Novel",
            style = MaterialTheme.typography.headlineMedium,
        )
    }
}
