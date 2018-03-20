package JavaFxUI;

import DAO.FactoryDAO;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
}
