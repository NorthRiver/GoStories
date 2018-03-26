package DAO;

import java.util.*;

/**
 * 
 */
public abstract class StoryDAO {

    /**
     * Default constructor
     */
    public StoryDAO() {
    }

    /**
     * @param storyName 
     * @return
     */
    public Story getStoryByName(String storyName) {
        // TODO implement here
        return null;
    }

    /**
     * @param author 
     * @return
     */
    public Set<Story> getStoryByUser(User author) {
        // TODO implement here
        return null;
    }

    /**
     * @param category 
     * @return
     */
    public Set<Story> getAllStories(String category) {
        // TODO implement here
        return null;
    }

    /**
     * @param story 
     * @param comment
     */
    public void commentStory(Story story, Comment comment) {
        // TODO implement here
    }

    /**
     * @param story 
     * @param rating
     */
    public void rateAStory(Story story, Rating rating) {
        // TODO implement here
    }

    /**
     * @param story 
     * @param page
     */
    public void addPageToStory(Story story, Page page) {
        // TODO implement here
    }

    /**
     * @param story
     */
    public void saveAStory(Story story) {
        // TODO implement here
    }

    /**
     * @param story
     */
    public void disableStory(Story story) {
        // TODO implement here
    }

    /**
     * @param user 
     * @return
     */
    public Set<Story> getStoryBuyedUser(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @param story
     */
    public void buyAStory(User user, Story story) {
        // TODO implement here
    }

}