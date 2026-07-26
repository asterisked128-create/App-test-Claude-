package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Raw text styles only, keyed by role rather than by Material3's scale
 * names — [AuroraTheme] maps these onto `Typography`. No custom font
 * family yet; swapping in Newsreader/Inter later only touches this file.
 */
object TypographyTokens {
    val display = TextStyle(fontSize = 32.sp, lineHeight = 40.sp, fontWeight = FontWeight.Normal)
    val headline = TextStyle(fontSize = 24.sp, lineHeight = 30.sp, fontWeight = FontWeight.Normal)
    val title = TextStyle(fontSize = 20.sp, lineHeight = 26.sp, fontWeight = FontWeight.Medium)
    val body = TextStyle(fontSize = 16.sp, lineHeight = 22.sp, fontWeight = FontWeight.Normal)
    val label = TextStyle(fontSize = 12.sp, lineHeight = 16.sp, fontWeight = FontWeight.Medium)
}
