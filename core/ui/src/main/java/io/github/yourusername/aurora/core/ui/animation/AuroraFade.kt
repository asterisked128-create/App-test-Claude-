package io.github.yourusername.aurora.core.ui.animation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import io.github.yourusername.aurora.core.ui.theme.MotionTokens

/**
 * The plain fade enter/exit pair used by default wherever a transition
 * doesn't call for anything more specific.
 */
object AuroraFade {
    fun enter(durationMillis: Int = MotionTokens.durationMedium): EnterTransition =
        fadeIn(animationSpec = AuroraMotion.defaultTween(durationMillis))

    fun exit(durationMillis: Int = MotionTokens.durationMedium): ExitTransition =
        fadeOut(animationSpec = AuroraMotion.defaultTween(durationMillis))
}
