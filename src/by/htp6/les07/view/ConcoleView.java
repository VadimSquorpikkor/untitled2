package by.htp6.les07.view;

import java.util.Date;
import java.util.List;

import by.htp6.les07.bean.AddNoteRequest;
import by.htp6.les07.bean.DeleteNoteRequest;
import by.htp6.les07.bean.Request;
import by.htp6.les07.bean.Response;
import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.controller.Controller;

public class ConcoleView {

	public static void main(String[] args) {
		Controller controller = new Controller();

		//////////////////////////////////////////////////////////////
		// add new note
		AddNoteRequest addNewNoteReq = new AddNoteRequest();
		addNewNoteReq.setCommandName("ADD_NEW_NOTE");
		addNewNoteReq.setNote("my first note");
		addNewNoteReq.setDate(new Date());

		Response response = controller.doAction(addNewNoteReq);

		if (!response.isErrorStatus()) {
			System.out.println(response.getSimpleMessage());
		} else {
			System.out.println(response.getErrorMessage());
		}

		/////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////
		// add new note
		addNewNoteReq = new AddNoteRequest();
		addNewNoteReq.setCommandName("ADD_NEW_NOTE");
		addNewNoteReq.setNote("my second note");
		addNewNoteReq.setDate(new Date());

		response = controller.doAction(addNewNoteReq);

		if (!response.isErrorStatus()) {
			System.out.println(response.getSimpleMessage());
		} else {
			System.out.println(response.getErrorMessage());
		}

		/////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////
		// add new note
		Request request = new Request();
		request.setCommandName("RETURN_ALL_NOTES");

		response = controller.doAction(request);

		if (!response.isErrorStatus()) {
			List<Note> notes = response.getNotes();

			for (Note note : notes) {
				System.out.println(note.getNote() + ", " + note.getDate());
			}

		} else {
			System.out.println(response.getErrorMessage());
		}

		/////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////
		// delete note
		DeleteNoteRequest deleteRequest = new DeleteNoteRequest();
		deleteRequest.setCommandName("DELETE_NOTE");
		deleteRequest.setDeleteNote("my second note");

		response = controller.doAction(deleteRequest);

		if (!response.isErrorStatus()) {
			System.out.println(response.getSimpleMessage());
		} else {
			System.out.println(response.getErrorMessage());
		}
		/////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////
		// add new note
		request = new Request();
		request.setCommandName("RETURN_ALL_NOTES");

		response = controller.doAction(request);

		if (!response.isErrorStatus()) {
			List<Note> notes = response.getNotes();

			for (Note note : notes) {
				System.out.println(note.getNote() + ", " + note.getDate());
			}

		} else {
			System.out.println(response.getErrorMessage());
		}
	}

}
