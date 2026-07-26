package io.github.yourusername.aurora.core.ui.animation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import io.github.yourusername.aurora.core.ui.theme.MotionTokens

/**
 * Scale + fade combo — the "pop in" pattern for things like dialogs,
 * expanding cards, or the music-widget's expanded state from the
 * desktop shell.
 */
object AuroraScale {
    fun enter(
        initialScale: Float = 0.92f,
        durationMillis: Int = MotionTokens.durationMedium,
    ): EnterTransition =
        scaleIn(initialScale = initialScale, animationSpec = AuroraMotion.defaultTween(durationMillis)) +
            fadeIn(animationSpec = AuroraMotion.defaultTween(durationMillis))

    fun exit(
        targetScale: Float = 0.92f,
        durationMillis: Int = MotionTokens.durationMedium,
    ): ExitTransition =
        scaleOut(targetScale = targetScale, animationSpec = AuroraMotion.defaultTween(durationMillis)) +
            fadeOut(animationSpec = AuroraMotion.defaultTween(durationMillis))
}
