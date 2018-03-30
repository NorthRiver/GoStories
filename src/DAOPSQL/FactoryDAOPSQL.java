package DAOPSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAO.FactoryDAO;
import DAO.PageDAO;
import DAO.ReportDAO;
import DAO.SaveDAO;
import DAO.StoryDAO;
import DAO.UserDAO;

/**
 * 
 */
public class FactoryDAOPSQL extends FactoryDAO {
    private Connection connectionPSQL;
    /**
     * Default constructor
     */
    public FactoryDAOPSQL() {
    	try {
			connectionPSQL = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javac", "postgres", "padmin");
			System.out.println("connecte");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public SaveDAO getSaveDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ReportDAO getReportDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StoryDAO getStoryDAO() {
		return new StoryDAOPSQL(connectionPSQL);
	}
	@Override
	public PageDAO getPageDAO() {
		return new PageDAOPSQL(connectionPSQL);
	}
	@Override
	public UserDAO getUserDAO() {
		return new UserDAOPSQL(connectionPSQL);
	}








}