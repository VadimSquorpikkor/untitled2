package com.squorpikkor.itac.my_stuff.map_array;

import java.util.HashMap;
import java.util.Map;


 //Created by SquorpikkoR on 02.10.2016.

public class SortMap {

    private Map<String, String> commands = new HashMap<String, String>();

    public SortMap() {
        commands.put("ADD_NEW_NOTE", "Note #1");
        commands.put("RETURN_ALL_NOTES", "Note #2");
    }


    public String getCommand(String commandName) {
        //Command command;
        String command = commands.get(commandName);
        return command;
    }




}



