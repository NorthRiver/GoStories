package UseCases.AdminActions.banMenuView;


import java.util.*;

import domain.User;
import facade.FacadeBanMenu;
import facade.FacadeRename;
import javaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
    public TextField numberOfDay;

    public void validate(ActionEvent event) {
    	FacadeBanMenu facade = FacadeBanMenu.getFacade();
    	//facade.;
    	ViewManager.gotToManageUser();
        return;
    }


    public void cancel(ActionEvent event) {
    	ViewManager.gotToManageUser();
        return;
    }

    public void init(User user) {
        currentUser = user;
        usernameText.setText(currentUser.username);
        return;
    }

}