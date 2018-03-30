package UseCases.AdminActions.readReportView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import UseCases.AdminActions.banMenuView.BanMenuController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class ReadReportView extends Scene{

	
    private ReadReportController controller;

	/**
     * Default constructor
     */
    public ReadReportView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url = getClass().getResource("ReadReportStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
		    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
		    controller = fxmlLoader.<ReadReportController>getController();
		    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}

    public void init() {
        controller.init();
    }

}