package DAO;

import java.util.*;

/**
 * 
 */
public abstract class FactoryDAO {

    /**
     * Default constructor
     */
    public FactoryDAO() {
    }

    /**
     * 
     */
    private static FactoryDAO singletonFactory;






    /**
     * @return
     */
    public StoryDAO getStoryDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public PageDAO getPageDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static FactoryDAO getFactory() {
        // TODO implement here
        return null;
    }

    /**
     * @param persistenceType 
     * @return
     */
    public static void create(String persistenceType) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public SaveDAO getSaveDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ReportDAO getReportDAO() {
        // TODO implement here
        return null;
    }

}