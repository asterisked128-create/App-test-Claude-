package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Raw color values only — no semantics, no ColorScheme construction here
 * (that happens in [AuroraTheme]). Placeholder palette; will be replaced
 * with the real editorial palette once Figma tokens are ported.
 */
object ColorTokens {

    object Light {
        val primary = Color(0xFF4A5940)
        val onPrimary = Color(0xFFFFFFFF)
        val background = Color(0xFFF7F3EC)
        val onBackground = Color(0xFF1C1B19)
        val surface = Color(0xFFFFFFFF)
        val onSurface = Color(0xFF1C1B19)
        val surfaceVariant = Color(0xFFEAE6DD)
        val onSurfaceVariant = Color(0xFF48453D)
        val error = Color(0xFFBA1A1A)
        val onError = Color(0xFFFFFFFF)
    }

    object Dark {
        val primary = Color(0xFFB4CCA5)
        val onPrimary = Color(0xFF1F3617)
        val background = Color(0xFF16150F)
        val onBackground = Color(0xFFE7E2D8)
        val surface = Color(0xFF1E1D17)
        val onSurface = Color(0xFFE7E2D8)
        val surfaceVariant = Color(0xFF48453D)
        val onSurfaceVariant = Color(0xFFCAC6BA)
        val error = Color(0xFFFFB4AB)
        val onError = Color(0xFF690005)
    }
}
