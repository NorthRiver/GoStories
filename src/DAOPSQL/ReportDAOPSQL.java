package DAOPSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.FactoryDAO;
import DAO.ReportDAO;
import domain.Page;
import domain.Report;
import domain.Story;
import domain.User;

/**
 * 
 */
public class ReportDAOPSQL extends ReportDAO {

	Connection connectionPSQL;
	
    public ReportDAOPSQL(Connection connectionPSQL) {
    	this.connectionPSQL = connectionPSQL;
    }

    private Report queryToReport(ResultSet rs) throws SQLException {
    	Report report = new Report();
    	report.setDate(rs.getDate("reportDate"));
    	report.setNbReport(1);
    	report.setPage(rs.getInt("pageNumber")); //faut faire le dao de page aussi
    	report.setReason(rs.getString("reason"));
    	report.setReviewed(false);
    	report.setStory(rs.getString("storyTitle"));//DAO de story
    	report.setText(rs.getString("text"));
    	report.setUsername(rs.getString("username"));//DAO de user
    	return report;
    }
    
	@Override
	public Report getReportById(String reportId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Report> getLatestReport() throws SQLException {
		// TODO Auto-generated method stub
		Set<Report> reports = new HashSet<Report>();
		PreparedStatement st = connectionPSQL.prepareStatement("Select *  from report R where reviewed = false order by Date asc");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			reports.add(queryToReport(rs));
		}
		st.close();
		rs.close();
		return reports;
	}

	@Override
	public void sendReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reviewReport(Report report) {
		// TODO Auto-generated method stub
		
	}
	
	


}