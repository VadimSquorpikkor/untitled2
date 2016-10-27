package com.squorpikkor.itac.my_notebook.controller;

import com.squorpikkor.itac.my_notebook.command.Command;
import com.squorpikkor.itac.my_notebook.command.impl.AddNewNote;
import com.squorpikkor.itac.my_notebook.command.impl.ReturnAllNote;

import java.util.HashMap;
import java.util.Map;

 // Created by SquorpikkoR on 05.10.2016.

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<String, Command>();

    public CommandProvider() {
        commands.put("ADD_NEW_NOTE", new AddNewNote());
        //commands.put("RETURN_ALL_NOTE", new ReturnAllNote());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        return command;
    }
}
