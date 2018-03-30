package DAO;

import java.sql.SQLException;
import java.util.*;

import domain.Link;
import domain.Page;
import domain.Story;


public abstract class PageDAO {

 

    

    public abstract Page getPageByNumber(String storyTitle, int pageNumber) throws Exception;
     
    public abstract void addLink(Page page, Link link);

    public abstract void removeLink(Page page, Link link);

    

}