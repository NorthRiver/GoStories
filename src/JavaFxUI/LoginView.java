package JavaFxUI;

import javafx.event.*;
import java.io.IOException;
import java.net.URL;

import domain.User;
import facades.FacadeLogin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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

	@FXML 
	private TextField usernameText;
	@FXML 
	private TextField pswdText;
	public void login(ActionEvent event) {
		FacadeLogin facade = FacadeLogin.getFacadeLogin();
		try {
			User moi = facade.login(usernameText.getText(), pswdText.getText());
			System.out.println(moi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}


}
