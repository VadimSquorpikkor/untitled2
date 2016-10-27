package com.squorpikkor.itac.my_notebook.bean.entity;

import java.util.ArrayList;
import java.util.List;

  //Created by SquorpikkoR on 05.10.2016.

public class NoteBook {
    private List<Note> notes;

    public NoteBook() {
        notes = new ArrayList<Note>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);

    }


}
