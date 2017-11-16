package com.epam.FirstModuleTasks.FirstModuleSixthTask;

import java.lang.String;




public class Note {

    private String entry;

    /**
     * default constructor of class Note
     */
    public Note(){
        this.entry = "";
    }


    /**
     * constructor of class Note
     * @param entry body of note
     */
    public Note(String entry) {
        this.entry = entry;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry;
    }
}
