package UseCases.AdminActions.renameView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import UseCases.AdminActions.manageUserView.ManageUserController;
import domain.User;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class RenameView extends Scene{

    /**
     * Default constructor
     */


	private RenameController controller;
	
    public RenameView(AnchorPane root, double width, double height) {
    	super(root, width, height);
		URL url = getClass().getResource("RenameStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
	    controller = fxmlLoader.<RenameController>getController();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}

	/**
     * @param user 
     * @return
     */
    public void init(User user) {
    	 controller.init(user);
         return;
    }

}