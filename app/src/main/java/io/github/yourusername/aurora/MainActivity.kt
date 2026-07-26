package io.github.yourusername.aurora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import io.github.yourusername.aurora.core.navigation.rememberAuroraAppState

/**
 * Single-activity host for the Compose navigation graph.
 *
 * Wires together [AuroraNavHost] (content) and [AuroraFloatingDock]
 * (navigation chrome) via AuroraAppState from core:navigation.
 * Still no real theme (core:designsystem is empty until a later task) —
 * this is navigation structure only, per Task 002.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AuroraAppRoot()
        }
    }
}

@Composable
private fun AuroraAppRoot() {
    // MaterialTheme is a placeholder. core:designsystem will own the real
    // theme (colors, typography, shapes, and the dock's actual look) in a
    // later task.
    MaterialTheme {
        val appState = rememberAuroraAppState()

        Surface(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                AuroraNavHost(
                    appState = appState,
                    // Fixed placeholder inset so content doesn't sit under the
                    // dock. Replace with real WindowInsets-aware padding once
                    // the design system exists.
                    modifier = Modifier.padding(PaddingValues(bottom = 96.dp)),
                )

                AuroraFloatingDock(
                    destinations = appState.topLevelDestinations,
                    currentDestination = appState.currentDestination,
                    onNavigate = appState::navigateToTopLevelDestination,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 24.dp),
                )
            }
        }
    }
}
