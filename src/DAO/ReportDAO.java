package DAO;

import java.util.*;

import domain.Page;
import domain.Report;
import domain.Story;
import domain.User;


public abstract class ReportDAO {


    public abstract Report getReportById(String reportId);


    public abstract Set<Report> getLatestReport();


    public abstract void sendReport(Story story, Page page, User user, Report report);

}