package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * The single source of truth for spacing across Aurora. Layout
 * primitives (AuroraColumn, AuroraRow, AuroraContentPadding, etc.)
 * consume these directly rather than through a second wrapper object.
 */
object SpacingTokens {
    val none: Dp = 0.dp
    val xs: Dp = 4.dp
    val sm: Dp = 8.dp
    val md: Dp = 16.dp
    val lg: Dp = 24.dp
    val xl: Dp = 32.dp
    val xxl: Dp = 48.dp
}
