package DAO;

import java.util.*;

/**
 * 
 */
public abstract class ReportDAO {

    /**
     * Default constructor
     */
    public ReportDAO() {
    }

    /**
     * @param reportId 
     * @return
     */
    public Report getReportById(String reportId) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Report> getLatestReport() {
        // TODO implement here
        return null;
    }

    /**
     * @param story 
     * @param page 
     * @param user 
     * @param report
     */
    public void sendReport(Story story, Page page, User user, Report report) {
        // TODO implement here
    }

}