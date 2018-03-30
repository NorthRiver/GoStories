package UseCases.AdminActions.manageUserView;


import java.util.*;

import domain.User;
import facade.FacadeManageUser;
import JavaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * 
 */
public class ManageUserController {
	@FXML TextField usernameField;
	@FXML VBox userListVbox;
	
	public void init() {
    	FacadeManageUser facade = FacadeManageUser.getFacade();
    	Set<User> users = facade.getUserList(10, 0);
    	setUserList(users);
    }
	
	public void setUserList(Set<User> users) {
		userListVbox.getChildren().clear();
		HBox newHbox;
		Label usernameLabel;
		Button renameButton;
		Button banButton;
		for(User user : users) {
			newHbox= new HBox();
			newHbox.setAlignment(Pos.TOP_LEFT);
			usernameLabel = new Label(user.username);
			banButton = new Button("Ban");
			banButton.setOnAction(new BanHandler(user));
			renameButton = new Button("Rename");
			renameButton.setOnAction(new RenameHandler(user)); 
			newHbox.getChildren().add(usernameLabel);
			newHbox.getChildren().add(renameButton);
			newHbox.getChildren().add(banButton);
			newHbox.setSpacing(20);
			userListVbox.getChildren().add(newHbox);
		}
		userListVbox.layout();
	}
	
    public void displaySearchResult(ActionEvent event) {
    	FacadeManageUser facade = FacadeManageUser.getFacade();
		Set<User> users = facade.getUserListByName(usernameField.getText(), 10, 0);
    	setUserList(users);
    }

    class RenameHandler implements EventHandler<ActionEvent>{
    	User user;
    	RenameHandler(User user){
    		this.user = user;
    	}
		@Override
		public void handle(ActionEvent event) {
			ViewManager.goToRenameUser(user);
		}
    	
    }
    class BanHandler implements EventHandler<ActionEvent>{
    	User user;
    	BanHandler(User user){
    		this.user = user;
    	}
		@Override
		public void handle(ActionEvent event) {
			if(user.getIsBanned()){
	    		FacadeManageUser facade = FacadeManageUser.getFacade();
	    		facade.unBanUser(user);
	    	}
	    	else {
	    		ViewManager.goToBanUser(user);
	        }
		}
    	
    }
}