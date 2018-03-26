package domain;

import java.util.*;

/**
 * 
 */
public class Story {

    /**
     * Default constructor
     */
    public Story() {
    }

    /**
     * 
     */
    public Set<Rating> ratings;

    /**
     * 
     */
    public Set<Comment> comments;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Double price;

    /**
     * 
     */
    public String category;

    /**
     * 
     */
    public int pageCount;

    /**
     * 
     */
    public Boolean published;




    /**
     * @param comment
     */
    public void addComment(Comment comment) {
        // TODO implement here
    }

    /**
     * @param rating
     */
    public void rate(Rating rating) {
        // TODO implement here
    }

    /**
     * 
     */
    public void publish() {
        // TODO implement here
    }

    /**
     * 
     */
    public void hide() {
        // TODO implement here
    }

    /**
     * 
     */
    public void save() {
        // TODO implement here
    }

    /**
     * @param page
     */
    public void addPage(Page page) {
        // TODO implement here
    }

    /**
     * @param page
     */
    public void removePage(Page page) {
        // TODO implement here
    }

    /**
     * 
     */
    public void delete() {
        // TODO implement here
    }

}