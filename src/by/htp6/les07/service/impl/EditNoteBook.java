package by.htp6.les07.service.impl;

import java.util.Date;
import java.util.List;

import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.dao.DAOFactory;
import by.htp6.les07.dao.NBDao;
import by.htp6.les07.dao.exception.DAOException;
import by.htp6.les07.service.EditNoteBookService;
import by.htp6.les07.service.exception.ServiceException;

public class EditNoteBook implements EditNoteBookService{

	@Override
	public void addNote(String note) throws ServiceException {
		if (note == null || "".equals(note)){
			throw new ServiceException("message");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		NBDao dao = factory.getNBDao();
		
		try {
			dao.addNote(note, new Date());
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		
	}

	@Override
	public void addNote(String note, Date date) throws ServiceException {
		if (note == null || "".equals(note)){
			throw new ServiceException("message 1");
		}
		
		if (date == null){
			throw new ServiceException("message 2");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		NBDao dao = factory.getNBDao();
		
		try {
			dao.addNote(note, date);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public void deleteNote(String note) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
