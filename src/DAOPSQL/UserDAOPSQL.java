package DAOPSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.UserDAO;
import domain.Story;
import domain.User;

/**
 * 
 */
public class UserDAOPSQL extends UserDAO {

	Connection connectionPSQL;
	
    public UserDAOPSQL(Connection connectionPSQL) {
    	this.connectionPSQL = connectionPSQL;
    }

	@Override
	public void findUserByUsername(String username) {
		// TODO Auto-generated method stub
		
	}

	public User connectToUser(String username, String password) throws Exception {
		User loggedUser = new User();
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users WHERE name = ? AND password = ?");
			st.setString(1, username);
			st.setString(2, password);
			//ResultSet rs = st.executeQuery("SELECT * FROM users");
			ResultSet rs = st.executeQuery();
			if( !rs.next() ) {
				rs.close();
				st.close();				
				throw new Exception("Username and password doesn't match.");
			} else {
				loggedUser.setUsername(rs.getString("name"));
				loggedUser.setEmail(rs.getString("email"));
				rs.close();
				st.close();				
			}
    		} catch (SQLException e) {
			// TODO Auto-generated catch block
    			e.printStackTrace();
		}
        
		
		return loggedUser;
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