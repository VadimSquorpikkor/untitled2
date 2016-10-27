package by.htp6.les07.service;

import java.util.Date;

import by.htp6.les07.service.exception.ServiceException;

public interface EditNoteBookService {
	
	void addNote(String note) throws ServiceException;
	void addNote(String note, Date date) throws ServiceException;
	void deleteNote(String note) throws ServiceException;

}
