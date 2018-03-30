package DAOPSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.PageDAO;
import domain.Link;
import domain.Page;
import domain.Story;

/**
 * 
 */
public class PageDAOPSQL extends PageDAO {

    private Connection connectionPSQL;

	/**
     * Default constructor
     * @param connectionPSQL 
     */
    public PageDAOPSQL(Connection connectionPSQL) {
    	this.connectionPSQL = connectionPSQL;
    }

    protected Page queryToPage(Page page, ResultSet rs) throws SQLException {
    	page.storyTitle = rs.getString("storyTitle");
    	page.pageNumber = rs.getInt("pageNumber");
    	page.text1 = rs.getString("text1");
    	page.text2 = rs.getString("text2");
    	page.links = getLinks(page);
    	return page;
    }
    
    protected Link queryToLink(Link link, ResultSet rs) throws SQLException {
    	link.linkText = rs.getString("sentence");
    	link.nextPage = rs.getInt("nextPage");
    	return link;
    };
    
    protected  Set<Link> getLinks(Page page) throws SQLException{
    	Set<Link> links = new HashSet<Link>(); 
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM links WHERE storyTitle = ? AND originalPage = ?");
		st.setString(1, page.storyTitle);
		st.setInt(2, page.pageNumber);
		ResultSet rs = st.executeQuery();
		// Does the response exists
		while( rs.next() ) {
			links.add(queryToLink(new Link(), rs));
		}
		rs.close();
		st.close();
		return links;
    }
    
	@Override
	public Page getPageByNumber(String storyTitle, int pageNumber) throws Exception {
		Page page = new Page();
	
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM pages WHERE storyTitle = ? AND pageNumber = ?");
		st.setString(1, storyTitle);
		st.setInt(2, pageNumber);
		ResultSet rs = st.executeQuery();
		// Does the response exists
		if( !rs.next() ) {
			rs.close();
			st.close();				
			throw new Exception("No Story Found for that name");
		} else {
			page = queryToPage(page, rs);
			rs.close();
			st.close();				
		}
	
		return page;
	}

	@Override
	public void addLink(Page page, Link link) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLink(Page page, Link link) {
		// TODO Auto-generated method stub
		
	}


}