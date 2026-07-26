package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import io.github.yourusername.aurora.core.ui.theme.ElevationTokens
import io.github.yourusername.aurora.core.ui.theme.ShapeTokens

/**
 * Token-aware default entry point for any future card/panel/sheet
 * component. Wraps Material3's `Surface`, defaulting shape and elevation
 * to Aurora tokens instead of Material3's own defaults.
 */
@Composable
fun AuroraSurface(
    modifier: Modifier = Modifier,
    shape: Shape = ShapeTokens.medium,
    color: Color = MaterialTheme.colorScheme.surface,
    contentColor: Color = MaterialTheme.colorScheme.onSurface,
    tonalElevation: Dp = ElevationTokens.level1,
    shadowElevation: Dp = ElevationTokens.level0,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation,
        content = content,
    )
}
