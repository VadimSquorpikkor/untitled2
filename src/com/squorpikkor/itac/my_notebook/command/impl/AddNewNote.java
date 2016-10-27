package com.squorpikkor.itac.my_notebook.command.impl;

import com.squorpikkor.itac.my_notebook.bean.AddNoteRequest;
import com.squorpikkor.itac.my_notebook.bean.Request;
import com.squorpikkor.itac.my_notebook.bean.Response;
import com.squorpikkor.itac.my_notebook.bean.entity.Note;
import com.squorpikkor.itac.my_notebook.bean.entity.NoteBook;
import com.squorpikkor.itac.my_notebook.command.Command;
import com.squorpikkor.itac.my_notebook.source.NoteBookProvider;

import java.util.Date;

 //Created by SquorpikkoR on 05.10.2016.

public class AddNewNote implements Command {

    @Override
    public Response execute(Request request) {

        AddNoteRequest addNoteRequest = null;
        if(request instanceof AddNoteRequest){
            addNoteRequest = (AddNoteRequest)request;
        }

        String note;
        Date date;

        note = addNoteRequest.getNote();
        date = addNoteRequest.getDate();

        Note newNote = new Note();
        newNote.setNote(note);
        newNote.setDate(date);

        NoteBookProvider source = NoteBookProvider.getInstance();
        NoteBook noteBook = source.getNoteBook();
        noteBook.addNote(newNote);

        Response response = new Response();

        response.setErrorStatus(false);
        response.setSimpleMessage("Note was added");


        return response;
    }
}
