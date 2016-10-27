package com.squorpikkor.itac.my_notebook.command;


import com.squorpikkor.itac.my_notebook.bean.Request;
import com.squorpikkor.itac.my_notebook.bean.Response;

/**
 * Created by SquorpikkoR on 05.10.2016.
 */
public interface Command {
    Response execute(Request request);
}
