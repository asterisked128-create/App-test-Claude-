package io.github.yourusername.aurora.core.ui.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

/** Renders a component's @Preview in light mode only. */
@Preview(name = "Light", showBackground = true)
annotation class AuroraPreviewLight

/** Renders a component's @Preview in dark mode only. */
@Preview(
    name = "Dark",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
annotation class AuroraPreviewDark

/**
 * Multipreview: annotate a `@Composable fun XPreview()` with this once
 * to get both a light and dark preview, instead of duplicating the
 * function or stacking both annotations by hand every time.
 */
@AuroraPreviewLight
@AuroraPreviewDark
annotation class AuroraPreviews
