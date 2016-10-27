package by.htp6.les07.service;

import java.util.Date;
import java.util.List;

import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.service.exception.ServiceException;

public interface SearchNoteBookService {
	
	List<Note> findNoteByDate(Date date) throws ServiceException;
	List<Note> findAllNotes() throws ServiceException;

}
