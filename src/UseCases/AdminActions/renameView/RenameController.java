package UseCases.AdminActions.renameView;

import java.util.*;

import domain.User;
import facade.FacadeManageUser;
import facade.FacadeRename;
import JavaFxUI.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * 
 */
public class RenameController {


    public User currentUser;
    
    @FXML
    public TextField newName;
    @FXML
    private Text usernameText;


    public void init(User user) {
        currentUser = user;
        newName.setText(currentUser.username);
        usernameText.setText(currentUser.username);
        return;
    }


    public void validate(ActionEvent event) {
    	FacadeRename facade = FacadeRename.getFacade();
    	facade.renameUser(currentUser, newName.getText());
    	ViewManager.goToManageUser();
        return;
    }


    public void cancel(ActionEvent event) {
    	ViewManager.goToManageUser();
        return;
    }

}