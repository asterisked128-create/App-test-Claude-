package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Token-aware default entry point for vertical layout. Every future
 * screen/component should reach for this instead of raw `Column` so
 * vertical rhythm stays consistent by default.
 */
@Composable
fun AuroraColumn(
    modifier: Modifier = Modifier,
    spacing: Dp = SpacingTokens.md,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(spacing),
        horizontalAlignment = horizontalAlignment,
        content = content,
    )
}
