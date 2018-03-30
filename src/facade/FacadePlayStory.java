package facade;

import java.util.*;

import DAO.FactoryDAO;
import domain.Page;
import domain.Story;
import domain.User;

/**
 * 
 */
public class FacadePlayStory extends AbstractFacade {

    private static FacadePlayStory singletonFacade;
    private FacadePlayStory() {	
    }

    public static FacadePlayStory getFacade() {
		if (singletonFacade == null) {
			singletonFacade = new FacadePlayStory();
		}
		return singletonFacade;
	}

    /**
     * @param story 
     * @param page 
     * @param user
     */
    public void saveProgression(Story story, Page page, User user) {
        // TODO implement here
    }

    /**
     * @param title 
     * @param nextPage 
     * @return
     */
    public Page getNextPage(String title, int nextPage) {
        try {
			return FactoryDAO.getFactory().getPageDAO().getPageByNumber(title, nextPage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    /**
     * @param player 
     * @param story
     */
    public void loadPreviousSave(User player, Story story) {
        // TODO implement here
    }
}