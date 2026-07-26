package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.foundation.layout.PaddingValues
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * Named, reusable [PaddingValues] built from [SpacingTokens]. Screens
 * and sections use these instead of hand-writing `PaddingValues(16.dp)`
 * so a single change here updates every screen's outer padding at once.
 */
object AuroraContentPadding {
    val none: PaddingValues = PaddingValues(SpacingTokens.none)
    val screen: PaddingValues = PaddingValues(
        horizontal = SpacingTokens.md,
        vertical = SpacingTokens.md,
    )
    val section: PaddingValues = PaddingValues(vertical = SpacingTokens.sm)
}
