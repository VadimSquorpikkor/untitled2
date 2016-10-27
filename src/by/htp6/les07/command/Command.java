package by.htp6.les07.command;

import by.htp6.les07.bean.Request;
import by.htp6.les07.bean.Response;

public interface Command {
	
	Response execute(Request request);// public abstract

}
