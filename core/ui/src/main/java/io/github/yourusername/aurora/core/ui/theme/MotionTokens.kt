package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring

/**
 * Raw motion constants only. The `core.ui.animation` package builds
 * actual AnimationSpecs from these — this file has no knowledge of
 * `tween`/`spring` call sites, only the numbers and curves themselves.
 */
object MotionTokens {
    const val durationFast: Int = 150
    const val durationMedium: Int = 300
    const val durationSlow: Int = 500

    val standardEasing: Easing = FastOutSlowInEasing
    val enterEasing: Easing = LinearOutSlowInEasing

    const val springDampingGentle: Float = Spring.DampingRatioLowBouncy
    const val springDampingSnappy: Float = Spring.DampingRatioNoBouncy
    const val springDampingBouncy: Float = Spring.DampingRatioMediumBouncy

    const val springStiffnessGentle: Float = Spring.StiffnessLow
    const val springStiffnessSnappy: Float = Spring.StiffnessMedium
    const val springStiffnessBouncy: Float = Spring.StiffnessMediumLow
}
