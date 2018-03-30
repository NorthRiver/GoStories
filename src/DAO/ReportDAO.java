package DAO;

import java.sql.SQLException;
import java.util.*;

import domain.Page;
import domain.Report;
import domain.Story;
import domain.User;


public abstract class ReportDAO {


    public abstract Report getReportById(String reportId);


    public abstract Set<Report> getLatestReport() throws SQLException;


    public abstract void sendReport(Report report);
    
    public abstract void reviewReport(Report report);

}