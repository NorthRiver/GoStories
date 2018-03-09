package facades;

import DAO.FactoryDAO;
import DAO.UserDAO;
import DAOPSQL.FactoryDAOPSQL;
import domain.User;

public class FacadeLogin {

	private static FacadeLogin facadeSingleton;
	private FactoryDAO factoryDao;
	private UserDAO userDao;
	
	
	private FacadeLogin() {
		factoryDao = FactoryDAOPSQL.getFactoryDAO();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeLogin getFacadeLogin() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeLogin();	
		}
		return facadeSingleton;
	}
	
	public User login(String username, String password) {
		return userDao.connectToUser(username, password);
	}

}