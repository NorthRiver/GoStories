package UseCases.UserActions.loginView;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class LoginView extends Scene {


	public LoginView(AnchorPane root, double width, double height) {
		super(root, width, height);
		URL url = getClass().getResource("LoginStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	    
	
	}




}
