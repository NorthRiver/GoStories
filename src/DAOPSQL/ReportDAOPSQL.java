package DAOPSQL;

import java.util.*;

import DAO.ReportDAO;
import domain.Page;
import domain.Report;
import domain.Story;
import domain.User;

/**
 * 
 */
public class ReportDAOPSQL extends ReportDAO {

    /**
     * Default constructor
     */
    public ReportDAOPSQL() {
    }

	@Override
	public Report getReportById(String reportId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Report> getLatestReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendReport(Story story, Page page, User user, Report report) {
		// TODO Auto-generated method stub
		
	}


}