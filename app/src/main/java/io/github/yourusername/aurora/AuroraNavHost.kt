package io.github.yourusername.aurora

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import io.github.yourusername.aurora.core.navigation.AuroraAppState
import io.github.yourusername.aurora.core.navigation.TopLevelDestination
import io.github.yourusername.aurora.feature.anime.animeScreen
import io.github.yourusername.aurora.feature.home.homeScreen
import io.github.yourusername.aurora.feature.manga.mangaScreen
import io.github.yourusername.aurora.feature.novel.novelScreen

/**
 * The only place in the app that knows every feature module exists.
 * Adding a fifth destination later means: register it here, add it to
 * [TopLevelDestination] in core:navigation, and nowhere else needs to
 * change.
 */
@Composable
fun AuroraNavHost(
    appState: AuroraAppState,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = appState.navController,
        startDestination = TopLevelDestination.HOME.route,
        modifier = modifier,
    ) {
        homeScreen()
        animeScreen()
        mangaScreen()
        novelScreen()
    }
}
