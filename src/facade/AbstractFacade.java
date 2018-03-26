package facades;

import java.util.*;

/**
 * 
 */
public abstract class AbstractFacade {

    /**
     * Default constructor
     */
    public AbstractFacade() {
    }

    /**
     * 
     */
    private static User myUser;

    /**
     * 
     */
    private abstract void AbstractFacade();

    /**
     * @return
     */
    public static User getUser() {
        // TODO implement here
        return null;
    }

    /**
     * @param user
     */
    public static void setUser(User user) {
        // TODO implement here
    }

}