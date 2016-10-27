package by.htp6.les07.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp6.les07.command.Command;
import by.htp6.les07.command.impl.AddNewNote;
import by.htp6.les07.command.impl.DeleteNote;
import by.htp6.les07.command.impl.ReturnAllNotes;

class CommandProvider {
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	CommandProvider() {
		commands.put("ADD_NEW_NOTE", new AddNewNote());
		commands.put("RETURN_ALL_NOTES", new ReturnAllNotes());
		commands.put("DELETE_NOTE", new DeleteNote());
	}
	
	
	public Command getCommand(String commandName){
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
