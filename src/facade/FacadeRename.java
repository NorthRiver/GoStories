package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;

/**
 * 
 */
public class FacadeRename extends AbstractFacade {

	private static FacadeRename facadeSingleton;
	private UserDAO userDao;
    /**
     * Default constructor
     */
    public FacadeRename() {
		FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
    }
	public static FacadeRename getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeRename();	
		}
		return facadeSingleton;
	}
    /**
     * @param user 
     * @param name 
     * @return
     */
    public void renameUser(User user, String name) {
    	user.setUsername(name);
    	userDao.saveUser(user);
        return;
    }

}