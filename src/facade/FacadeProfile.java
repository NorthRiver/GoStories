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
    public void subscribe(User userSubscribed, User userSubscriber) {
		if (userDao.isUserSubscribed(userSubscribed, userSubscriber)) {
			userDao.cancelSubscription(userSubscribed, userSubscriber);
		}
		else {
			userDao.subscribeToAuthor(userSubscriber, userSubscribed);
		}
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
    public Set<String> getSubscriptions(User user) {
        
        return userDao.getSubscribedUser(user);
    }

    public Boolean isUserSubscribed(User subscribed, User subscriber) {
    	return userDao.isUserSubscribed(subscribed, subscriber);    	
    }
    /**
     * @return
     */
    public Set<Story> getStories() {
        // TODO implement here
        return null;
    }

}