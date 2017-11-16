package com.epam.FirstModuleTasks.FirstModuleSixthTask;

public class FirstModuleSixthTask {
    public static void main(String[] args) {
        Note noteOne = new Note("First entry");
        Note noteTwo = new Note("Second entry");
        Note noteThree = new Note("Third entry");
        Notepad notepad = new Notepad();
        notepad.addNote(noteOne);
        notepad.addNote(noteTwo);
        notepad.addNote(noteThree);
        notepad.changeNote(noteOne,"Now it's new first entry");
        notepad.removeNote(noteThree);
        notepad.changeNote(noteThree,"Fake change");
        notepad.showAllNotes();
    }
}

