package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;

/**
 * 
 */
public class FacadeManageUser extends AbstractFacade {

	private static FacadeManageUser facadeSingleton;
	private UserDAO userDao;
	
	
	private FacadeManageUser() {
		FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeManageUser getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeManageUser();	
		}
		return facadeSingleton;
	}
	

    public User[] getUserList(int offset) {
        // TODO implement here
        return null;
    }


	public void unBanUser(User user) {
		user.setIsBanned(false);
		userDao.saveUser(user);
		
	}

}