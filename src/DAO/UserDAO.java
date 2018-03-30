package DAO;

import java.sql.SQLException;
import java.util.*;

import domain.Story;
import domain.User;

/**
 * 
 */
public abstract class UserDAO {

    public abstract User findUserByUsername(String  username) throws Exception;
   
    public abstract User connectToUser(String username, String password) throws Exception;

    public abstract void disableUser(User user);

    public abstract void saveUser(User user);

    public abstract void subscribeToAuthor(User subscriber, User author) throws Exception;

    public abstract ArrayList<String> getSubscribedUser(User subscriber) ;

    public abstract Set<User> getAllUser(String username) ;

    public  abstract User getAuthorByStory(Story story) ;

	public abstract Boolean isUserSubscribed(User subscribedTo, User subscriber) throws Exception;
	
	public abstract void cancelSubscription(User subscribedTo, User subscriber) throws Exception;

	public abstract Set<User> getListOfUsers(int maxSize, int offset) throws Exception ;

	public abstract Set<User> getListUserByName(String text, int maxSize, int offset) throws Exception ;
}