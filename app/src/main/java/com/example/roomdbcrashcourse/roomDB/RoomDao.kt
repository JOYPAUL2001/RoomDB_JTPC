package com.example.roomdbcrashcourse.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface RoomDao {
    @Upsert
    suspend fun upsertNote(note: Note)
    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note1")
    fun getAllNotes(): Flow<List<Note>>
}