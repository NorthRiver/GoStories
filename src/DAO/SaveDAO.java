package DAO;

import java.util.*;

/**
 * 
 */
public abstract class SaveDAO {

    /**
     * Default constructor
     */
    public SaveDAO() {
    }

    /**
     * @param player 
     * @param story 
     * @param progression 
     * @return
     */
    public void saveUserProgression(User player, Story story, Save progression) {
        // TODO implement here
        return null;
    }

    /**
     * @param player 
     * @param story 
     * @return
     */
    public Save getUserProgression(User player, Story story) {
        // TODO implement here
        return null;
    }

}