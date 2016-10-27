package com.squorpikkor.itac.my_notebook.source;

import com.squorpikkor.itac.my_notebook.bean.entity.NoteBook;

/**
 * Created by SquorpikkoR on 05.10.2016.
 */
public class NoteBookProvider {
    private static final NoteBookProvider instance = new NoteBookProvider();

    private NoteBook notebook = new NoteBook();

    private NoteBookProvider(){};

    public static NoteBookProvider getInstance() {
        return instance;
    }

    public NoteBook getNoteBook() {
        return notebook;
    }

}
