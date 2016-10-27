package by.htp6.les07.command.impl;

import by.htp6.les07.bean.AddNoteRequest;
import by.htp6.les07.bean.DeleteNoteRequest;
import by.htp6.les07.bean.Request;
import by.htp6.les07.bean.Response;
import by.htp6.les07.command.Command;
import by.htp6.les07.service.EditNoteBookService;
import by.htp6.les07.service.exception.ServiceException;
import by.htp6.les07.service.factory.ServiceFactory;

public class DeleteNote implements Command{

	@Override
	public Response execute(Request request) {
		DeleteNoteRequest deleteNoteRequest = null;
		if(request instanceof DeleteNoteRequest){
			deleteNoteRequest = (DeleteNoteRequest)request;
		}
		
		String note;
		
		note = deleteNoteRequest.getDeleteNote();
	
		ServiceFactory factory = ServiceFactory.getInstance();
		EditNoteBookService editService = factory.getEditNoteBookService();
		
		Response response= new Response();
		try {
			editService.deleteNote(note);
			response.setErrorStatus(false);
			response.setSimpleMessage("Note was deleted");
			System.out.println("1");
		} catch (ServiceException e) {
			response.setErrorStatus(true);
			response.setErrorMessage("Note wasn't deleted");
			System.out.println("2");
		}
		
		return response;
	}

}
