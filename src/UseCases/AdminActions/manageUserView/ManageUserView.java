package UseCases.AdminActions.manageUserView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class ManageUserView extends Scene {

    private ManageUserController controller;
    
    public ManageUserView(AnchorPane root, double width, double height) {
    	super(root, width, height);
		URL url = getClass().getResource("UseCasesAdminActions.manageUserView.ManageUserStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
	    controller = fxmlLoader.<ManageUserController>getController();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}


    public void init() {
        controller.init();
        return;
    }

}