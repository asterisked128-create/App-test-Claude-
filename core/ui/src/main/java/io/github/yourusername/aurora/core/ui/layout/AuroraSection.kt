package io.github.yourusername.aurora.core.ui.layout

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.yourusername.aurora.core.ui.foundation.AuroraText
import io.github.yourusername.aurora.core.ui.theme.SpacingTokens

/**
 * A titled vertical block — the shape every future "shelf" (Continue
 * Your Journey, Jump Back In, Your Circle, etc.) will be built from.
 * No shelf/card content is implemented here; this only owns the
 * optional title + consistent internal spacing.
 */
@Composable
fun AuroraSection(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    AuroraColumn(modifier = modifier, spacing = SpacingTokens.sm) {
        if (title != null) {
            AuroraText(text = title, style = MaterialTheme.typography.titleLarge)
        }
        content()
    }
}
