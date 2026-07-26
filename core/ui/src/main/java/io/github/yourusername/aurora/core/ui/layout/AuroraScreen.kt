package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * The top-level container every feature screen wraps its content in
 * (instead of a raw `Box`/`Scaffold`). Fills available space, applies
 * the theme's background colour, and applies [contentPadding].
 *
 * Deliberately not a `Scaffold` — it has no opinion on top bars, FABs,
 * or bottom bars, since the floating dock lives in `:app`, not here.
 */
@Composable
fun AuroraScreen(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = AuroraContentPadding.screen,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(contentPadding),
        content = content,
    )
}
