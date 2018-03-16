package JavaFxUI;

import javafx.event.*;
import domain.User;
import facades.FacadeLogin;

public class LoginController {
	public void login(ActionEvent event) {
		FacadeLogin facade = FacadeLogin.getFacadeLogin();
		try {
			User moi = facade.login("josuke", "zeub");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
