package io.github.yourusername.aurora.core.ui.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import io.github.yourusername.aurora.core.ui.theme.AuroraTheme

/**
 * Wraps preview content in [AuroraTheme] + a background `Surface` so
 * every component preview looks like it does inside the real app,
 * without every `@Preview` function repeating that boilerplate.
 */
@Composable
fun AuroraPreviewSurface(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    AuroraTheme(darkTheme = darkTheme) {
        Surface(color = MaterialTheme.colorScheme.background) {
            content()
        }
    }
}
