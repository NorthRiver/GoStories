package UseCases.AdminActions.manageUserView;


import java.util.*;

import domain.User;
import facade.FacadeManageUser;
import javaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * 
 */
public class ManageUserController {
	private User[] userList = null;
	
	@FXML 
    private TextField usernameField;
	@FXML 
    private Text user1;
	@FXML 
    private Text user2;
	@FXML 
    private Text user3;
	@FXML 
    private Text user4;
	@FXML 
    private Text user5;
	@FXML 
    private Text user6;
	@FXML 
    private Text user7;
	@FXML 
    private Text user8;
	@FXML 
    private Button banButton1;
	@FXML 
    private Button banButton2;
	@FXML 
    private Button banButton3;
	@FXML 
    private Button banButton4;
	@FXML 
    private Button banButton5;
	@FXML 
    private Button banButton6;
	@FXML 
    private Button banButton7;
	@FXML 
    private Button banButton8;


    public void displaySearchResult(ActionEvent event) {
    	FacadeManageUser facade = FacadeManageUser.getFacade();
    	userList = facade.getUserListByName(usernameField.getText(),0);
    	int i;
    	if(userList.length<8) {
    		i = userList.length;
    	}
    	else {
    		i = 8;
    	}
    	
    	Text[] users = {user1,user2,user3,user4,user5,user6,user7,user8};
    	Button[] bans = {banButton1,banButton2,banButton3,banButton4,banButton5,banButton6,banButton7,banButton8};
    	for(int j = 0; j<i;j++) {
    		users[j].setText(userList[j].getUsername());
    		if(userList[j].getIsBanned()) {
    			bans[j].setText("Un-ban");
    		}
    	}
    	for(int k = i-1; k<8;k++) {
    		users[k].setVisible(false);
    		bans[k].setVisible(false);
    	}
    }

    
    public void renameButton1(ActionEvent event) {
    	User user = userList[0];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton2(ActionEvent event) {
    	User user = userList[1];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton3(ActionEvent event) {
    	User user = userList[2];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton4(ActionEvent event) {
    	User user = userList[3];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton5(ActionEvent event) {
    	User user = userList[4];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton6(ActionEvent event) {
    	User user = userList[5];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton7(ActionEvent event) {
    	User user = userList[6];
    	ViewManager.goToRenameUser(user);
        return;
    }
    public void renameButton8(ActionEvent event) {
    	User user = userList[7];
    	ViewManager.goToRenameUser(user);
        return;
    }


    public void switchBanButton1(ActionEvent event) {
    	User user = userList[0];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton2(ActionEvent event) {
    	User user = userList[1];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton3(ActionEvent event) {
    	User user = userList[2];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton4(ActionEvent event) {
    	User user = userList[3];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton5(ActionEvent event) {
    	User user = userList[4];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton6(ActionEvent event) {
    	User user = userList[5];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton7(ActionEvent event) {
    	User user = userList[6];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }
    public void switchBanButton8(ActionEvent event) {
    	User user = userList[7];
    	if(user.getIsBanned()){
    		FacadeManageUser facade = FacadeManageUser.getFacade();
    		facade.unBanUser(user);
    	}
    	else {
    		ViewManager.goToBanUser(user);
        }
    }


    public void init() {
    	FacadeManageUser facade = FacadeManageUser.getFacade();
    	userList = facade.getUserList(0);
    	int i;
    	if(userList.length<8) {
    		i = userList.length;
    	}
    	else {
    		i = 8;
    	}
    	
    	Text[] users = {user1,user2,user3,user4,user5,user6,user7,user8};
    	Button[] bans = {banButton1,banButton2,banButton3,banButton4,banButton5,banButton6,banButton7,banButton8};
    	for(int j = 0; j<i;j++) {
    		users[j].setText(userList[j].getUsername());
    		if(userList[j].getIsBanned()) {
    			bans[j].setText("Un-ban");
    		}
    	}
    	for(int k = i-1; k<8;k++) {
    		users[k].setVisible(false);
    		bans[k].setVisible(false);
    	}
    }

}