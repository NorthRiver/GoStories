package UseCases.AdminActions.banMenuView;


import java.util.*;

import domain.User;
import facade.FacadeBanMenu;
import facade.FacadeRename;
import JavaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

/**
 * 
 */

import javafx.event.ActionEvent;
import domain.User;


public class BanMenuController {



    private User currentUser;
    @FXML
    private Text usernameText;
    @FXML
    public Spinner numberOfDay;

    public void validate(ActionEvent event) {
    	int days = (int)numberOfDay.getValue();
    	if (days < 0) {
    		days = 2147483647;
    	}
    	FacadeBanMenu facade = FacadeBanMenu.getFacade();
    	facade.banUser(currentUser, days);
    	ViewManager.goToManageUser();
    }


    public void cancel(ActionEvent event) {
    	ViewManager.goToManageUser();
    }

    public void init(User user) {
        currentUser = user;
        usernameText.setText(currentUser.username);
    }

}