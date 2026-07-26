package io.github.yourusername.aurora.feature.anime

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * Placeholder only — no content, no ViewModel, no business logic.
 * Real Anime content lands once the Content Engine and this feature's
 * own task are implemented.
 */
@Composable
fun AnimeScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Anime",
            style = MaterialTheme.typography.headlineMedium,
        )
    }
}
