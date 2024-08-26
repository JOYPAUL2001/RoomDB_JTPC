package com.example.roomdbcrashcourse.repositories

import com.example.roomdbcrashcourse.roomDB.Note
import com.example.roomdbcrashcourse.roomDB.NoteDatabase

class Repository(private val db : NoteDatabase) {

    suspend fun upsertNote(note: Note){
        db.dao.upsertNote(note)
    }

    suspend fun deleteNote(note: Note){
        db.dao.deleteNote(note)
    }

    fun getAllNotes() = db.dao.getAllNotes()
}