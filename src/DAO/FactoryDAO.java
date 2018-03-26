package DAO;

import java.util.*;

import DAOPSQL.FactoryDAOPSQL;

/**
 * 
 */
public abstract class FactoryDAO {


    static protected FactoryDAO singleFactory;


    public static FactoryDAO getFactory() {
        // TODO implement here
        return singleFactory;
    }

    /**
     * @param persistenceType 
     * @return
     */
    public static FactoryDAO create(String persistenceType) {
    	switch (persistenceType) {
		case "PSQL":
		default:
			singleFactory = new FactoryDAOPSQL();
		}
		return singleFactory;
    }


    public abstract SaveDAO getSaveDAO() ;
    public abstract ReportDAO getReportDAO();
    public abstract UserDAO getUserDAO();
    public abstract StoryDAO getStoryDAO();
    public abstract PageDAO getPageDAO();


}