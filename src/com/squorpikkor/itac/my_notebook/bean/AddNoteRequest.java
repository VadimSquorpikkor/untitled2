package com.squorpikkor.itac.my_notebook.bean;

//Created by SquorpikkoR on 05.10.2016.

import java.util.Date;

public class AddNoteRequest extends Request{
    private String note;
    private Date date;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
