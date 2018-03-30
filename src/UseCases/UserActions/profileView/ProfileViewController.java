package UseCases.UserActions.profileView;

import java.util.*;

import JavaFxUI.ViewManager;
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
	
	private final String SUBSCRIBE = "Subscribe";
	private final String UNSUBSCRIBE = "Unsubscribe";
	
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
	private Label subMessage;
	@FXML 
	private Button editButton;	
	@FXML 
	private TextField chBio;	
	
	public User currentUser;
	public User connectedUser;
	
	public void searchUser(ActionEvent event) {
		ViewManager.goToManageUser();
	}
	
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
    		if (subscribeButton.getText().equals(UNSUBSCRIBE)) {
    			facade.unsubscribe(AbstractFacade.getUser(), currentUser);
    			subscribeButton.setText(SUBSCRIBE);
    			subMessage.setText("You're now subscribed to " + currentUser.username + " !");
    		}
    		else {
    			facade.subscribe(AbstractFacade.getUser(), currentUser);
    			subscribeButton.setText(UNSUBSCRIBE);
    			subMessage.setText("You've cancelled your subscription to " + currentUser.username + ".");
    		}
    	} catch (Exception e) 
    	{
    		// TODO Auto-generated catch block
    		System.out.println(e);
    	}
    }

    public void setUser(User user) {
    	currentUser = user;
    	userLabel.setText(currentUser.username);
    	emailLabel.setText(currentUser.email);
    	descLabel.setText(currentUser.bio);
    	if (currentUser.equals(AbstractFacade.getUser())) {
    		subscribeButton.setVisible(false);
    	}
    	else {
    		editButton.setVisible(false);
    	}
		if (FacadeProfile.getFacade().isUserSubscribed(AbstractFacade.getUser(), currentUser)) {
    		subscribeButton.setText(UNSUBSCRIBE);
    	}
    	//storiesLabel.setText()
    }
}