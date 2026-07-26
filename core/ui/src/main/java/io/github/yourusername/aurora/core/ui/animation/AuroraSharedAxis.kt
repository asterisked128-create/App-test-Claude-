package io.github.yourusername.aurora.core.ui.animation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import io.github.yourusername.aurora.core.ui.theme.MotionTokens

/** Which axis a shared-axis transition slides along. */
enum class AuroraAxis { X, Y }

/**
 * Minimal working version of Material's "shared axis" motion pattern:
 * incoming content slides in from one direction while fading in, and
 * outgoing content slides out the opposite direction while fading out.
 * Used for navigating between peer screens (e.g. dock tab switches)
 * rather than for parent/child navigation, which should fade instead.
 */
object AuroraSharedAxis {
    fun enter(
        axis: AuroraAxis = AuroraAxis.X,
        durationMillis: Int = MotionTokens.durationMedium,
    ): EnterTransition {
        val slide = when (axis) {
            AuroraAxis.X -> slideInHorizontally(animationSpec = AuroraMotion.enterTween(durationMillis)) { it / 3 }
            AuroraAxis.Y -> slideInVertically(animationSpec = AuroraMotion.enterTween(durationMillis)) { it / 3 }
        }
        return slide + fadeIn(animationSpec = AuroraMotion.enterTween(durationMillis))
    }

    fun exit(
        axis: AuroraAxis = AuroraAxis.X,
        durationMillis: Int = MotionTokens.durationMedium,
    ): ExitTransition {
        val slide = when (axis) {
            AuroraAxis.X -> slideOutHorizontally(animationSpec = AuroraMotion.defaultTween(durationMillis)) { -it / 3 }
            AuroraAxis.Y -> slideOutVertically(animationSpec = AuroraMotion.defaultTween(durationMillis)) { -it / 3 }
        }
        return slide + fadeOut(animationSpec = AuroraMotion.defaultTween(durationMillis))
    }
}
