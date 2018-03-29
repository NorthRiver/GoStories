package UseCases.UserActions.profileView;

import java.util.*;

import domain.User;
import facade.FacadeLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProfileViewController {

    public ProfileViewController() {
    	@FXML 
    	private TextField usernameText;
    	@FXML 
    	private TextField pswdText;
    	public void login(ActionEvent event) {
    		FacadeLogin facade = FacadeLogin.getFacade();
    		try {
    			User moi = facade.login(usernameText.getText(), pswdText.getText());
    			System.out.println(moi);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			System.out.println(e);
    		}
    }

    public void editProfile(ActionEvent event) {
  
    }

    public void subscribe(ActionEvent event) {
  
    }

}