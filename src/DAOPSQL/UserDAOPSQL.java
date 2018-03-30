package DAOPSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
    	user.setIsAdmin(rs.getBoolean("isAdmin"));
    	user.setUsername(rs.getString("username"));
    	user.setBio(rs.getString("bio"));
    	user.setBanUntilDate(rs.getDate("bannedUpTo"));
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
				loggedUser = queryToUser(loggedUser, rs); 
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
	
	public User register(String username, String password, String email, LocalDate birthdate, String gender) throws Exception {
		User user = new User();
		user.isAdmin = false;
		return user;
	}

	@Override
	public void disableUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUser(User user) throws Exception {
		PreparedStatement st = connectionPSQL.prepareStatement("UPDATE users SET email=?, bio=?, banUntilDate=? where username=?");
		st.setString(1, user.email);
		st.setString(2, user.bio);
		st.setDate(3, new java.sql.Date(user.banUntilDate.getTime()));
		st.setString(4, user.username);
		st.executeUpdate();
		st.close();
	}


	@Override
	public ArrayList<String> getSubscribedUser(User subscriber) {
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT u.* FROM users u, subscriptions sub WHERE sub.author = ? AND sub.subscriber = u.username");
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
	public Set<User> getListOfUsers(int maxSize, int offset) throws Exception {
		Set<User> users = new HashSet<User>();
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users LIMIT ? OFFSET ?");
		st.setInt(1, maxSize);
		st.setInt(2, offset);
		ResultSet rs = st.executeQuery();
		int i = 0;
		User user;
		while( rs.next() && i<maxSize ) {
			user = queryToUser(new User(), rs);
			users.add(user);
			i++;
		}
		rs.close();
		st.close();					
		return users;
	}

	@Override
	public Set<User> getListUserByName(String text, int maxSize, int offset) throws Exception {
		Set<User> users = new HashSet<User>();
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM users WHERE username LIKE ? LIMIT ? OFFSET ?");
		st.setString(1,'%' + text + '%');
		st.setInt(2, maxSize);
		st.setInt(3, offset);
		ResultSet rs = st.executeQuery();
		int i = 0;
		User user;
		while( rs.next() && i < maxSize ) {
			user = queryToUser(new User(), rs);
			users.add(user);
			i++;
		}
		rs.close();
		st.close();					
		return users;
	}

	@Override
	public Boolean isUserSubscribed(User subscriber, User author) throws Exception {
		Boolean test = false;
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM subscriptions WHERE author = ? AND subscriber = ?");
		st.setString(1, author.username);
		st.setString(2, subscriber.username);
		ResultSet rs = st.executeQuery();
		test = rs.next();
		rs.close();
		st.close();
		return test;
	}
	
	@Override
	public void subscribeToAuthor(User subscriber, User author) throws Exception {
		PreparedStatement st = connectionPSQL.prepareStatement("INSERT INTO subscriptions (subscriber, author) VALUES (?, ?);");
		st.setString(1, subscriber.username);
		st.setString(2, author.username);
		st.executeUpdate();
		st.close();
	}

	@Override
	public void cancelSubscription(User subscriber, User author) throws Exception {
		PreparedStatement st = connectionPSQL.prepareStatement("DELETE FROM subscriptions WHERE author = ? AND subscriber = ?");
		st.setString(1, author.username);
		st.setString(2, subscriber.username);
		st.executeUpdate();
		st.close();
	}

}