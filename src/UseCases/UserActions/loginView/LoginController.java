package UseCases.UserActions.loginView;

import java.util.*;

import JavaFxUI.ViewManager;
import domain.User;
import facade.AbstractFacade;
import facade.FacadeLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
	@FXML 
	private TextField usernameText;
	@FXML 
	private TextField pswdText;
	@FXML
	private Label alertLabel;
	
	
	public void login(ActionEvent event) {
		FacadeLogin facade = FacadeLogin.getFacade();
		try {
			User moi = facade.login(usernameText.getText(), pswdText.getText());
			AbstractFacade.setUser(moi);
			ViewManager.goToHome();
		} catch (Exception e) {
			alertLabel.setText(e.getMessage());
		}
	}
}