package io.github.yourusername.aurora.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AuroraLightScheme = lightColorScheme(
    primary = ColorTokens.Light.primary,
    onPrimary = ColorTokens.Light.onPrimary,

    background = ColorTokens.Light.background,
    onBackground = ColorTokens.Light.onBackground,

    surface = ColorTokens.Light.surface,
    onSurface = ColorTokens.Light.onSurface,

    surfaceVariant = ColorTokens.Light.surfaceVariant,
    onSurfaceVariant = ColorTokens.Light.onSurfaceVariant,

    error = ColorTokens.Light.error,
    onError = ColorTokens.Light.onError
)

private val AuroraDarkScheme = darkColorScheme(
    primary = ColorTokens.Dark.primary,
    onPrimary = ColorTokens.Dark.onPrimary,

    background = ColorTokens.Dark.background,
    onBackground = ColorTokens.Dark.onBackground,

    surface = ColorTokens.Dark.surface,
    onSurface = ColorTokens.Dark.onSurface,

    surfaceVariant = ColorTokens.Dark.surfaceVariant,
    onSurfaceVariant = ColorTokens.Dark.onSurfaceVariant,

    error = ColorTokens.Dark.error,
    onError = ColorTokens.Dark.onError
)

private val AuroraTypography = Typography(
    displayLarge = TypographyTokens.display,
    headlineLarge = TypographyTokens.headline,
    titleLarge = TypographyTokens.title,
    bodyLarge = TypographyTokens.body,
    labelLarge = TypographyTokens.label
)

private val AuroraShapes = Shapes(
    small = ShapeTokens.small,
    medium = ShapeTokens.medium,
    large = ShapeTokens.large
)

@Composable
fun AuroraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) AuroraDarkScheme else AuroraLightScheme,
        typography = AuroraTypography,
        shapes = AuroraShapes,
        content = content
    )
}