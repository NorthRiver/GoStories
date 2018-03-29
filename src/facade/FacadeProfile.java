package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.Story;
import domain.User;

/**
 * 
 */
public class FacadeProfile extends AbstractFacade {

    /**
     * Default constructor
     */
	private static FacadeProfile facadeSingleton;
	private UserDAO userDao;
	
	
	private FacadeProfile() {
		FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeProfile getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeProfile();	
		}
		return facadeSingleton;}



    /**
     * @param user User 
     * @return
     */
    public void subscribe(User user) {
        // TODO implement here
        return;
    }

    /**
     * @param bio String 
     * @return
     */
    public void editBio(String bio, User userToChange) {
        // TODO implement here
    	userToChange.setBio(bio);
    	userDao.saveUser(userToChange);
        return;
    }

    /**
     * @return
     */
    public Set<String> getSubscriptions() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Story> getStories() {
        // TODO implement here
        return null;
    }

}