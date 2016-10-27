package com.squorpikkor.itac.my_notebook.controller;

import com.squorpikkor.itac.my_notebook.bean.Request;
import com.squorpikkor.itac.my_notebook.bean.Response;
import com.squorpikkor.itac.my_notebook.command.Command;

 //Created by SquorpikkoR on 05.10.2016.

public class Controller {
    private final CommandProvider provider = new CommandProvider();


    public Response doAction(Request request) {
        String commandName = request.getCommandName();
        Command command = provider.getCommand(commandName);
        Response response = command.execute(request);
        return response;
    }
}
