package io.github.yourusername.aurora.core.database

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase

/**
 * Temporary entity required by Room to compile scaffolding.
 */
@Entity(tableName = "placeholder")
data class PlaceholderEntity(
    @PrimaryKey val id: Int = 1
)

/**
 * Root Room database for Aurora.
 *
 * PlaceholderEntity will be replaced by WatchHistoryEntity, LibraryEntity, 
 * DownloadEntity, etc. as the engines are implemented.
 */
@Database(
    entities = [PlaceholderEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AuroraDatabase : RoomDatabase()
