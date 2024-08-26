package com.example.roomdbcrashcourse.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(
    entities = [Note::class],
    version = 2
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val dao : RoomDao

    companion object {
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Rename the existing table
                database.execSQL("ALTER TABLE Note RENAME TO note1")
            }
        }
    }
}