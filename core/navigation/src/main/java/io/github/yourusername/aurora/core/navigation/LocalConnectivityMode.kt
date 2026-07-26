package io.github.yourusername.aurora.core.navigation

import androidx.compose.runtime.staticCompositionLocalOf

/**
 * Composition-local seam for [ConnectivityMode]. Defaults to [ConnectivityMode.ONLINE]
 * and nothing currently provides a different value — this is scaffolding,
 * not a working offline-mode implementation. It lets any composable in any
 * feature module opt into reading connectivity state later with zero
 * plumbing changes, once something upstream actually provides it.
 */
val LocalConnectivityMode = staticCompositionLocalOf { ConnectivityMode.ONLINE }
