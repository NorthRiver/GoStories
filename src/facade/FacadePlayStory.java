package facade;

import java.util.*;

import domain.Page;
import domain.Story;
import domain.User;

/**
 * 
 */
public class FacadePlayStory extends AbstractFacade {

    /**
     * Default constructor
     */
    public FacadePlayStory() {
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
     * @param page 
     * @param story 
     * @return
     */
    public Page getNextPage(Page page, Story story) {
        // TODO implement here
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