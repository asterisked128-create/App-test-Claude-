package io.github.yourusername.aurora.core.common.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.yourusername.aurora.core.common.dispatcher.DefaultDispatcherProvider
import io.github.yourusername.aurora.core.common.dispatcher.DispatcherProvider

@Module
@InstallIn(SingletonComponent::class)
abstract class DispatcherModule {

    @Binds
    abstract fun bindDispatcherProvider(
        impl: DefaultDispatcherProvider
    ): DispatcherProvider
}
