package JavaFxUI;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import domain.User;
import facades.FacadeLogin;

public class LoginController {
	@FXML 
	private TextField usernameText;
	@FXML 
	private TextField pswdText;
	public void login(ActionEvent event) {
		FacadeLogin facade = FacadeLogin.getFacadeLogin();
		try {
			User moi = facade.login(usernameText.getText(), pswdText.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
