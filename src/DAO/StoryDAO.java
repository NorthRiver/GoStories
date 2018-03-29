package DAO;

import java.util.*;

import domain.Comment;
import domain.Page;
import domain.Rating;
import domain.Story;
import domain.User;


public abstract class StoryDAO {


    public StoryDAO() {
    }


    public abstract Story getStoryByName(String storyName) throws Exception;

    public abstract Set<Story> getStoryByUser(User author);

    public abstract Set<Story> getAllStories(String category);

    public abstract void commentStory(Story story, Comment comment);

    public abstract void rateAStory(Story story, Rating rating);

    public abstract void addPageToStory(Story story, Page page);

    public abstract void saveAStory(Story story);

    public abstract void disableStory(Story story);

    public abstract Set<Story> getStoryBuyedUser(User user);

    public abstract void buyAStory(User user, Story story);

}