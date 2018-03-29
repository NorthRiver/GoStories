package UseCases.PlayerActions.storyInfoView;

import java.io.IOException;
import java.net.URL;
import domain.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class StoryInfoView extends Scene {
	
	private StoryInfoController viewController;
	
    public StoryInfoView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url = getClass().getResource("StoryInfoStructure.fxml");
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

	/**
	 * @param story 
     * 
     */
    public void init(Story story) {
    	viewController.setStory(story);
    }

}