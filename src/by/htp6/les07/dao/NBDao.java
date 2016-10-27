package by.htp6.les07.dao;

import java.util.Date;

import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.dao.exception.DAOException;

public interface NBDao {
	
	void addNote(String message, Date date) throws DAOException;
	Note findNote(String text) throws DAOException;	

}
