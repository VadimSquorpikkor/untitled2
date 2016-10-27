package com.squorpikkor.itac.my_notebook.bean.entity;

import java.util.Date;

/**
 * Created by SquorpikkoR on 05.10.2016.
 */
public class Note {
  private String note;
  private Date date;

    public String getNote() {
        return note;
    }

    public void setNote(String name) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
