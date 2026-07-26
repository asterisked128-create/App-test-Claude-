package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Tonal elevation levels, loosely matching Material 3's five-level scale.
 * AuroraSurface and future card components default to these rather than
 * hardcoding dp values.
 */
object ElevationTokens {
    val level0: Dp = 0.dp
    val level1: Dp = 1.dp
    val level2: Dp = 3.dp
    val level3: Dp = 6.dp
    val level4: Dp = 8.dp
    val level5: Dp = 12.dp
}
