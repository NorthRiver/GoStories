package facades;

import java.util.*;

/**
 * 
 */
public class FacadeManageStories extends AbstractFacade {

    /**
     * Default constructor
     */
    public FacadeManageStories() {
    }

    /**
     * @param user 
     * @return
     */
    public Story[] getStoriesByUser(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @param name 
     * @return
     */
    public Story[] getStoriesByUserAndName(User user, String name) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    private abstract void AbstractFacade();

}