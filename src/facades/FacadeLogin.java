package facades;

import DAO.FactoryDAO;
import DAO.UserDAO;
import DAOPSQL.FactoryDAOPSQL;
import domain.User;

public class FacadeLogin {

	private static FacadeLogin facadeSingleton;
	private UserDAO userDao;
	
	
	private FacadeLogin() {
		FactoryDAO factoryDao;
		factoryDao = FactoryDAOPSQL.getFactoryDAO();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeLogin getFacadeLogin() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeLogin();	
		}
		return facadeSingleton;
	}
	
	public User login(String username, String password) throws Exception {
		return userDao.connectToUser(username, password);
	}

}