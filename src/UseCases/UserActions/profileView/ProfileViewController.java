package UseCases.UserActions.profileView;

import java.util.*;

import domain.User;
import facade.FacadeProfile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProfileViewController {
	@FXML 
	private Label userLabel;
	@FXML 
	private Label emailLabel;
	@FXML 
	private Label descLabel;
	@FXML 
	private Label storiesLabel;	
	
	@FXML 
	private TextField chBio;	
	
	public User currentUser;

    public void editBio(ActionEvent event) {
    	descLabel.setText(chBio.getText());
    	FacadeProfile facade = FacadeProfile.getFacade();
    	try {
    		facade.editBio(descLabel.getText(), currentUser);
    	} catch (Exception e) 
    	{
    		// TODO Auto-generated catch block
    		System.out.println(e);
    	}
    }

    public void subscribe(ActionEvent event) {
    	FacadeProfile facade = FacadeProfile.getFacade();
    	try {
    	
    	} catch (Exception e) 
    	{
    		// TODO Auto-generated catch block
    		System.out.println(e);
    	}
    }

}