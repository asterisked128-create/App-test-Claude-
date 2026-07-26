package io.github.yourusername.aurora.core.ui.placeholder

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.yourusername.aurora.core.ui.foundation.AuroraText
import io.github.yourusername.aurora.core.ui.layout.AuroraColumn
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Generic loading state, reusable by any feature screen or section.
 * Contains no knowledge of what's loading.
 */
@Composable
fun LoadingPlaceholder(
    modifier: Modifier = Modifier,
    message: String? = null,
) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AuroraColumn(spacing = SpacingTokens.sm, horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
            if (message != null) {
                AuroraText(
                    text = message,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}
