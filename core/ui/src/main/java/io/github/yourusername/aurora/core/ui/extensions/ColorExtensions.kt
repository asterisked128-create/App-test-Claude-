package io.github.yourusername.aurora.core.ui.extensions

import androidx.compose.ui.graphics.Color

/** Returns a copy of this color with [alpha] clamped to a valid 0..1 range. */
fun Color.withAlpha(alpha: Float): Color = copy(alpha = alpha.coerceIn(0f, 1f))
