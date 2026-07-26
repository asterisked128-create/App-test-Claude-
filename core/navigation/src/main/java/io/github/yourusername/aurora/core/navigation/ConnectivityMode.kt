package io.github.yourusername.aurora.core.navigation

/**
 * Placeholder for the future Online ↔ Offline mode described in the
 * architecture doc's Session Manager. Nothing observes real connectivity
 * yet and nothing switches this value — it exists purely so navigation
 * and screen code has a stable type to depend on ahead of time, instead
 * of every feature module inventing its own ad hoc flag later.
 *
 * When real connectivity monitoring is implemented (in `core:common` or a
 * dedicated `core:connectivity` module), it should produce a
 * `Flow<ConnectivityMode>` using this exact enum so nothing downstream
 * needs to change.
 */
enum class ConnectivityMode {
    ONLINE,
    OFFLINE,
}
