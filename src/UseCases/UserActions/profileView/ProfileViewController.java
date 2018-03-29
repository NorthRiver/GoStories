package UseCases.UserActions.profileView;

import java.util.*;

import domain.User;
import facade.AbstractFacade;
import facade.FacadeManageUser;
import facade.FacadeProfile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
	private Button subscribeButton;	
	
	@FXML 
	private TextField chBio;	
	
	public User currentUser;
	public User connectedUser;
	
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
    		if (subscribeButton.getText() == "Unsubscribe") {
    			facade.subscribe(currentUser, AbstractFacade.getUser());
    			subscribeButton.setText("Subscribe");
    		}
    		else {
    			facade.subscribe(currentUser, AbstractFacade.getUser());
    			subscribeButton.setText("Unsubscribe");
    		}
    	} catch (Exception e) 
    	{
    		// TODO Auto-generated catch block
    		System.out.println(e);
    	}
    }

    public void init(User user) {
    	currentUser = user;
    	userLabel.setText(currentUser.username);
    	emailLabel.setText(currentUser.email);
    	descLabel.setText(currentUser.bio);
    	FacadeProfile facade = FacadeProfile.getFacade();
		if (facade.isUserSubscribed(currentUser, AbstractFacade.getUser())) {
    		subscribeButton.setText("Unsubscribe");
    		
    	}
    	//storiesLabel.setText()
    }
}