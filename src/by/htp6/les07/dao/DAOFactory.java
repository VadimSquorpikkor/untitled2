package by.htp6.les07.dao;

import by.htp6.les07.dao.impl.FileNBDAO;

public class DAOFactory {
	private static final DAOFactory INSTANCE = new DAOFactory();
	
	
	
	private NBDao nbDao = new FileNBDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return INSTANCE;
	}
	
	public NBDao getNBDao(){
		return nbDao;
	}

}
