package JavaFxUI;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

public class ViewManager extends Application {
	public static void main(String[] args) {

        Application.launch(ViewManager.class, args);

    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Login");
		
		Group root = new Group();
		Scene scene = new LoginView(root,300, 300);
		primaryStage.setScene(scene);
        primaryStage.show();
		
	}
}
