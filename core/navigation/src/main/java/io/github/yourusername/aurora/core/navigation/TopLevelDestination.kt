package io.github.yourusername.aurora.core.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * The four primary, always-visible destinations shown in the floating
 * dock. This is intentionally the *only* thing app-level navigation code
 * needs to know about — it has no reference to any `:feature` module.
 *
 * Route convention: [route] must exactly match the route constant each
 * feature module defines for its own top-level screen (e.g. `feature:home`
 * defines `const val HOME_ROUTE = "home"`, matching [HOME].route here).
 * This is a deliberate light coupling by string convention rather than a
 * compile-time dependency, so `core:navigation` never depends on
 * `:feature:*` and each feature module stays independent. A type-safe
 * routes API (e.g. kotlinx.serialization-based Navigation Compose routes)
 * can replace this convention later without changing module boundaries.
 */
enum class TopLevelDestination(
    val route: String,
    val label: String,
    val icon: ImageVector,
) {
    HOME(route = "home", label = "Home", icon = Icons.Default.Home),
    ANIME(route = "anime", label = "Anime", icon = Icons.Default.PlayArrow),
    MANGA(route = "manga", label = "Manga", icon = Icons.Default.List),
    NOVEL(route = "novel", label = "Novel", icon = Icons.Default.Star),
}
