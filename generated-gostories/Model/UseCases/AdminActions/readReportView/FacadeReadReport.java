package UseCases.AdminActions.readReportView;

import java.util.*;

/**
 * 
 */
public class FacadeReadReport extends AbstractFacade {

    /**
     * Default constructor
     */
    public FacadeReadReport() {
    }


    /**
     * @param rep 
     * @return
     */
    public void deleteReport(Report rep) {
        // TODO implement here
        return null;
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

    /**
     * 
     */
    private abstract void AbstractFacade();

}