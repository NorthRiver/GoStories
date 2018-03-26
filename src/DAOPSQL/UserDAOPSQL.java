package DAOPSQL;

import java.sql.Connection;
import java.util.*;

import DAO.UserDAO;
import domain.Story;
import domain.User;

/**
 * 
 */
public class UserDAOPSQL extends UserDAO {

    /**
     * Default constructor
     * @param connectionPSQL 
     */
    public UserDAOPSQL(Connection connectionPSQL) {
    }

	@Override
	public void findUserByUsername(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User connectToUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disableUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribeToAuthor(User subscriber, User author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<User> getSubscribedUser(User subscriber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<User> getAllUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAuthorByStory(Story story) {
		// TODO Auto-generated method stub
		return null;
	}


}