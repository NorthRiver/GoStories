package DAOPSQL;

import DAO.FactoryDAO;
import DAO.UserDAO;

public class FactoryDAOPSQL extends FactoryDAO
{
	private static FactoryDAOPSQL singletonFactory;
	
	private FactoryDAOPSQL (){
		// CONNECTION à LA DB ?
	}
	
    public static FactoryDAO getFactoryDAO()
    { 
    	if ( singletonFactory == null ) {
    		singletonFactory = new FactoryDAOPSQL(); 
    	}
    	return singletonFactory;
    }
    
    public UserDAO getUserDAO() {
		return new UserDAOPSQL();
    }
}
