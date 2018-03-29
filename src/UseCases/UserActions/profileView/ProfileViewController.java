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
	
   

    public void editBio(ActionEvent event) {
  
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