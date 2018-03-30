package domain;

import java.util.*;

/**
 * 
 */
public class Report {

    /**
     * Default constructor
     */
    public Report() {
    }

    /**
     * 
     */
    public String text;

    /**
     * 
     */
    public Date date;

    /**
     * 
     */
    public int page;

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String story;
    
    public boolean reviewed;
    
    public String reason;
    
    public int nbReport;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public boolean isReviewed() {
		return reviewed;
	}

	public void setReviewed(boolean reviewed) {
		this.reviewed = reviewed;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getNbReport() {
		return nbReport;
	}

	public void setNbReport(int nbReport) {
		this.nbReport = nbReport;
	}
    



}