package DAO;

import java.util.*;

import domain.Link;
import domain.Page;
import domain.Story;


public abstract class PageDAO {

 

    

    public abstract Page getPageByNumber(Story story, String pageNumber);
     
    public abstract void addLink(Page page, Link link);

    public abstract void removeLink(Page page, Link link);

    

}