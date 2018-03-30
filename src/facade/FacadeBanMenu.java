package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;

/**
 * 
 */
public class FacadeBanMenu extends AbstractFacade {

	private static FacadeBanMenu facadeSingleton;
	private UserDAO userDao;
	
    private FacadeBanMenu() {
    	FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
    }

    /**
     * @param user 
     * @param day 
     * @return
     */
    public void banUser(User user, int days) {
    	Date dt = (new Date((new Date()).getTime() + (days * 24 * 60 * 60)));
    	user.setBanUntilDate(dt);
    	try {
			userDao.saveUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public static FacadeBanMenu getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeBanMenu();	
		}
		return facadeSingleton;
	}


}