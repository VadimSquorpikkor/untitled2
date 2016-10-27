package com.squorpikkor.itac.my_notebook.bean;

import com.squorpikkor.itac.my_notebook.bean.entity.Note;

import java.util.List;

/**
 * Created by SquorpikkoR on 05.10.2016.
 */
public class Response {
    private boolean errorStatus;
    private String errorMessage;
    private String simpleMessage;
    private List<Note> notes;

    public boolean isErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSimpleMessage() {
        return simpleMessage;
    }

    public void setSimpleMessage(String simpleMessage) {
        this.simpleMessage = simpleMessage;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
