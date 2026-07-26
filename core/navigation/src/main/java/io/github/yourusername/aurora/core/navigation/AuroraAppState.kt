package io.github.yourusername.aurora.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

/**
 * Single owner of top-level navigation state. Any screen (in any feature
 * module) that needs to trigger dock navigation depends on this class,
 * not on `NavHostController` directly — keeping the actual navigation
 * mechanism swappable behind one seam.
 */
@Stable
class AuroraAppState(
    val navController: NavHostController,
) {
    val currentDestination: NavDestination?
        @Composable get() {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            return navBackStackEntry?.destination
        }

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() {
            val destination = currentDestination
            return TopLevelDestination.entries.firstOrNull { top ->
                destination.isTopLevelDestinationInHierarchy(top)
            }
        }

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    /**
     * Standard single-top-level-tab navigation pattern: pops back to the
     * graph's start destination (saving its state), avoids stacking
     * duplicate copies of a destination, and restores previously saved
     * state (scroll position, etc.) when returning to a tab.
     */
    fun navigateToTopLevelDestination(destination: TopLevelDestination) {
        navController.navigate(destination.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}

@Composable
fun rememberAuroraAppState(
    navController: NavHostController = rememberNavController(),
): AuroraAppState = remember(navController) {
    AuroraAppState(navController = navController)
}

fun NavDestination?.isTopLevelDestinationInHierarchy(destination: TopLevelDestination): Boolean =
    this?.hierarchy?.any { it.route?.contains(destination.route, ignoreCase = true) == true } == true
