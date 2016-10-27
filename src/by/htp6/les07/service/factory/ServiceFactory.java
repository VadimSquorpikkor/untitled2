package by.htp6.les07.service.factory;

import by.htp6.les07.service.EditNoteBookService;
import by.htp6.les07.service.SearchNoteBookService;
import by.htp6.les07.service.impl.EditNoteBook;
import by.htp6.les07.service.impl.SearchNoteBook;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	private EditNoteBookService editNoteBookService = new EditNoteBook();
//	private EditNoteBookService editNoteBookService = new EditNDNew();
	private SearchNoteBookService searchNoteBookService = new SearchNoteBook();
	
	private ServiceFactory(){}
	
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public EditNoteBookService getEditNoteBookService(){
		return editNoteBookService;
	}
	
	public SearchNoteBookService getSearchNoteBookService(){
		return searchNoteBookService;
	}

}
