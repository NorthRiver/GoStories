package facade;

import java.util.*;

import domain.User;

/**
 * 
 */
public abstract class AbstractFacade {
    /**
     * 
     */
    private static User myUser;
    /**
     * @return
     */
    public static User getUser() {
        return myUser;
    }

    public static void setUser(User user) {
    	myUser = user;
    }

}