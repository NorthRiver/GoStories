package UseCases.AdminActions.banMenuView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import domain.User;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */



public class BanMenuView extends Scene {





    public BanMenuView(AnchorPane root, double width, double height) {
    	super(root, width, height);
		URL url = getClass().getResource("BanMenuStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}

	public void init(User user) {

        // TODO implement here
        return;
    }

}