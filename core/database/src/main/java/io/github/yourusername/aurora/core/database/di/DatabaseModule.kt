package io.github.yourusername.aurora.core.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.yourusername.aurora.core.database.AuroraDatabase
import javax.inject.Singleton

private const val DATABASE_NAME = "aurora.db"

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAuroraDatabase(@ApplicationContext context: Context): AuroraDatabase =
        Room.databaseBuilder(context, AuroraDatabase::class.java, DATABASE_NAME).build()
}
