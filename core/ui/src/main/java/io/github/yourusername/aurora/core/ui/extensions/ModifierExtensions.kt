package io.github.yourusername.aurora.core.ui.extensions

import androidx.compose.ui.Modifier

/**
 * Applies [modifier] only when [condition] is true, without the
 * `if (x) Modifier.foo() else Modifier` chains that otherwise creep into
 * every screen. Generic Compose plumbing, not feature-specific.
 */
inline fun Modifier.conditional(
    condition: Boolean,
    modifier: Modifier.() -> Modifier,
): Modifier = if (condition) then(modifier()) else this
