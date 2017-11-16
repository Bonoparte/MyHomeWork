package com.epam.FirstModuleTasks.FirstModuleSixthTask;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private List<Note> notes;

    public Notepad() {
        notes = new ArrayList<>();
    }

    /**
     * Method adds object note into List of notes in class Notepad
     * @param note object that's will be added into list of notes
     */
    public void addNote(Note note){
        boolean add = notes.add(note);
    }

    /**
     * Method removes object note from List of notes in class Notepad
     * @param note object that's will be removed from list of notes
     */
    public void removeNote(Note note){
        boolean remove = notes.remove(note);
    }

    /**
     * Method changing entry of note if list of notes contains him
     * else it notifies that's list doesn't contains this note
     * @param note object which entry will be changed, if list contains it
     * @param change String that will replace entry of note, if list contains this note
     */
    public void changeNote(Note note, String change){
        if (notes.contains(note))
            note.setEntry(change);
        else
            System.out.println("Notepad doesn't contains this note");
    }

    /**
     * Method shows entries of all notes, which contains list of notes in Notepad
     */
    public void showAllNotes(){
        System.out.println("Notepad contains next notes:");
        for (Note s : notes) {
            System.out.println(s.getEntry());
        }
    }
}
