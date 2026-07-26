package io.github.yourusername.aurora.core.ui.util

import androidx.compose.runtime.Immutable

/**
 * Compose can't infer that a plain `List<T>` won't change, so it treats
 * every list parameter as unstable and skips recomposition-skipping
 * optimisations for it. Wrapping a list in this (which IS marked
 * `@Immutable`) restores that guarantee — use it for any list passed
 * into a composable that should only recompose when the list actually
 * changes.
 */
@Immutable
data class ImmutableList<T>(val items: List<T>)

fun <T> List<T>.toImmutableList(): ImmutableList<T> = ImmutableList(this)
