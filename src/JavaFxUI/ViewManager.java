package JavaFxUI;

import java.util.*;

import DAO.FactoryDAO;
import UseCases.AdminActions.banMenuView.BanMenuView;
import UseCases.AdminActions.manageUserView.ManageUserView;
import UseCases.AdminActions.renameView.RenameView;
import UseCases.PlayerActions.reportView.ReportView;
import UseCases.PlayerActions.storyInfoView.StoryInfoView;
import UseCases.UserActions.forgotPasswordView.ForgotPasswordView;
import UseCases.UserActions.homePageView.HomepageView;
import UseCases.UserActions.loginView.LoginView;
import UseCases.UserActions.profileView.ProfileView;
import UseCases.UserActions.registerView.RegisterView;
import domain.Page;
import domain.Story;
import domain.User;
import facade.AbstractFacade;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 */
public class ViewManager extends Application {
	private static Stage mainStage;
	
	public static void main(String[] args) {
		FactoryDAO.create("PSQL");
        Application.launch(ViewManager.class, args);

    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		goToLogin();
		
		/******************** TESTING ZONES ********************/
		/******************** Data Fetching ********************/
//		Story story = FactoryDAO.getFactory().getStoryDAO().getStoryByName("demoStory");
//		User user = FactoryDAO.getFactory().getUserDAO().findUserByUsername("demoUser");
//		User author = FactoryDAO.getFactory().getUserDAO().findUserByUsername("demoAuthor");
//		User admin = FactoryDAO.getFactory().getUserDAO().findUserByUsername("demoAdmin");
//		AbstractFacade.setUser(admin);
		
		
		/******************** view loading ********************/
//		goToStoryInfo(story);
//		goToHome();
	}

    /**
     * @return
     */
    public static void goToLogin() {
    	mainStage.setTitle("Login");
    	AnchorPane root = new AnchorPane();
		Scene scene = new LoginView(root,300, 300);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

    /**
     * @return
     */
    public static void goToForgotPassword() {
    	mainStage.setTitle("Forgot Password");
    	AnchorPane root = new AnchorPane();
		Scene scene = new ForgotPasswordView(root,300, 300);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

    /**
     * @return
     */
    public static void gotToRegister() {
    	mainStage.setTitle("Register");
    	AnchorPane root = new AnchorPane();
		Scene scene = new RegisterView(root,300, 300);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

    /**
     * @param page
     */
    public static void goToReport(Page page) {
    	mainStage.setTitle("Report");
    	AnchorPane root = new AnchorPane();
		Scene scene = new ReportView(root,300, 300);
		((ReportView)scene).init(page);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

    /**
     * @return
     */
    public static void goToReadReport() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public static void goToManageStories() {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public static void gotToManageUser() {
    	mainStage.setTitle("Manage User");
    	AnchorPane root = new AnchorPane();
		Scene scene = new ManageUserView(root,400, 600);
		((ManageUserView)scene).init();
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }
    public static void goToRenameUser(User user) {
    	mainStage.setTitle("Rename User");
    	AnchorPane root = new AnchorPane();
		Scene scene = new RenameView(root,400, 600);
		((RenameView)scene).init(user);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }
    public static void goToBanUser(User user) {
    	mainStage.setTitle("Ban User");
    	AnchorPane root = new AnchorPane();
		Scene scene = new BanMenuView(root,400, 600);
		((BanMenuView)scene).init(user);
		mainStage.setScene(scene);
        mainStage.show();
        return;
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
    	mainStage.setTitle("Welcome");
    	AnchorPane root = new AnchorPane();
		Scene scene = new HomepageView(root,600, 400);
		((HomepageView)scene).init();
		mainStage.setScene(scene);
        mainStage.show();
        return;
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
    	mainStage.setTitle(story.title);
    	AnchorPane root = new AnchorPane();
		Scene scene = new StoryInfoView(root, 600.0, 400.0);
		((StoryInfoView)scene).init(story);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

    /**
     * @param user
     */
    public static void goToUserProfile(User user) {
    	mainStage.setTitle("User Profile");
    	AnchorPane root = new AnchorPane();
		Scene scene = new LoginView(root,400, 600);
		((ProfileView)scene).init(user);
		mainStage.setScene(scene);
        mainStage.show();
        return;
    }

}