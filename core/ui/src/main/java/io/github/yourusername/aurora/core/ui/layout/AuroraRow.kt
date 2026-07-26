package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Token-aware default entry point for horizontal layout — the `Row`
 * counterpart to [AuroraColumn].
 */
@Composable
fun AuroraRow(
    modifier: Modifier = Modifier,
    spacing: Dp = SpacingTokens.md,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spacing),
        verticalAlignment = verticalAlignment,
        content = content,
    )
}
