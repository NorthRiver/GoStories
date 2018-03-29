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

    protected User queryToUser(User user, ResultSet rs) throws SQLException {
    	user.setBirthDate(rs.getDate("birthdate"));
    	user.setEmail(rs.getString("email"));
    	user.setIsAdmn(rs.getBoolean("isAdmin"));
    	user.setUsername("username");
    	return user;
    }
    
	@Override
	public User findUserByUsername(String username) throws Exception {
		User foundUser = new User();
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users WHERE username = ?");
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
			if( !rs.next() ) {
				rs.close();
				st.close();				
				throw new Exception("Username and password doesn't match.");
			} else {
				foundUser = queryToUser(foundUser, rs);
				rs.close();
				st.close();				
			}
    		} catch (SQLException e) {
			// TODO Auto-generated catch block
    			e.printStackTrace();
		}
		return foundUser;
	}

	public User connectToUser(String username, String password) throws Exception {
		User loggedUser = new User();
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
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
		//IF isBanned = false et que dans la base egale vrai, debannir
		
	}

	@Override
	public void subscribeToAuthor(User subscriber, User author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> getSubscribedUser(User subscriber) {
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT name FROM users, subscribed WHERE subscribedtoname = ? AND subscribername = users.name");
			st.setString(1, subscriber.username);
			ResultSet rs = st.executeQuery();
			ArrayList<String> names = null;
				while (rs.next()) {
				    names.add(rs.getString(""));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@Override
	public User[] getListOfEigthtUsers(int offset) {
		User userList[] = new User[8];
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users LIMIT 8 OFFSET ?");
			st.setInt(1, offset);
			ResultSet rs = st.executeQuery();
			int i =0;
			while( !rs.next() && i<8 ) {
				User user = new User();
				user.setUsername(rs.getString("name"));
				//TODO Recuperer
				user.setIsBanned(false);
				userList[i] = user;
				i++;
				
			}
				rs.close();
				st.close();				
    		} catch (SQLException e) {
			// TODO Auto-generated catch block
    			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public User[] getListUserByName(String text, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isUserSubscribed(User subscribedTo, User subscriber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelSubscription(User subscribedTo, User subscriber) {
		// TODO Auto-generated method stub
		
	}


}