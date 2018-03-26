package DAO;

import java.util.*;

import domain.Save;
import domain.Story;
import domain.User;


public abstract class SaveDAO {


    public SaveDAO() {
    }

    public abstract void saveUserProgression(User player, Story story, Save progression);

    public abstract Save getUserProgression(User player, Story story);

}