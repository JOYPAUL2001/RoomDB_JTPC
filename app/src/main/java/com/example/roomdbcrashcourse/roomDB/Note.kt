package com.example.roomdbcrashcourse.roomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note1")
data class Note(
    val noteName: String,
    val noteBody: String,
    @PrimaryKey(autoGenerate = true)
    val noteId : Int = 0
)
