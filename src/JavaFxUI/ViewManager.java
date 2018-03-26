package javaFxUI;

import java.util.*;

import DAO.FactoryDAO;
import UseCases.UserActions.loginView.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 */
public class ViewManager extends Application {

	public static void main(String[] args) {
		FactoryDAO.create("PSQL");
        Application.launch(ViewManager.class, args);

    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Login");
		
		AnchorPane root = new AnchorPane();
		Scene scene = new LoginView(root,300, 300);
		primaryStage.setScene(scene);
        primaryStage.show();
		
	}

    /**
     * @return
     */
    public static void goToLogin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static void goToForgetPassword() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static void gotToRegister() {
        // TODO implement here
        return null;
    }

    /**
     * @param page
     */
    public static void goToReport(Page page) {
        // TODO implement here
    }

    /**
     * @return
     */
    public static void goToReadReport() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static void goToManageStories() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static void gotToManageUser() {
        // TODO implement here
        return null;
    }

    /**
     * @param page 
     * @param story
     */
    public static void goToStoryPage(Page page, Story story) {
        // TODO implement here
    }

    /**
     * 
     */
    public static void goToHome() {
        // TODO implement here
    }

    /**
     * @param story
     */
    public static void goToComment(Story story) {
        // TODO implement here
    }

    /**
     * @param story 
     * @param player
     */
    public static void goToBuy(Story story, User player) {
        // TODO implement here
    }

    /**
     * @param story
     */
    public static void goToStoryInfo(Story story) {
        // TODO implement here
    }

    /**
     * @param user
     */
    public static void goToUserProfile(User user) {
        // TODO implement here
    }

}