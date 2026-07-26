package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

/**
 * Raw shape values, mapped onto Material3 Shapes by AuroraTheme.
 */
object ShapeTokens {

    val none: CornerBasedShape = RoundedCornerShape(0.dp)

    val small: CornerBasedShape = RoundedCornerShape(8.dp)

    val medium: CornerBasedShape = RoundedCornerShape(16.dp)

    val large: CornerBasedShape = RoundedCornerShape(24.dp)

    val full: CornerBasedShape = RoundedCornerShape(50)
}