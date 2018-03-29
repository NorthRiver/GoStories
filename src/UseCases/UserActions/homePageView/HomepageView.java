package UseCases.UserActions.homePageView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import facade.AbstractFacade;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class HomepageView extends Scene{

    private HomepageController viewController;

	public HomepageView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url;
		if (AbstractFacade.getUser().isAdmin) {
			url = getClass().getResource("AdminStructure.fxml");
		} else {
			url = getClass().getResource("HomeStructure.fxml");
		}
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

	public void init() {
		
	}

}