package io.github.yourusername.aurora.feature.novel

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

/**
 * Route constant must match [io.github.yourusername.aurora.core.navigation.TopLevelDestination.NOVEL.route].
 * See the KDoc on that enum for why this is a string convention rather
 * than a compile-time dependency.
 */
const val NOVEL_ROUTE = "novel"

/**
 * Adds the Novel destination to a [NavGraphBuilder]. The app module calls
 * this alongside every other feature's equivalent function to assemble
 * the full nav graph — this feature module never needs to know that
 * any other destination exists.
 */
fun NavGraphBuilder.novelScreen() {
    composable(route = NOVEL_ROUTE) {
        NovelScreen()
    }
}
