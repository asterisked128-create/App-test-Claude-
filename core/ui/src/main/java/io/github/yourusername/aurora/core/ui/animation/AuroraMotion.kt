package io.github.yourusername.aurora.core.ui.animation

import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.tween as composeTween
import io.github.yourusername.aurora.core.ui.theme.MotionTokens

/**
 * The default entry point for any AnimationSpec in the app. Everything
 * else in this package (AuroraFade, AuroraScale, AuroraSharedAxis) is
 * built on top of this rather than calling `tween`/`spring` directly, so
 * a future change to the "house" easing/duration only needs to happen
 * here and in [MotionTokens].
 */
object AuroraMotion {
    fun <T> defaultTween(durationMillis: Int = MotionTokens.durationMedium): TweenSpec<T> =
        composeTween(durationMillis = durationMillis, easing = MotionTokens.standardEasing)

    fun <T> enterTween(durationMillis: Int = MotionTokens.durationMedium): TweenSpec<T> =
        composeTween(durationMillis = durationMillis, easing = MotionTokens.enterEasing)
}
