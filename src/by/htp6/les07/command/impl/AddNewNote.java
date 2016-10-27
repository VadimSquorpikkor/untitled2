package by.htp6.les07.command.impl;

import java.util.Date;

import by.htp6.les07.bean.AddNoteRequest;
import by.htp6.les07.bean.Request;
import by.htp6.les07.bean.Response;
import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.command.Command;
import by.htp6.les07.service.EditNoteBookService;
import by.htp6.les07.service.exception.ServiceException;
import by.htp6.les07.service.factory.ServiceFactory;
import by.htp6.les07.service.impl.EditNoteBook;

public class AddNewNote implements Command {

	@Override
	public Response execute(Request request) {
		
		AddNoteRequest addNoteRequest = null;
		if(request instanceof AddNoteRequest){
			addNoteRequest = (AddNoteRequest)request;
		}
		
		String note;
		Date date;
		
		note = addNoteRequest.getNote();
		date = addNoteRequest.getDate();
		
		ServiceFactory factory = ServiceFactory.getInstance();
		EditNoteBookService editService = factory.getEditNoteBookService();
		
		Response response= new Response();
		try {
			editService.addNote(note, date);
			response.setErrorStatus(false);
			response.setSimpleMessage("Note was added");
		} catch (ServiceException e) {
			response.setErrorStatus(true);
			response.setErrorMessage("Note wasn't added");
		}
		
		return response;
	}

}

