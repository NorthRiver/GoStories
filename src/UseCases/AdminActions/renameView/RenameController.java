package UseCases.AdminActions.renameView;

import java.util.*;

import domain.User;
import javaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * 
 */
public class RenameController {


    public User currentUser;
    
    @FXML
    public TextField newName;


    public void init(User user) {
        currentUser = user;
        newName.setText(currentUser.username);
        return;
    }


    public void validate(ActionEvent event) {
        // TODO implement here
        return;
    }


    public void cancel(ActionEvent event) {
    	ViewManager.gotToManageUser();
        return;
    }

}