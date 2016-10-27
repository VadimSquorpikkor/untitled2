package com.squorpikkor.itac.my_stuff.money_assist;

import java.util.HashMap;

/**
 * Created by SquorpikkoR on 13.10.2016.
 */
public class CommandProvider {

    private HashMap<String, Command> command = new HashMap<>();

    public CommandProvider() {
        command.put("add", new AddMoney());
        command.put("reduce", new ReduceMoney());
    }

    public Command getTheCommand(String commandName) {
        Command c;
        c = command.get(commandName);
        return c;
    }


    /*private HashMap<String, String> command = new HashMap<>();

    public CommandProvider() {
        command.put("add", "Money is added");
        command.put("reduce", "Money is reduced");
    }

    public String getTheCommand(String commandName) {
        String c;
        c = command.get(commandName);
        return c;
    }*/
}
