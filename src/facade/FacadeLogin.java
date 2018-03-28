package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;

/**
 * 
 */
public class FacadeLogin extends AbstractFacade {

	private static FacadeLogin facadeSingleton;
	private UserDAO userDao;
	
	
	private FacadeLogin() {
		FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeLogin getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeLogin();	
		}
		return facadeSingleton;
	}
	
	public User login(String username, String password) throws Exception {
		return userDao.connectToUser(username, password);
	}


}