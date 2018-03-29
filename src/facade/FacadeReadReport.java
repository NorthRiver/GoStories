package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.ReportDAO;
import domain.Report;

/**
 * 
 */
public class FacadeReadReport extends AbstractFacade {

	private static FacadeReadReport instance;
	private ReportDAO reportDAO;
	
    /**
     * Default constructor
     */
    private FacadeReadReport() {
    	FactoryDAO factoryDAO = FactoryDAO.getFactory();;
    	reportDAO = factoryDAO.getReportDAO();
    	
    }
    
    //Singleton
    public static FacadeReadReport getFacadeReadReport(){
    	if(instance==null){
    		instance = new FacadeReadReport();
    	}
    	return instance;
    }

    /**
     * @param rep 
     * @return
     */
    public void deleteReport(Report rep) {
        // TODO implement here
        return;
    }

    /**
     * @param date 
     * @return
     */
    public Report[] getReportListByDate(Date date) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public Report[] getReportListByUser(String user) {
        // TODO implement here
        return null;
    }

    /**
     * @param story 
     * @return
     */
    public Report[] getReportListByStory(String story) {
        // TODO implement here
        return null;
    }

    /**
     * @param story 
     * @param user 
     * @param date 
     * @return
     */
    public Report[] getReportListMulti(String story, String user, Date date) {
        // TODO implement here
        return null;
    }

}