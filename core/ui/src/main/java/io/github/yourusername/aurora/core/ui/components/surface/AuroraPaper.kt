package io.github.yourusername.aurora.core.ui.components.surface

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Aurora's base surface.
 *
 * Every card, panel and floating surface should be built on top of this
 * composable instead of using Material Surface directly.
 */
@Composable
fun AuroraPaper(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.large,
    tonalElevation: Dp = 2.dp,
    shadowElevation: Dp = 0.dp,
    content: @Composable BoxScope.() -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            content = content
        )
    }
}