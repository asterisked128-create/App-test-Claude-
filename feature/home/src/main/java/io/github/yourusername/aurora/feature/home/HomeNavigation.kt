package io.github.yourusername.aurora.feature.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

/**
 * Route constant must match [io.github.yourusername.aurora.core.navigation.TopLevelDestination.HOME.route].
 * See the KDoc on that enum for why this is a string convention rather
 * than a compile-time dependency.
 */
const val HOME_ROUTE = "home"

/**
 * Adds the Home destination to a [NavGraphBuilder]. The app module calls
 * this alongside every other feature's equivalent function to assemble
 * the full nav graph — this feature module never needs to know that
 * any other destination exists.
 */
fun NavGraphBuilder.homeScreen() {
    composable(route = HOME_ROUTE) {
        HomeScreen()
    }
}
