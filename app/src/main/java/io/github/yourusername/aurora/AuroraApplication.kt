package io.github.yourusername.aurora

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application entry point. Annotating this with [HiltAndroidApp] triggers
 * Hilt's code generation and creates the app-level dependency container
 * that every module's Hilt modules attach to via [dagger.hilt.InstallIn].
 */
@HiltAndroidApp
class AuroraApplication : Application()
