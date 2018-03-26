package DAO;

import java.util.*;

/**
 * 
 */
public abstract class PageDAO {

    /**
     * Default constructor
     */
    public PageDAO() {
    }

    /**
     * @param story 
     * @param pageNumber 
     * @return
     */
    public Page getPageByNumber(Story story, String pageNumber) {
        // TODO implement here
        return null;
    }

    /**
     * @param page 
     * @param link
     */
    public void addLink(Page page, Link link) {
        // TODO implement here
    }

    /**
     * @param page 
     * @param link
     */
    public void removeLink(Page page, Link link) {
        // TODO implement here
    }

}