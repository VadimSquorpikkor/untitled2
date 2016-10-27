package by.htp6.les07.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import by.htp6.les07.bean.entity.Note;
import by.htp6.les07.dao.NBDao;
import by.htp6.les07.dao.exception.DAOException;

public class FileNBDAO implements NBDao {
	private static final String SOURCE = "resource/notes.txt";

	@Override
	public void addNote(String message, Date date) throws DAOException {
		// TODO Auto-generated method stub
		// RandomAccessFile

	}

	@Override
	public Note findNote(String text) throws DAOException {

		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader(SOURCE);
			br = new BufferedReader(reader);
			String noteFromFile;

			noteFromFile = br.readLine();
			while (noteFromFile != null) {

			}

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {/* logging */	}
			}			
		}

		return null;
	}

}
