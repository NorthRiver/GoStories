package DAO;

import java.util.*;

import domain.Story;
import domain.User;

/**
 * 
 */
public abstract class UserDAO {

    /**
     * Default constructor
     */
    public UserDAO() {
    }

    /**
     * @param  username 
     * @return
     */
    public abstract void findUserByUsername(String  username);
   
    public abstract User connectToUser(String username, String password);

    public abstract void disableUser(User user);

    public abstract void saveUser(User user);

    public abstract void subscribeToAuthor(User subscriber, User author);

    public abstract  Set<User> getSubscribedUser(User subscriber) ;

    public abstract Set<User> getAllUser(String username) ;

    public  abstract User getAuthorByStory(Story story) ;

}