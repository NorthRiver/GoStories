package UseCases.PlayerActions.playStoryView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import domain.Page;
import domain.Story;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class PlayStoryView extends Scene{

	private PlayStoryController viewController; 
	
    public PlayStoryView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url = getClass().getResource("StoryPageStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
		    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
		    root.getChildren().add(root2);
		    viewController = fxmlLoader.getController();   
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}

    public void init(Page page, Story story) {
    	viewController.setStory(story);
    	viewController.setPage(page);
    }

}