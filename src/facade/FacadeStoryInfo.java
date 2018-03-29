package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.Story;
import domain.User;

/**
 * 
 */
public class FacadeStoryInfo extends AbstractFacade {

	private static FacadeStoryInfo singletonFacade;
	private UserDAO userDao;
	
    private FacadeStoryInfo() {
    	this.userDao = FactoryDAO.getFactory().getUserDAO();
    }
    
	public static FacadeStoryInfo getFacade() {
		if (singletonFacade == null ) {
			singletonFacade = new FacadeStoryInfo();
		}
		return singletonFacade;
	}


    /**
     * @param player 
     * @param story
     */
    public void buyAStory(User player, Story story) {
        // TODO implement here
    }

    /**
     * @param story 
     * @return
     */
    public User getAuthor(String username) {
        try {
			return userDao.findUserByUsername(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}