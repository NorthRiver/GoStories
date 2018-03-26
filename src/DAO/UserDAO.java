package DAO;

import java.util.*;

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
    public void findUserByUsername(String  username) {
        // TODO implement here
        return null;
    }

    /**
     * @param username 
     * @param password 
     * @return
     */
    public User connectToUser(String username, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param user
     */
    public void disableUser(User user) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public void saveUser(User user) {
        // TODO implement here
    }

    /**
     * @param subscriber 
     * @param author
     */
    public void subscribeToAuthor(User subscriber, User author) {
        // TODO implement here
    }

    /**
     * @param subscriber 
     * @return
     */
    public Set<User> getSubscribedUser(User subscriber) {
        // TODO implement here
        return null;
    }

    /**
     * @param username 
     * @return
     */
    public Set<User> getAllUser(String username) {
        // TODO implement here
        return null;
    }

    /**
     * @param story 
     * @return
     */
    public User getAuthorByStory(Story story) {
        // TODO implement here
        return null;
    }

}