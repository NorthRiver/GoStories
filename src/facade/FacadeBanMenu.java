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
	
    public FacadeBanMenu() {
    	FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
    }

    /**
     * @param user 
     * @param day 
     * @return
     */
    public void banUser(User user, int day) {
    	Date dt = new Date();
    	Calendar c = Calendar.getInstance(); 
    	c.setTime(dt); 
    	c.add(Calendar.DATE, day);
    	dt = c.getTime();
    	user.setBanUntilDate(dt);
    	userDao.saveUser(user);
        
    }

	public static FacadeBanMenu getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeBanMenu();	
		}
		return facadeSingleton;
	}


}