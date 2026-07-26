package io.github.yourusername.aurora.core.common.result

/**
 * Generic wrapper for anything that can succeed, fail, or be loading —
 * named to avoid clashing with [kotlin.Result]. Used by repository and
 * use-case return types once the Content Engine is implemented.
 */
sealed class AuroraResult<out T> {
    data class Success<out T>(val data: T) : AuroraResult<T>()
    data class Error(val throwable: Throwable, val message: String? = null) : AuroraResult<Nothing>()
    data object Loading : AuroraResult<Nothing>()
}
