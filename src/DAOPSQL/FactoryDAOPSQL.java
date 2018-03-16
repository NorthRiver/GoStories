package DAOPSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAO.FactoryDAO;
import DAO.UserDAO;

public class FactoryDAOPSQL extends FactoryDAO
{
	private static FactoryDAOPSQL singletonFactory;
	private Connection connectionPSQL;
	
	private FactoryDAOPSQL (){
		try {
			connectionPSQL = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javac", "postgres", "padmin");
			System.out.println("connecte");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static FactoryDAO getFactoryDAO()
    { 
    	if ( singletonFactory == null ) {
    		singletonFactory = new FactoryDAOPSQL(); 
    	}
    	return singletonFactory;
    }
    
    public UserDAO getUserDAO() {
		return new UserDAOPSQL(connectionPSQL);
    }
}
