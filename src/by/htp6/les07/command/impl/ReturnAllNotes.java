package by.htp6.les07.command.impl;

import java.util.Date;
import java.util.List;

import by.htp6.les07.bean.Request;
import by.htp6.les07.bean.Response;
import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.command.Command;
import by.htp6.les07.service.SearchNoteBookService;
import by.htp6.les07.service.exception.ServiceException;
import by.htp6.les07.service.factory.ServiceFactory;

public class ReturnAllNotes implements Command{

	@Override
	public Response execute(Request request) {	
		
		ServiceFactory factory = ServiceFactory.getInstance();
		SearchNoteBookService searchService = factory.getSearchNoteBookService();
		
		List<Note> notes;
		Response response= new Response();
		try {
			
			notes = searchService.findAllNotes();
			response.setErrorStatus(false);
			response.setNotes(notes);

		} catch (ServiceException e) {
			
			response.setErrorStatus(true);
			response.setErrorMessage("error message");
			
		}		

		return response;
		
	}

}
