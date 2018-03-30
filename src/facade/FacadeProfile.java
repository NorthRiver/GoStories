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
		return facadeSingleton;
	}


    /**
     * @param user User 
     * @return
     */
    public void subscribe(User subscriber, User author) {
		try {
				userDao.subscribeToAuthor(subscriber, author);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void unsubscribe(User subscriber, User author) {
    	try {
    		userDao.cancelSubscription(subscriber, author);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
    public ArrayList<String> getSubscriptions(User user) {
        
        return userDao.getSubscribedUser(user);
    }

    public Boolean isUserSubscribed(User subscriber, User author) {
    	try {
			return userDao.isUserSubscribed(subscriber, author);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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