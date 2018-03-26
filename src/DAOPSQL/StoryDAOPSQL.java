package DAOPSQL;

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

    /**
     * Default constructor
     */
    public StoryDAOPSQL() {
    }

	@Override
	public Story getStoryByName(String storyName) {
		// TODO Auto-generated method stub
		return null;
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