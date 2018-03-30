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
		//IF isBanned = false et que dans la base egale vrai, debannir
		
	}

	@Override
	public void subscribeToAuthor(User subscriber, User author) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("INSERT INTO Subscribe (id_user,id_user_users) VALUES (? , ? )");
			st.setString(1, author.id_user);
			st.setString(2, subscriber.id_user);
			st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<String> getSubscribedUser(User subscriber) {
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM Subscribe s, users u WHERE s.id_user = u.id_user AND u.name = ? AND s.id_user_users = u.id_user");
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
		try {
			PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM Subscribe WHERE id_user = ? AND id_user_users = ?");
			st.setString(1, subscribedTo.id_user);
			st.setString(2, subscriber.id_user);
			ResultSet rs = st.executeQuery();
			if( !rs.next() ) {
				rs.close();
				st.close();				
				return false;
			} 
			else 
			{
				rs.close();
				st.close();
				return true;
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
    		e.printStackTrace();
   		}
		return null;
	}

	@Override
	public void cancelSubscription(User subscribedTo, User subscriber) {
		// TODO Auto-generated method stub
		PreparedStatement st;
		try {
			st = connectionPSQL.prepareStatement("DELETE FROM Subscribe WHERE id_user = ? AND id_user_users = ?");
			st.setString(1, subscribedTo.id_user);
			st.setString(2, subscriber.id_user);
			st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void editUser(User userToChange) {
		PreparedStatement st;
		try {
			st = connectionPSQL.prepareStatement("UPDATE users SET bio = ? WHERE id_user = ?");
			st.setString(1, userToChange.bio);
			st.setString(2, userToChange.id_user);
			ResultSet rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}