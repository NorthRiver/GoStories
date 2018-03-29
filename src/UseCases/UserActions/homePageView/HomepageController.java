package UseCases.UserActions.homePageView;

import java.util.*;

import JavaFxUI.ViewManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.event.ActionEvent;


public class HomepageController {

    public HomepageController() {
    }

    public void searchProfile(ActionEvent event) {
        
    }

    public void readReports(ActionEvent event) {
    	ViewManager.goToReadReport();
    }

}