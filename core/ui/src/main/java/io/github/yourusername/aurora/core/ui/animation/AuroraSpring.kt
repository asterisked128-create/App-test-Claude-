package io.github.yourusername.aurora.core.ui.animation

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.spring as composeSpring
import io.github.yourusername.aurora.core.ui.theme.MotionTokens

/**
 * Named spring presets built from [MotionTokens]'s raw damping/stiffness
 * constants. Prefer these over calling `spring()` with hand-picked
 * numbers so every "bouncy" interaction in the app feels the same.
 */
object AuroraSpring {
    fun <T> gentle(): SpringSpec<T> = composeSpring(
        dampingRatio = MotionTokens.springDampingGentle,
        stiffness = MotionTokens.springStiffnessGentle,
    )

    fun <T> snappy(): SpringSpec<T> = composeSpring(
        dampingRatio = MotionTokens.springDampingSnappy,
        stiffness = MotionTokens.springStiffnessSnappy,
    )

    fun <T> bouncy(): SpringSpec<T> = composeSpring(
        dampingRatio = MotionTokens.springDampingBouncy,
        stiffness = MotionTokens.springStiffnessBouncy,
    )
}
