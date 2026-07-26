package io.github.yourusername.aurora.core.ui.placeholder

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.github.yourusername.aurora.core.ui.foundation.AuroraIcon
import io.github.yourusername.aurora.core.ui.foundation.AuroraText
import io.github.yourusername.aurora.core.ui.layout.AuroraColumn
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Generic empty state ("nothing here yet"), reusable by any feature
 * screen or section. Distinct from [ErrorPlaceholder] — this is for a
 * successful load that simply returned nothing.
 */
@Composable
fun EmptyPlaceholder(
    modifier: Modifier = Modifier,
    message: String = "Nothing here yet.",
    icon: ImageVector = Icons.Default.Info,
    actionLabel: String? = null,
    onAction: (() -> Unit)? = null,
) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AuroraColumn(spacing = SpacingTokens.sm, horizontalAlignment = Alignment.CenterHorizontally) {
            AuroraIcon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                size = 32.dp,
            )
            AuroraText(
                text = message,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            if (actionLabel != null && onAction != null) {
                TextButton(onClick = onAction) {
                    AuroraText(text = actionLabel, style = MaterialTheme.typography.labelLarge)
                }
            }
        }
    }
}
