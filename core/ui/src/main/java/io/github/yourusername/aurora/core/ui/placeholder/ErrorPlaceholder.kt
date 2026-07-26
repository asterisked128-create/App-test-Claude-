package io.github.yourusername.aurora.core.ui.placeholder

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.yourusername.aurora.core.ui.foundation.AuroraIcon
import io.github.yourusername.aurora.core.ui.foundation.AuroraText
import io.github.yourusername.aurora.core.ui.layout.AuroraColumn
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Generic error state, reusable by any feature screen or section.
 * Contains no knowledge of what failed or why — callers pass a message.
 */
@Composable
fun ErrorPlaceholder(
    modifier: Modifier = Modifier,
    message: String = "Something went wrong.",
    retryLabel: String = "Retry",
    onRetry: (() -> Unit)? = null,
) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AuroraColumn(spacing = SpacingTokens.sm, horizontalAlignment = Alignment.CenterHorizontally) {
            AuroraIcon(
                imageVector = Icons.Default.Warning,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.error,
                size = 32.dp,
            )
            AuroraText(
                text = message,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            if (onRetry != null) {
                TextButton(onClick = onRetry) {
                    AuroraText(text = retryLabel, style = MaterialTheme.typography.labelLarge)
                }
            }
        }
    }
}
