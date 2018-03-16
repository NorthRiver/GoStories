package JavaFxUI;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class LoginView extends Scene {


	public LoginView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url = getClass().getResource("LoginFXML.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    VBox root2 = (VBox) fxmlLoader.load();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	    
	
	}



}
