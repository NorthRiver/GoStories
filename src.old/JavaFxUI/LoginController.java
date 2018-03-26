package JavaFxUI;

import domain.User;
import facades.FacadeLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
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
