package JavaFxUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginView extends Application {

    public static void main(String[] args) {

        Application.launch(LoginView.class, args);

    }

    



	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Login");
		 Group root = new Group();

	        Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);
            
	    
	        
	        
	        Button btnLogin = new Button();
	        Button btnRegister = new Button();
	        Button btnRecover = new Button();
	        
	        btnRegister.setLayoutX(50);
	        btnRegister.setLayoutY(180);
	        
	        btnRecover.setLayoutX(160);
	        btnRecover.setLayoutY(180);

	        btnLogin.setLayoutX(120);
	        btnLogin.setLayoutY(130);

	        btnLogin.setText("Login");
	        btnRegister.setText("Register");
	        btnRecover.setText("Recover" +"\n"+"Password");
	        

	        btnLogin.setOnAction(new EventHandler<ActionEvent>() {


	            public void handle(ActionEvent event) {

	                System.out.println("Login");

	            }

	        });
	        
	        btnRegister.setOnAction(new EventHandler<ActionEvent>() {


	            public void handle(ActionEvent event) {

	                System.out.println("Register");

	            }

	        });
	        
	        btnRecover.setOnAction(new EventHandler<ActionEvent>() {


	            public void handle(ActionEvent event) {

	                System.out.println("Recover Password");

	            }

	        });

	        root.getChildren().add(btnLogin);    
	        root.getChildren().add(btnRegister);
	        root.getChildren().add(btnRecover);  

	        primaryStage.setScene(scene);
	        primaryStage.show();
	}

}
