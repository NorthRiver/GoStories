package DAOPSQL;
import domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.UserDAO;

public class UserDAOPSQL implements UserDAO {
	
	Connection connectionPSQL;
	
	public UserDAOPSQL(Connection connectionPSQL){
		this.connectionPSQL = connectionPSQL;
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
				throw new Exception("Username and password doesn't match.");
			} else {
				loggedUser.setAccountName(rs.getString("name"));
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
	
	//
    @Override
    public void delete(int userId) {
        // delete user from user table
    }
    @Override
    public User[] findAll() {
        // get a list of all users from user table
        return null;
    }

    @Override
    public User findByKey(int userId) {
        // get a user information if we supply unique userid
        return null;
    }

    @Override
    public void insert(User user) {
        // insert user into user table
    }

    @Override
    public void update(User user) {
        // update user information in user table
    }
    
}