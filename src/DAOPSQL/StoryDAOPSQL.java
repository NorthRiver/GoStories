package DAOPSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.StoryDAO;
import domain.Comment;
import domain.Page;
import domain.Rating;
import domain.Story;
import domain.User;

/**
 * 
 */
public class StoryDAOPSQL extends StoryDAO {

    private Connection connectionPSQL;

	/**
     * Default constructor
     */
    public StoryDAOPSQL(Connection connectionPSQL) {
    	this.connectionPSQL = connectionPSQL;
    }
    
    /**
     * Assign each parameters of a request to story fields.
     * @param story
     * @param result
     * @return story
     * @throws SQLException
     */

    protected Story queryToStory(Story story, ResultSet result) throws SQLException {
    	// Linked Attributes
//    	story.ratings = result.;
//    	story.comments = result.;
//    	story.pageCount = result.;
//    	story.category = result.getString("category");
    	
        // Atomic Attributes
        story.title = result.getString("title");
        story.authorName = result.getString("author");
        story.price = result.getDouble("price");
        story.published = result.getBoolean("published");
        story.sumUp = result.getString("sumUp");
    	return story;
    }
    

//	protected String storyToQueryString(Story story) {
//	String queryString = "("
//			+ story.title + ","
//			+ ")";
//	
//	return queryString;
//}
    
	@Override
	public Story getStoryByName(String storyName) throws Exception {
		Story story = new Story();
		PreparedStatement st = connectionPSQL.prepareStatement("SELECT * FROM stories WHERE title = ?");
		st.setString(1, storyName);
		ResultSet rs = st.executeQuery();
		// Does the response exists
		if( !rs.next() ) {
			rs.close();
			st.close();				
			throw new Exception("No Story Found for that name");
		} else {
			story = queryToStory(story, rs);
			rs.close();
			st.close();				
		}
    	
		return story;
	}

	@Override
	public Set<Story> getStoryByUser(User author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Story> getAllStories(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commentStory(Story story, Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateAStory(Story story, Rating rating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPageToStory(Story story, Page page) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAStory(Story story) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disableStory(Story story) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Story> getStoryBuyedUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buyAStory(User user, Story story) {
		// TODO Auto-generated method stub
		
	}


}