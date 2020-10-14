package com.example.cleannotes.business.data.network.implementation

import com.example.cleannotes.business.data.network.abstraction.NoteNetworkDataSource
import com.example.cleannotes.business.domain.model.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteNetworkDataSourceImplementation
@Inject
constructor(
    private val firestoreService: NoteFireStoreService
) : NoteNetworkDataSource {
    override suspend fun inserOrUpdateNote(note: Note) = firestoreService.inserOrUpdateNote(note)

    override suspend fun deleteNote(primaryKey: String) = firestoreService.deleteNote(primaryKey)

    override suspend fun insertDeletedNote(note: Note) = firestoreService.insertDeletedNote(note)

    override suspend fun insertDeletedNotes(notes: List<Note>) =
        firestoreService.insertDeletedNotes(notes)

    override suspend fun deleteDeletedNote(note: Note) = firestoreService.deleteDeletedNote(note)

    override suspend fun getDeletedNote() = firestoreService.getDeletedNote()

    override suspend fun deleteAllNotes() = firestoreService.deleteAllNotes()

    override suspend fun searchNote(note: Note) = firestoreService.searchNote(note)

    override suspend fun getAllNotes() = firestoreService.getAllNotes()

    override suspend fun insertOrUpdateNotes(notes: List<Note>) =
        firestoreService.insertOrUpdateNotes(notes)

}